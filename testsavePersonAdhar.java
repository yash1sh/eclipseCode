package controller;


import dao.Persondao;
import dao.adhardao;
import dto.adhar;
import dto.person;

public class testsavePersonAdhar {
	public static void main(String[] args) {
	
		
		person p = new person();
		p.setAge(12);
		p.setName("Yash");
		adhar a= new adhar();
		a.setFathername("jsvhjhssas");
		a.setNumber(23232323);
		p.setAdhar(a);
		Persondao dao=new Persondao();
		adhardao daoa=new adhardao();
		daoa.saveAdhar(a);
		dao.savePerson(p);
		
	}
}
