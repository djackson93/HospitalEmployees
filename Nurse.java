//Dakota Jackson
public class Nurse extends MedicalExaminers {


	//variable for the amount of experience the medical examiner has
		protected String nurseKind;
		
		//default no-arg constructor for Nurse
		public Nurse () {
			super();
			
			this.nurseKind = "general";
		}
		
		//Nurse constructor that takes in variables for id, jobTitle, name, and nurseKind
		public Nurse (int id, String jobTitle, String name, int yearsPracticed, String nurseKind) {
			super(id, jobTitle, name, yearsPracticed);
			
			this.nurseKind = nurseKind;
		}
		
		//Nurse message is printed out through the toString() method
			public String toString() {
				return name + " is a(n) " + jobTitle + " and their badge # is: " + id + ". " + name + " has been a " + nurseKind + " nurse for " + yearsPracticed + " years.";
			}
}
