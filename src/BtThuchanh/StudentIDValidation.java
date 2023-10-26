package BtThuchanh;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentIDValidation {
	String studentID;
	public void nhapMs() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao 5 ma so sinh vien:");
        for (int i = 0; i < 5; i++) {
            studentID = scanner.nextLine();
            if (validateStudentID(studentID)) {
                System.out.println("Ma so sinh vien hop le.");
            } else {
                System.out.println("Ma so sinh vien khong hop le.");
            }
        }


	}
    public boolean validateStudentID(String studentID) {
        String pattern = "B170[1-9]{4}";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(studentID);
        return matcher.matches();
    }
}