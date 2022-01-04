//Dakota Jackson
public class MedicalExaminers extends Employees {

	//variable for the amount of experience the medical examiner has
	protected int yearsPracticed;
	
	//default no-arg constructor for MedicalExaminers
	public MedicalExaminers() {
		super();
		
		this.yearsPracticed = 1;
	}
	
	//MedicalExaminer constructor that takes in variables for id, jobTitle, name, and years practiced medicine
	public MedicalExaminers (int id, String jobTitle, String name, int yearsPracticed) {
		super(id, jobTitle, name);
		
		this.yearsPracticed = yearsPracticed;
	}
	
	//Medical Examiner message is printed out through the toString() method
		public String toString() {
			return name + " is a(n) " + jobTitle + " and their badge # is: " + id + ". " + name + " has been in the medical field for " + yearsPracticed + " years.";
		}
}
