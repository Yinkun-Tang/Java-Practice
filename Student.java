package hw2;

public abstract class Student {
	// Data Fields
	protected int SID;
	protected String FirstName;
	protected String LastName;
	protected int Age;
	protected int CreditHour;
	
	public Student(int StudentID, String firstname, String lastname, int age, int credithour) {
		SID = StudentID;
		FirstName = firstname;
		LastName = lastname;
		Age = age;
		CreditHour = credithour;
	}
	
	public String GetFullName() {
		String FullName = FirstName + " " + LastName;
		return FullName;
	}
	
	public abstract void printData();
	public abstract int computeFees();
	public abstract String GetCategory();
}
