package entity;

public class Instructor extends User {

	private String about;
	
	public Instructor() {
		
	}
	
	public Instructor(long id, String fName, String lName, String eMail, String username, String password,String about) {
		super(id,fName,lName,eMail,username,password);
		this.about=about;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
}
