package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.bytebuddy.utility.nullability.NeverNull;

@Entity

public class adhar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NeverNull
	private int id;
	@NeverNull
	private String fathername;
	@NeverNull
	private long number;

public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
}
