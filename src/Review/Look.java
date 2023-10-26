package Review;
import java.util.*;
public class Look {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		while (true) {
			System.out.println("input number to check");			
			n =sc.nextInt();
	//		boolean isPrime =true;
	//		for(int i=2;i<n;i++) {
	//			if(n%i==0) {
	//				isPrime =false;
	//				break;
	//			}	
	//		}
	//		if(isPrime) {
	//			System.out.println(n+" day la so nguyen to");
	//		}
	//		else {
	//			System.out.println(n+" day khong phai la so nguyen to");
	//		}
	//		
			
	//		vòng lặp 1 kiêm rtra 2 3 4 5 6 ..n
	//		vòng lặp 2 kiểm tra
			
				for(int i=2;i<=n;i++) {
					boolean isPrime=true;
					for(int j=2;j<i;j++) {
						if(i%j==0) {
							isPrime =false;
							break;
						}
						
					}
					if (isPrime) {
						System.out.println(i);
					}					
				
				}
		
		}
	}

}
