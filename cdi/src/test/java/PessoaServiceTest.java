import br.com.emmanuelneri.blog.model.Pessoa;
import br.com.emmanuelneri.blog.service.PessoaService;
import br.com.emmanuelneri.blog.util.EntityManagerProducer;
import br.com.emmanuelneri.blog.util.GenericService;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.assertNotNull;

@RunWith(Arquillian.class)
public class PessoaServiceTest {

    @Deployment
    public static WebArchive createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "cdi.war")
                .addPackage(EntityManagerProducer.class.getPackage())
                .addPackage(GenericService.class.getPackage())
                .addPackage(PessoaService.class.getPackage())
                .addPackage(Pessoa.class.getPackage())
                .addAsResource("META-INF/persistence.xml")
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Inject
    private PessoaService pessoaService;

    @Test
    public void injectPessoaServiceTeste() {
        assertNotNull(pessoaService);
    }

    @Test
    public void savePessoaTest() {
        Pessoa pessoa = new Pessoa("Pessoa 1");

        pessoaService.salvar(pessoa);

        assertNotNull(pessoa.getId());
    }

}
