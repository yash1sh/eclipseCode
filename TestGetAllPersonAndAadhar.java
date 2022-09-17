package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.adhar;
import dto.person;

public class TestGetAllPersonAndAadhar {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Yash");
		EntityManager em=emf.createEntityManager();
		
		Query query=em.createQuery("select p from person p");
		
		List<person>list=query.getResultList();
		
		for(person p:list)
		{
			System.out.println("============================================");
			System.out.println("Person id:"+p.getId());
			System.out.println("Person name:"+p.getName());
			System.out.println("Person age:"+p.getAge());
			System.out.println("============================================");
		}
		
		Query query1=em.createQuery("select a from aadhar a");
		
		List<adhar>list2=query1.getResultList();
		
		for(adhar a:list2)
		{
			System.out.println("============================================");
			System.out.println("aadhar id:"+a.getId());
			System.out.println("aadhar FatherName:"+a.getFathername());
			System.out.println("aadhar number:"+a.getNumber());
			System.out.println("============================================");
		}
	}

}

