//Dakota Jackson
public class Janitor extends Maintenance{

	//variable to see set how good the Janitor is
		protected String degreeOfWork;
		
		//default no-arg constructor for Plumber
		public Janitor() {
			super();
			
			this.degreeOfWork = "okay";
		}
		
		//Janitor constructor that takes in variables for id, jobTitle, name, and years practiced medicine
		public Janitor (int id, String jobTitle, String name, String degreeOfWork) {
			super(id, jobTitle, name);
			
			this.degreeOfWork = degreeOfWork;
		}
		
		//Janitor message is printed out through the toString() method
			public String toString() {
				return name + " is a(n) " + jobTitle + " and their badge # is: " + id + ". " + name + " is a(n) " + degreeOfWork + " janitor.";
			}
	}


