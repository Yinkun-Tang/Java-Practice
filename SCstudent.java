package hw2;

public class SCstudent extends Student{
	private String Category;
	private String Major;
	
	public SCstudent(int StudentID, String firstname, String lastname, int age, int credithour, 
			String category, String major) {
		super(StudentID, firstname, lastname, age, credithour);
		
		switch(category) {
		case "C":
			Category = "Certificate student";
			break;
		case "S":
			Category = "Senior citizen";
			break;
		default:
			Category = "Invalid";
			break;
		}
		
		if(Category.equals("Certificate student")) {
			switch (major) {
			case "S":
				Major = "gaming Science";
				break;
			case "M":
				Major = "hotel Management";
				break;
			case "A":
				Major = "lounge Arts";
				break;
			case "E":
				Major = "beverage Engineering";
				break;
			default:
				Major = "Invalid";
				break;
			}
		}
	}
	
	public void printData() {
		System.out.println("ID number: " + SID);
		System.out.println("Name:      " + FirstName + " " + LastName);
		System.out.println("Age:       " + Age);
		
		System.out.println("\n");
		
		System.out.println(FirstName + " is a " + Category + " enrolled in " + CreditHour + " credits");
		if(Category.equals("Certificate student")) {
			System.out.println(FirstName + "'s major is " + Major);
		}
	}
	
	public int computeFees() {
		int ComputationResult;
		switch(Category) {
		case "Certificate student":
			ComputationResult = 700 + 300 * CreditHour;
			break;
		case "Senior citizen":
			if(CreditHour <= 6) {
				ComputationResult = 100;
			} else {
				ComputationResult = 100 + 50 *  (CreditHour - 6);
			}
			break;
		default:
			ComputationResult = 0;
			break;
		}
		return ComputationResult;
	}
	
	public String GetCategory() {
		return Category;
	}
}
