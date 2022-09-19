package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.person;



public class Persondao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("Yash");
	
	public  void savePerson(person p)
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(p);
		et.commit();
		System.out.println("Data saved");
	}
}
