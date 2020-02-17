package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Student name: ");
		student.name = sc.nextLine();
		
		System.out.print("Student quarter note: ");
		student.quarter1 = sc.nextDouble();
		student.quarter2 = sc.nextDouble();
		student.quarter3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Final note: %.2f%n", student.finalGrade());
		
		if (student.finalGrade() < 60.00) {
			System.out.println("Failed");
			System.out.printf("Missing %.2f points%n", student.missingPoints());
			
		} else {
			System.out.println("Pass");
		}
		
		sc.close();
	}

}
