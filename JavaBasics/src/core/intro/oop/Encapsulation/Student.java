package core.intro.oop.Encapsulation;

public class Student {

	private int id;
	private String fName;
	private String lName;
	private String email;

	public void setId(int id) {
		this.id = id;

	}

	public int getId() {
		return this.id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + "]";
	}

}
