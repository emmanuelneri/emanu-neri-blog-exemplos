package br.com.emanu.neri.blog.hibernate.criteria;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class CriteriaBasica {
	
	// injetando entityManager com as configurações do persistence.xml
	@PersistenceContext(unitName = "HibernateExemplosPU") 
	private EntityManager entityManager;                  
	
	/*
	 * Consulta = Select * from entidade
	 */
	@SuppressWarnings("unchecked")
	public List<Entidade> criteriaBasica() {
		// cria uma sessão do hibernate a partir do entityManager
		Session session = (Session) this.entityManager.getDelegate(); 
		
		//A sessão do Hibernate possui o método createCriateria , que retorna
		// uma critéria da entidade que voce deseja fazer a consulta
		Criteria criteria = session.createCriteria(Entidade.class);
		return criteria.list();  
	}
	
	/*
	 * Consulta = Select * from entidade where id = 1
	 */
	@SuppressWarnings("unchecked")
	public List<Entidade> criteriaBuscarPorId() {
		Session session = (Session) this.entityManager.getDelegate(); 
		Criteria criteria = session.createCriteria(Entidade.class);
		
		// cria uma restrição (where no sql) que seja igual ao valor vindo por parametro; 
		criteria.add(Restrictions.eq("id", 1L));
		return criteria.list();  
	}

}
