package Chuong9Trycatch;
import java.util.InputMismatchException;
import java.util.Scanner;
public class bt3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String id ;
        String fullName ;
        int age ;
        // try id
        while (true) {
            try {
                System.out.print("Input ID (6 character): ");
                id = scanner.nextLine();
                if (id.length() != 6) {
                    throw new IllegalArgumentException("ID must be 6 character.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        // try full name
        while (true) {
            try {
                System.out.print("input full name: ");
                fullName = scanner.nextLine();

                String[] name = fullName.split(" ");
                if (name.length < 2) {
                    throw new IllegalArgumentException("full name has to >=2 character.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        // try age
        while (true) {
            try {
                System.out.print("input age (>=19): ");
                age = scanner.nextInt();
                if (age < 19) {
                    throw new IllegalArgumentException("Age must >= 19.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Your input not a int.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Id: "+id);
        System.out.println("Fullname: "+fullName);
        System.out.println("Age: "+age);
	}

}
