//Dakota Jackson
public class Testing {

	public static void main(String[] args) {
		
		//Creates objects and prints out for every different type of employee
		Employees employee2 = new Employees(5498, "receptionist", "Jill");
		
	
		System.out.println(employee2.toString());
		
		
		Administration administration2 = new Administration(8752, "Administrator", "Janet", 7963);
		
		
		System.out.println(administration2.toString());
		
		
		Administrator administrator = new Administrator(7777, "Administrator", "Ross", 6547);
	
		System.out.println(administrator.toString());
		
		Receptionist receptionist = new Receptionist(8959, "Receptionist", "Bill", 5556);
	
		System.out.println(receptionist.toString());
		
		MedicalExaminers medicalExaminer = new MedicalExaminers(4536, "Examiner", "Josh", 5);
		
		System.out.println(medicalExaminer.toString());
		
		Doctor doctor = new Doctor(9999, "Doctor", "Harris", 5, "General Care");
		
		System.out.println(doctor.toString());
		
		Surgeon surgeon = new Surgeon(6768, "Surgeon", "Holly", 7, "Heart Care");
		
		System.out.println(surgeon.toString());
		
		Nurse nurse = new Nurse(1546, "Nurse", "Tommy", 2, "Head Nurse");
		
		System.out.println(nurse.toString());

		Maintenance maintenance = new Maintenance(6578, "Maintence", "Greg");
		
		System.out.println(maintenance.toString());
		
		Plumber plumber = new Plumber(7590, "Plumber", "Ted", 69);
		
		System.out.println(plumber.toString());
		
		Janitor janitor = new Janitor(0067, "Janitor", "Janice", "good");
		
		System.out.println(janitor.toString());
				
		
		
		//
		
	}

}
