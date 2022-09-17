package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dto.adhar;
import dto.person;

public class TestDeletePersonAndAadha {

public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Yash");
		EntityManager em=emf.createEntityManager();
		
		person p=em.find(person.class,2);
		
		adhar a=p.getAdhar();
		
		em.getTransaction().begin();
		em.remove(p);
		em.remove(a);
		em.getTransaction().commit();

	}

}

