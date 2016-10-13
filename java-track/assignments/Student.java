


public class Student {
	
	
	//Declare Variables
	String name;
	String firstName;
	String lastName;
	int studentId;
	int credits;
	double gpa;
	double gpaTotal;
	String standing;
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
		this.name = firstName + lastName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		this.credits = 0;
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
	public String getName() {
		this.name = this.firstName + " " + this.lastName;
		return this.name;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param lastName the lastName to set
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
	public int getStudentID() {
		return this.studentId;
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
	public int getCredits() {
		return this.credits;
	}

	/**
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}

	/**
	 * @return the gpa
	 */
	public double getGPA() {
		return this.gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	//Methods---------------------------------------------
	
	//Returns student's class standing based on how many credits
	public String getClassStanding()
	//public void getClassStanding(double credits)
	{
		//double credits = this.credits;
		if(this.credits < 30)
		{
			this.standing = "Freshman";
			return this.standing;
			//this.standing = "Freshman";
		}
		else if(this.credits >= 30 && this.credits < 60)
		{
			this.standing = "Sophomore";
			return this.standing;
			//this.standing = "Sophomore";
		}
		else if(this.credits >= 60 && this.credits < 90)
		{
			this.standing = "Junior";
			return this.standing;
			//this.standing = "Junior";
		}
		else
		{
			this.standing = "Senior";
			return this.standing;
			//this.standing = "Senior";
		}
	}
	
	//Grade; grade=0-4, credit=3 per course, credits total credits
	public void submitGrade(double courseGrade, int credits)
	{
		double qualityScore = courseGrade * courseCredit;
		this.gpa = ((this.gpa * this.credits) + qualityScore) / (this.credits + this.credits);
		
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
	public double computeTuition(){
		this.tuition = (Math.round(this.credits * 1333.33 * 100.0) / 1000.0);
		return this.tuition;
	}
	
	//Legacy
	public void createLegacy(double c, double g)
	{
		String kidFirstName = this.name;
		double kidGpa = (Math.round(this.gpa + gpa) / 2 * 10d) / 10d;
		double kidCredits = this.credits + credits;
		
		//return(kidFirstName + " " + lastName + " " + kidGpa + " " + kidCredits);
	}
	
	//ToString
	public String toString()
	{
		 return ("#" + this.studentId + "" + ": " + this.name);
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

	public Student createLegacy(Student ss) {
		// TODO Auto-generated method stub
		return null;
	}

}
