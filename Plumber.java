//Dakota Jackson
public class Plumber extends Maintenance {

	//variable for the amount of toilets the plumber has cleaned
	protected int toiletsCleaned;
	
	//default no-arg constructor for Plumber
	public Plumber() {
		super();
		
		this.toiletsCleaned = 0;
	}
	
	//Plumber constructor that takes in variables for id, jobTitle, name, and years practiced medicine
	public Plumber (int id, String jobTitle, String name, int toiletsCleaned) {
		super(id, jobTitle, name);
		
		this.toiletsCleaned = toiletsCleaned;
	}
	
	//Plumber message is printed out through the toString() method
		public String toString() {
			return name + " is a(n) " + jobTitle + " and their badge # is: " + id + ". " + name + " has cleaned a total of " + toiletsCleaned + " toilets in their career.";
		}
}

