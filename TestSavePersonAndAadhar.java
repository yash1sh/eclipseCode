package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dto.adhar;
import dto.person;

public class TestSavePersonAndAadhar {
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Yash");
	EntityManager em=emf.createEntityManager();
	
	person p=new person();
	p.setId(2);
	p.setName("skjbdsjbds");
	p.setAge(20);
	
	adhar a=new adhar();
	a.setId(2);;
	a.setFathername("jbkdbjhsd");
	a.setNumber(94786846);
	
	p.setAdhar(a);
	a.setP(p);
	
	em.getTransaction().begin();
	em.persist(p);
	em.persist(a);
	em.getTransaction().commit();
	}
}
