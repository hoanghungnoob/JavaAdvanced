package Chuong9Trycatch;
import java.util.InputMismatchException;
import java.util.Scanner;
public class baitap2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n;
	        do {
	            try {
	                System.out.print("input number of array: ");
	                n = sc.nextInt();
	                if (n <= 0) {
	                    throw new IllegalArgumentException("Error: number must be > 0!");
	                }
	                System.out.println("your number: "+n);
	                break; 

	            } catch (InputMismatchException e) {
	                System.out.println("Error: it is not number.");
	                sc.nextLine(); 
	            } catch (IllegalArgumentException e) {
	                System.out.println(e.getMessage());
	            }
	        } while (true);
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			int b;
			do {
	            try {
	                System.out.print("input number element of a: ");
	                b = sc.nextInt();
	        
	                break; 

	            } catch (InputMismatchException e) {
	                System.out.println("Error: it is not number.");
	                sc.nextLine(); 
	            } 
	        } while (true);
			a[i]=b;
			if (b==100) {
//				throw new IllegalArgumentException("number get out of 100");
				break;
			}
		}
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+" ");
			if (a[i]==100) {
				break;
			}
		}

	}

}
