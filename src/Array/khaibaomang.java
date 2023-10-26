package Array;
import java.util.*;
public class khaibaomang {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
//		khai báo mảng
		int [] a;
//		khởi tạo mảng
		a=new int [5];
//		gán giá trị cho phần tử mảng
//		a[0]=1;
//		gán giá trị bằng vòng for
//		for (int i=0; i<a.length;i++) {
//			System.out.println("Moi ban nhap phan tu thu" + (i+1));
//			a[i]=sc.nextInt();
//		}
		
//		lấy next thì chỉ cần ấn space để nhập tiếp không cần ấn enter
		System.out.println("please input elemet");
		sc.next();
		for (int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		
//		in ra màn hình thoonhg thường
		System.out.println("cac phan tu theo kieu thong thuong");
		System.out.println("phan tu thu 1 "+a[0]);
		System.out.println("phan tu thu 2 "+a[1]);
		System.out.println("phan tu thu 3 "+a[2]);
		System.out.println("phan tu thu 4 "+a[3]);
		System.out.println("phan tu thu 5 "+a[4]);
//		in phan tu theo kieu for each
		System.out.println("in phan tu theo kieu for each");
		for (int i: a) {
			System.out.print("phan tu thu "+":"+i);
		}
		
//		in phan tu dung phuong thuc to-string
		System.out.println("phuong thuo toString");
		System.out.println(Arrays.toString(a));
	}

}
