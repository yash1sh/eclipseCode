package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity
public class person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NeverNull
private int id;
	@NeverNull
private String name;
	@NeverNull
private int age;
	
	@OneToOne
	adhar adhar;
	public adhar getAdhar() {
		return adhar;
	}
	public void setAdhar(adhar adhar) {
		this.adhar = adhar;
	}




public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


}
