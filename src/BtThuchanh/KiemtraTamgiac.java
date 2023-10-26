package BtThuchanh;
import java.util.Scanner;

public class KiemtraTamgiac {
	public static Scanner input =new Scanner(System.in);
	int a,b,c;
	public KiemtraTamgiac() {}
	public KiemtraTamgiac(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void kiemTra() {
		if (a*a==b*b+c*c || b*b==a*a+c*c|| c*c==a*a+b*b) {
			System.out.println("day la tam giac vuong");
		}
		else {
		System.out.println("day khong phai la tam giac vuong");}
	}
	public void input() {
		Scanner sc =new Scanner(System.in);
		System.out.println("nhap so a:");
		a = sc.nextInt();
		System.out.println("nhap so b:");
		b =sc.nextInt();
		System.out.println("nhap so c:");
		c =sc.nextInt();
	}
}
