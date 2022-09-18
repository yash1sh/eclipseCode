package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dto.adhar;
import dto.person;

public class TestUpdatePersonAndAadhar {
public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Yash");
		EntityManager em=emf.createEntityManager();
		
		person p=em.find(person.class,2);
		p.setAge(23);
		p.setName("hakjsvshasas");
		
		adhar a=em.find(adhar.class,2);
		a.setFathername("assadfadfad");
		a.setNumber(649474849);
		
		em.getTransaction().begin();
		em.merge(p);
		em.merge(a);
		em.getTransaction().commit();

	}


}
