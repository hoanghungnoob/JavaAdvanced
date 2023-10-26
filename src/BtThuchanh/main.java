package BtThuchanh;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
VLChinh:while(true) {
			System.out.println("CHUONG TRINH TONG HOP");
			System.out.println("1. Kiem tra tam giac");
			System.out.println("2. Kiem tra + tinh tong cac so chan");
			System.out.println("3. In ra so nguyen to");
			System.out.println("4. Kiem tra ma so sv");
			System.out.println("5. Thoat chuong trinh");
			System.out.println("Moi ban chon 1 chuc nang bat ky");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("ban chon kiem tra tam giac");
				KiemtraTamgiac kt =new KiemtraTamgiac();
				kt.input();
				kt.kiemTra();
				break;
			case 2:
				System.out.println("Ban chon kiem tra so chan");
				SoChan so =new SoChan();
				so.nhapSo();
				so.sumSoChan();
				break;
			case 3:
				System.out.println("Ban chon in ra so nguyen to");
				Songuyento sont=new Songuyento();
				sont.nhapSo();
				sont.isPrime();
				break;
			case 4:
				System.out.println("Ban chon kiem tra ma so sv");
				StudentIDValidation st=new StudentIDValidation();
				st.nhapMs();
				break;
			case 5:
				System.out.println("Ket thuc");
				break VLChinh;
			default:
				System.out.println("Ban phai chon tu 1 den 5");
				break;
			}
		}

	}

}
