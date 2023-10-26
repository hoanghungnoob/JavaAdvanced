package btvenha;
import java.util.Scanner;
public class bt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      float a, b, c;
	      System.out.println("Nhập vào 3 số:");
	      Scanner sc = new Scanner(System.in);

	      a = sc.nextFloat();
	      b = sc.nextFloat();
	      c = sc.nextFloat();

	      if(a+b>c && b+c>a && c+a>b)
	         System.out.println("Ba số đúng là 3 cạnh của 1 tam giác");
	      else
	         System.out.println("Ba số không phải là 3 cạnh của 1 tam giác");
	}

}
