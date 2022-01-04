//Dakota Jackson
public class Receptionist extends Administration {

	//default constructor for Receptionist
	public Receptionist () {
		super();
	}
	
	//Receptionist constructor that takes in variables for id, job title, name, and extension
	public Receptionist (int id, String jobTitle, String name, int extension) {
		super(id, jobTitle, name, extension);
	}
	
	//personalized receptionist message is printed out through the toString() method
	public String toString() {
		return name + " is a(n) " + jobTitle + " and their badge # is: " + id + ". " + name + " would be happy to take your call at extension-number: " + extension;
	}
}
