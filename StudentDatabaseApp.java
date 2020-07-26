package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {

		//how many new students
		System.out.println("Enter how many students you want to add: ");
		Scanner in=new Scanner(System.in);
		int numStudents=in.nextInt();
		
		Student[] students =new Student[numStudents];
		
		for (int n=0; n<numStudents;n++) {
			
			students[n]= new Student();
			students[n].enroll();
			students[n].payTuition();	
			
		}
		
		
		for (int n=0; n<numStudents;n++) {
			System.out.println(students[n].toString());
			
			
		}


	}

}
