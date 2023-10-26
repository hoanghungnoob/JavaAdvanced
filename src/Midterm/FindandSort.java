package Midterm;
import java.util.ArrayList;

public class FindandSort {
    public static void bubbleSort(ArrayList<Student> students) {
        int n = students.size();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                // So sánh dựa trên tên của sinh viên
                if (students.get(i - 1).getName().compareTo(students.get(i).getName()) > 0) {
                    // Hoán đổi hai sinh viên
                    Student temp = students.get(i - 1);
                    students.set(i - 1, students.get(i));
                    students.set(i, temp);
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
