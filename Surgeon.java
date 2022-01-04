//Dakota Jackson
public class Surgeon extends Doctor {
	
		
		//default no-arg constructor for Surgeon
		public Surgeon () {
			super();
			
			this.type = "Surgeon";
		}
		
		//Surgeon constructor that takes in variables for id, jobTitle, name, and years practiced medicine
		public Surgeon (int id, String jobTitle, String name, int yearsPracticed, String type) {
			super(id, jobTitle, name, yearsPracticed, type);
		
		}
		
		//Doctor message is printed out through the toString() method
			public String toString() {
				return name + " is a(n) " + jobTitle + " and their badge # is: " + id + ". " + name + " has been practicing " + type + " for " + yearsPracticed + " years.";
			}
	
}

