package com.java.lesson4.assignment2.Entities;

import java.time.LocalDate;
import java.util.Date;

import com.java.lesson4.assignment2.Abstract.IEntity;

public class Customer implements IEntity{

	private int id;
	private String firstname,lastName,NaionalityId;
	private LocalDate DateOfBirth;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstname, String lastName, String naionalityId, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		NaionalityId = naionalityId;
		DateOfBirth = dateOfBirth;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNaionalityId() {
		return NaionalityId;
	}


	public void setNaionalityId(String naionalityId) {
		NaionalityId = naionalityId;
	}


	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	
}
