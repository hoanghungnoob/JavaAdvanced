package btvenha;
import java.util.Scanner;	
public class bt5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String MSSV;
	      System.out.println("Nhập vào MSSV:");
	      Scanner sc = new Scanner(System.in);

	      MSSV = sc.nextLine(); 

	      if (MSSV.matches("B\\d{7}")) 
	         System.out.println("Phù hợp");
	      else
	         System.out.println("Không phù hợp");
	}

}
