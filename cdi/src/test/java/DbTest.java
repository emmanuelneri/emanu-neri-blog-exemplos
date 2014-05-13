import br.com.emmanuelneri.blog.model.Pessoa;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import static org.junit.Assert.assertNotNull;

@RunWith(Arquillian.class)
public class DbTest {

    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "cdi.war")
                .addPackage(Pessoa.class.getPackage())
                .addAsResource("META-INF/persistence.xml")
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @PersistenceContext(unitName = "cdiPU")
    private EntityManager entityManager;

    @Inject
    UserTransaction utx;

    @Test
    public void persistTest() throws SystemException, NotSupportedException, HeuristicRollbackException, HeuristicMixedException, RollbackException {
        Pessoa pessoa = new Pessoa("Pessoa 1");

        utx.begin();
        entityManager.joinTransaction();
        entityManager.persist(pessoa);
        utx.commit();
        entityManager.clear();

        assertNotNull(pessoa.getId());
    }

}
