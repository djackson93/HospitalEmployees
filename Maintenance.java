//Dakota Jackson
public class Maintenance extends Employees{
	
	//default no-arg constructor for Maintenance
	public Maintenance() {
		super();
	}
	
	//Maintenance constructor that takes in variables for id, jobTitle, name, and years practiced medicine
	public Maintenance (int id, String jobTitle, String name) {
		super(id, jobTitle, name);
	}
	
	//Maintenance message is printed out through the toString() method
		public String toString() {
			return name + " is a(n) " + jobTitle + " and their badge # is: " + id + ". " + name + " is an experienced handyman.";
		}
}

