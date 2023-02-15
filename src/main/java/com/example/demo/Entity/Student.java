package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Id;

@Data
@Entity
@Table(name="tb3_records")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	@Column
	private String Firstname;
	@Column
	private String Lastname;
	@Column
	private String City;
	@Column
	private String  Subject;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", City=" + City
				+ ", Subject=" + Subject + "]";
	}
}