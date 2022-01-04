//Dakota Jackson
public class Employees {

	//Data variables for hospital employees
	protected String name;
	protected int id;
	protected String jobTitle;
	
	//A default constructor for employees
	public Employees() {
		
		this.name = "bob";
		this.id = 0000;
		this.jobTitle = "Hospital Employee";
	}
	
	//constructor that takes in an id variable for an employee id and a jobTitle variable for the specific occupation
	public Employees(int id, String jobTitle, String name) {
		
		this.name = name;
		this.id = id;
		this.jobTitle = jobTitle;
	}
	
	//accesor and mutator method for id and jobtitle
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	//toString method for Employees
	public String toString() {
		return name + " is a(n) " + jobTitle + " and their badge # is: " + id;
	}
}
