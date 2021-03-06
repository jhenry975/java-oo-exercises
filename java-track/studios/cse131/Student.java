package cse131;


public class Student {
	
	
	//Declare Variables
	static String firstName;
	static String lastName;
	static int studentId;
	static double credits;
	static double gpa;
	static double gpaTotal;
	static String standing;
	//
	double courseGrade;
	double courseCredit;
	static double tuition;
	//Legacy Variables
	//String mom;
	//String dad;
	String kidFirstName;
	String kidLastName;
	double kidGpa;
	double kidCredits;
	
	//Constructor
	//public Student(String firstName, String lastName, int studentId, 
	//double credits, double gpa, String standing)
	public Student(String firstName, String lastName, int studentId)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.credits = credits;
		this.gpa = 0;
		this.gpaTotal = 0;
		this.standing = "Freshman";
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
	public static String getFirstName(String firstName) {
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
	public static String getLastName(String lastName) {
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
	public static int getStudentId(int studentId) {
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
	public String getClassStanding(double credits)
	//public void getClassStanding(double credits)
	{
		if(credits < 30)
		{
			return this.standing = "Freshman";
			//this.standing = "Freshman";
		}
		if(credits >= 30 && credits < 60)
		{
			return this.standing = "Sophomore";
			//this.standing = "Sophomore";
		}
		if(credits >= 60 && credits < 90)
		{
			return this.standing = "Junior";
			//this.standing = "Junior";
		}
		else
		{
			return this.standing = "Senior";
			//this.standing = "Senior";
		}
	}
	
	//Grade; grade=0-4, credit=3 per course, credits total credits
	public void submitGrade(double courseGrade, double credits)
	{
		double qualityScore = courseGrade * courseCredit;
		this.gpa = ((this.gpa * this.credits) + qualityScore) / (this.credits + credits);
		
		this.gpa = Math.round(this.gpa * 1000d) / 1000d;
		this.credits += credits;
		//return gpa = (Math.round(qualityScore / credits * 10.0) / 1000.0);
		
	}
	
	//Tuition: $20,000 per semester & $4,000 per course(3 credits each; 5 courses)
	/*public static double computeTuition(int credits)
	{
		//$1,333.33 per 1 credit
		return tuition = (Math.round(credits * 1333.33 * 100.0) / 1000.0);
	}*/
	public void computeTuition(int c){
		this.tuition = (Math.round(this.credits * 1333.33 * 100.0) / 1000.0);
	}
	
	//Legacy
	public static String createLegacy(String firstName, String lastName, double gpa, double gpa2,
			double credits, double credits2)
	{
		String kidFirstName = firstName + lastName;
		double kidGpa = (Math.round(gpa + gpa2) / 2 * 10d) / 10d;
		double kidCredits = credits + credits2;
		
		return(kidFirstName + " " + lastName + " " + kidGpa + " " + kidCredits);
	}
	
	//ToString
	public String toString(int studentId, String firstName, String lastName)
	{
		 return ("#" + this.studentId + "" + ": " + this.firstName + " " + this.lastName);
	}
	
	

	//Main------------------------------------------------
	public static void main(String[] args) {
		/*
		//Class Standing Test
		String cr;
		//credits = 35.0;
		cr = getClassStanding(80);
		System.out.println(cr);
		
		//Tuition Test
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
		
		//First name Test
		String fn;
		fn = getFirstName("John");
		System.out.println(fn);
		
		//Last name Test
		String ln;
		ln = getLastName("Smith");
		System.out.println(ln);
		
		//Student ID Test
		int id;
		id = getStudentId(5);
		System.out.println(id);
		
		//GPA
		double g;
		g = submitGrade(3.0,3.0);
		System.out.println(g);
		*/
	}

}
