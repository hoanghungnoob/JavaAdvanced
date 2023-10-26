package Chuong9Trycatch;
import java.util.InputMismatchException;
import java.util.Scanner;
public class baitap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	
		try {
			System.out.println("input number 1: ");
			int number = sc.nextInt();
			System.out.println("input number 2: ");
			int number2 = sc.nextInt();
			int div = number / number2;
			System.out.println("divice = "+ div);
		}catch (InputMismatchException e) {
			System.out.println("It is not number");
		}catch(ArithmeticException e) {
			System.out.println("Error: number 2 mustn't =0");
		}
		System.out.println("end program");		
	}
}
