package BtThuchanh;
import java.util.Scanner;
public class SoChan {
	Scanner sc = new Scanner(System.in);
	// tính tổng các số chẵn từ 0 đến n
	int n;
	public SoChan() {}
	public SoChan(int n) {
		this.n=n;
	}
	public void nhapSo() {
		System.out.println("Moi ban nhap so: ");
		n = sc.nextInt();
	}
	public void sumSoChan() {
		int sum = 0;
		for (int i=0;i<=n;i++) {
			if (i%2==0) {
				sum+=i;
			}
		}
		System.out.println("tong la: "+sum);
	}
}
