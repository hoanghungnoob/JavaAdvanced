package Midterm;
import Midterm.Student;
import Midterm.FindandSort;
import java.util.ArrayList;
import java.util.Scanner;



public class main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
VLChinh:while(true) {
			System.out.println("WELCOME TO STUDENT MANAGEMENT");
			System.out.println("1. Create");
			System.out.println("2. Find and Sort");
			System.out.println("3. Update/Delete");
			System.out.println("4. Report");
			System.out.println("5. Exit");
			System.out.print("Please choose one to do: ");
			n = sc.nextInt();
			sc.nextLine();
			Student students = new Student();
			switch (n) {
			case 1:
				System.out.println("You choose create");

				students.createStudent();
				System.out.println("------------------------------");
				break;
			case 2:
				System.out.println("You choose Find and Sort");
				System.out.print("Input name to find: ");
				String findName=sc.nextLine();
				Student.findStudentByName(Student.students, findName);
		        if (Student.findStudentByName(Student.students, findName) != null) {
		            System.out.println("Found student:");
		            System.out.println("Name: " + Student.findStudentByName(Student.students, findName).getName() + ", Semester: " + Student.findStudentByName(Student.students, findName).getSemester());
		        } else {
		            System.out.println("Student not found.");
		        }
		        System.out.println("Student sort");
				students.sort();
				System.out.println("------------------------------");
				break;
			case 3:
				System.out.println("remove sv");
				String remove=sc.nextLine();
				Student.removeStudentByName(Student.students, remove);
				System.out.println("------------------------------");
				break;
			case 4:
				students.diplay();
				break;
			case 5:
				System.out.println("Exit");
				break VLChinh;
			default:
				System.out.println("You must choose 1->5 not different");
				break;
			}
		}

	}

	

}