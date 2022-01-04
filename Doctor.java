//Dakota Jackson
public class Doctor extends MedicalExaminers{

	//variable for the type of doctor
		protected String type;
		
		//default no-arg constructor for Doctor
		public Doctor () {
			super();
			
			this.type = "General Care";
		}
		
		//Doctor constructor that takes in variables for id, jobTitle, name, and years practiced medicine
		public Doctor (int id, String jobTitle, String name, int yearsPracticed, String type) {
			super(id, jobTitle, name, yearsPracticed);
			
			this.type = type;
		}
		
		//Doctor message is printed out through the toString() method
			public String toString() {
				return name + " is a(n) " + jobTitle + " and their badge # is: " + id + ". " + name + " has been practicing " + type + " for " + yearsPracticed + " years.";
			}
	
}
