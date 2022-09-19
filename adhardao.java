package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.adhar;

public class adhardao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Yash");
public void saveAdhar(adhar a)
{
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	et.begin();
	em.persist(a);
	et.commit();
	System.out.println("Data saved");
}
}
