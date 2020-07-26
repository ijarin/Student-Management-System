package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String StudentId;
	private String courses=" ";
	private int  TutionBalance=0;
	private static int TuitionCost=600;
	private static int id=1000;
	//Constructor: Prompt user to enter student's name and year
	//Generate ID:

	public Student(){
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Student's First Name:");
		this.firstName=in.nextLine();
		
		System.out.println("Enter Student's Last Name:");
		this.lastName=in.nextLine();
		
		System.out.println("1-Freshman\n2-Sphomore\n3-Junior\n4-Senior\nEnter Student's Graduation Year: ");
		this.gradeYear=in.nextInt();
		
		//System.out.println(firstName+' '+lastName+' '+ gradeYear+"th Year");
		
		SetStudentId();
		
		//System.out.println(firstName+" "+ lastName+" "+gradeYear+ " "+ StudentId );
		
		
	}
	
	private void SetStudentId() {
		id++;
		this.StudentId=gradeYear+""+id;
		
	}
	
	//Enroll Courses: 
	public void enroll() {
		do {
		  System.out.println("Enter course to enroll (Q to quit):");
		  Scanner in = new Scanner(System.in);
		  String course = in.nextLine();
		
		  if (!course.equals("Q")) {
			  courses=courses+"\n"+" "+course;
			  TutionBalance=TutionBalance + TuitionCost;
			  }
		  else { break;}
		}while(1!=0);
		
			//System.out.println("Enroll in: "+ courses);
			//System.out.println("Tuition Balance: "+ TutionBalance);
		
		
	}
	//View Balance: 
	public void viewBalance() {
		System.out.println("Your Due Balance is: "+ TutionBalance);
	}
	//Pay Tuition:
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your Payment amount: ");
		Scanner in=new Scanner(System.in);
		int payment=in.nextInt();
		TutionBalance=TutionBalance-payment;
		System.out.println("Thank you for the Payment of $ :"+ payment);
		
		
	}
	//Show Status: 
	public String toString() {
		return "Name:" + firstName +" "+lastName+ 
				"\nCourses Enrolled: "+ courses +
				"\nGrade year and Student Id:" + " "+gradeYear+ " , "+ StudentId+
				"\nBalance due is :" + TutionBalance+"$" ;
		
	}
	
	

}
