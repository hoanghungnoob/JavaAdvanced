package Ktemailsdt;
import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Kiemtra {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	// CT kiem tra email va SDT
//		email -- > abc @ xyz. com
			
			Pattern pe = Pattern.compile("\\w+@\\w+\\.\\w+");
			Pattern pn =  Pattern.compile("0[1-9]{2}-\\d{3}-\\d{4}");
			
			while(true) {
				//1. Nhap thong tin
				Scanner input = new Scanner(System.in);
				   System.out.println("Input email: ");
				   String e = input.nextLine();
				   
				   System.out.println("Input phone: ");
				   String n = input.nextLine();
				   
				   if(pe.matcher(e).find()) {
					   if(pn.matcher(n).find()) {
						   System.out.println("Email and number phone are correct");
						   break;
					   }
					   else {
						   System.out.println("Number phone wrong");
					   }
					   
				   }
				   
				   else {
					   if(pn.matcher(n).find()) {
						   System.out.println("E-mail wrong");
					   }
					   else {
						   System.out.println("Email and phone number wrong");
					   }
				   }
				   
				   
			}
			
			
		}

	}


