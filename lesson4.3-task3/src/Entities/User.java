package Entities;

import java.time.LocalDate;

public class User {
	private int id;
	private String fName,lName,nationalityId;
	private LocalDate dateOfBirth;
	
	public User() {
		
	}
	
	public User(int id, String firstname, String lastName, String naionalityId, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.fName = firstname;
		this.lName = lastName;
		this.nationalityId = naionalityId;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
