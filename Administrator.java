//Dakota Jackson
public class Administrator extends Administration {

	//default Administrator constructor
	public Administrator () {
		super();
	}
	
	//Administrator constructor that takes in variables for id, job title, name, and extension
	public Administrator (int id, String jobTitle, String name, int extension) {
		super(id, jobTitle, name, extension);
	}
	
	//personalized Administrator message is printed out through the toString() method
	public String toString() {
		return name + " is a(n) " + jobTitle + " and their badge # is: " + id + ". " + name + "'s extention is: " + extension + ". They are in charge of overseeing the hospital.";
	}
}

