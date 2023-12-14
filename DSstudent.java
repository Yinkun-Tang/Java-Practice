package hw2;

public class DSstudent extends Student{
	private String Major;
	private String AcademicStanding;
	private String Category = "Invalid";
	private boolean ReceiveFinancialAssistance = false;
	private double ValueofFinancialAssistance = 0;
	
	public DSstudent(int StudentID, String firstname, String lastname, int age, int credithour, 
			String FA, String major, String academicstanding, double value) {
		super(StudentID, firstname, lastname, age, credithour);
		
		if(FA.equals("Y")) {
			ReceiveFinancialAssistance = true;
			Category = "Degree-seeking student";
		} else {
			Category = "Degree-seeking student without Financial Assistance";
		}
		
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
		
		switch (academicstanding) {
		case "G":
			AcademicStanding = "Good";
			break;
		case "W":
			AcademicStanding = "Warning";
			break;
		case "P":
			AcademicStanding = "Probation";
			break;
		default:
			AcademicStanding = "Invalid";
			break;
		}
		
		if(ReceiveFinancialAssistance) {
			ValueofFinancialAssistance = value;
		}
	}
	
	public void printData() {
		System.out.println("ID number: " + SID);
		System.out.println("Name:      " + FirstName + " " + LastName);
		System.out.println("Age:       " + Age);
		
		System.out.println("\n");
		
		System.out.println(FirstName + " is a degree-seeking student enrolled in " + CreditHour + " credits");
		if(ReceiveFinancialAssistance) {
			System.out.println(FirstName + " receives $" + ValueofFinancialAssistance + " in financial assistance per term");
		}
		System.out.println(FirstName + "'s major is " + Major);
		System.out.println(FirstName + "'s academic standing is " + AcademicStanding);
	}
	
	public int computeFees() {
		int ComputationResult;
		if(CreditHour <= 12) {
			ComputationResult = 150 + CreditHour * 275;
		} else {
			ComputationResult = 3450;
		}
		if(ReceiveFinancialAssistance) {
			ComputationResult = (int) (ComputationResult - ValueofFinancialAssistance);
			if(ComputationResult < 0) {
				ComputationResult = 0;
			}
		}
		return ComputationResult;
	}
	
	public String GetCategory() {
		return Category;
	}
}
