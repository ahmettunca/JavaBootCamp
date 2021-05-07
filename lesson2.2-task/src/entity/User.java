package entity;

public class User {
	
	private long id;
	private String fName;
	private String lName;
	private String eMail;
	private String username;
	private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(long id, String fName, String lName, String eMail, String username, String password) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.eMail = eMail;
		this.username = username;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
