//Dakota Jackson
public class Administration extends Employees {

	//adds extension number variable as it is needed for those in these fields
	protected int extension;
	
	//default Administration constructor
	public Administration() {
		super();
		
		this.extension = 1234;
		
	}
	
	//Constructor for Administration that takes in variables for id, job title, name, and extension
	public Administration(int id, String jobTitle, String name, int extension) {
		super(id, jobTitle, name);
		
		this.extension = extension; 
	}
	
	//toString method that prints out message specific to those in Administration fields
	public String toString() {
		return name + " is a(n) " + jobTitle + " and their badge # is: " + id + ". You can reach them at extension-number: " + extension; 
	}
}
