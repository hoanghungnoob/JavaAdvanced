package BtThuchanh;
import java.util.Scanner;
public class Songuyento {
	int n;
	public Songuyento() {}
	public Songuyento(int n) {
		this.n=n;
	}
	public void nhapSo() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Moi ban nhap so: ");
		n = sc.nextInt();
	}
    public void isPrime() {
		for(int i=2;i<=n;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime =false;
					break;
				}	
			}
			if (isPrime==true) {
				System.out.print(i +",");
			}
		}
		System.out.println();
    }

}
