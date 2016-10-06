package cse131;

public class Student {
	
	
	//Declare Variables
	static String firstName;
	static String lastName;
	static int studentId;
	static double credits;
	double gpa;
	static String standing;
	//
	int courseGrade;
	int courseCredit;
	static double tuition;
	//Legacy Variables
	//String mom;
	//String dad;
	String kidFirstName;
	String kidLastName;
	double kidGpa;
	double kidCredits;
	
	//Constructor
	public Student(String firstName, String lastName, int studentId, 
	double credits, double gpa, String standing)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.credits = credits;
		this.gpa = gpa;
		this.standing = standing;
	}
	
	//Legacy Constructor
	public Student()
	{
		/*kidFirstName = this.firstName + lastName;
		kidGpa = this.gpa + gpa;
		kidCredits = this.credits + credits;*/
	}
	
	//Getters and Setters----------------------------------------------
	/**
	 * @return the firstName
	 */
	public static String getFirstName(String first) {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the credits
	 */
	public double getCredits() {
		return credits;
	}

	/**
	 * @param credits the credits to set
	 */
	public void setCredits(double credits) {
		this.credits = credits;
	}

	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	//Methods---------------------------------------------
	
	//Returns student's class standing based on how many credits
	public static String getClassStanding(double credits)
	{
		if(credits < 30)
		{
			return standing = "Freshman";
		}
		if(credits >= 30 && credits < 60)
		{
			return standing = "Sophomore";
		}
		if(credits >= 60 && credits < 90)
		{
			return standing = "Junior";
		}
		else
		{
			return standing = "Senior";
		}
	}
	
	/*
	public void submitGrade(int courseGrade, int courseCredit)
	{
		int qualityScore = courseGrade * courseCredit;
		
		while(courseCredit != 0)
		{
			
		}
		
	}*/
	
	//Tuition: $20,000 per semester & $4,000 per course(3 credits each; 5 courses)
	public static double computeTuition(int credits)
	{
		//$1,333.33 per 1 credit
		return tuition = ((credits * 1333.33 * 100.0) / 100.0);
	}
	
	//Legacy
	public static String createLegacy(String firstName, String lastName, double gpa, double gpa2,
			double credits, double credits2)
	{
		String kidFirstName = firstName + lastName;
		double kidGpa = gpa + gpa2;
		double kidCredits = credits + credits2;
		
		return(kidFirstName + " " + lastName + " " + kidGpa + " " + kidCredits);
	}
	
	//ToString
	public static String toString(int studentId, String firstName, String lastName)
	{
		 return ("#" + studentId + "" + ": " + firstName + " " + lastName);
	}
	
	

	//Main------------------------------------------------
	public static void main(String[] args) {
		
		//Class Standing Test
		String cr;
		//credits = 35.0;
		cr = getClassStanding(80);
		System.out.println(cr);
		
		//Tuition Test //FAIL
		double t;
		t = computeTuition(30);
		System.out.println(t);
		
		//toString Test
		String ts;
		ts = toString(4, "Joe", "Smith");
		System.out.println(ts);
		
		//Legacy Test
		String l;
		l = createLegacy("Joe", "Thomas", 3.4, 2.8, 80, 80);
		System.out.println(l);
		
		
		

	}

}
