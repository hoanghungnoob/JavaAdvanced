package Review;
import java.util.Scanner;
import java.lang.*;
public class vd_method {
	int a,b;
	public vd_method(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void findMax(int a,int b) {
		if (a>b) {
			System.out.println("so lon la:"+a);
		}
		else {
			System.out.println("so lon la:"+b);
		}
	}
	public int max(int a,int b) {
		return (a<b)?b:a;}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("moi ban nhap so thu nhat: ");
		int a = ip.nextInt();
		System.out.println("moi ban nhap so thu hai: ");
		int b = ip.nextInt();
		System.out.println(Math.max(a, b));
		// 
		if (a>b) {
			System.out.println("so lon la: "+a);
		}
		else {
			System.out.println("so lon la: "+b);
		}
		// 
		vd_method vd = new vd_method(a, b);
		vd.findMax(a, b);
		System.out.println(vd.max(a, b));
	}

}
