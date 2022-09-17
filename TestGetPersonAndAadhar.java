package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dto.person;

public class TestGetPersonAndAadhar {
	public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Yash");
	EntityManager em=emf.createEntityManager();
	person p=em.find(person.class, 1);
	if(p!=null)
	{
		System.out.println("============================================");
		System.out.println("Person id:"+p.getId());
		System.out.println("Person name:"+p.getName());
		System.out.println("Person age:"+p.getAge());
		System.out.println();
		System.out.println("aadhar id:"+p.getAdhar().getId());
		System.out.println("aadhar FatherName:"+p.getAdhar().getFathername());
		System.out.println("aadhar number:"+p.getAdhar().getNumber());
		System.out.println("============================================");
	
	}
}
}
