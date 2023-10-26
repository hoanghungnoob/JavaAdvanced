package OOP;
import java.util.Scanner;
public class classOOP {
	public Scanner ip=new Scanner(System.in);
	// count a
	public static int countA(String chuoi) {
		int count=0;
		for (int i=0;i<chuoi.length();i++) {
			if(chuoi.charAt(i)=='a') {
				count++;
			}
		}
		return count;	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner ip=new Scanner(System.in);
//			System.out.println("Input string");
//			String s=ip.nextLine();
//			System.out.println(countA(s));
			// kiểm tra chuoi java sử dụng hàm s.contains("java")
			// kiểm tra chuoi java sử dụng hàm s.indexOf("java")
			// kiểm tra có bắt đầu không s.startWith("")
			String a = "dhshdslfk";
			
	}

}
