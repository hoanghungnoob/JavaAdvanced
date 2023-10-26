package Midterm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    private String name;
    private int semester;
    private String course;
    private int samecourse=1;
    public static ArrayList<Student> students = new ArrayList<>();
    public Student() {}
    public Student(String name, int semester, String course) {
        this.name = name;
        this.semester=semester;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public String getCourse() {
        return course;
    }
    public void setName(String name) {
 		this.name = name;
 	}
 	public void setSemester(int semester) {
 		this.semester = semester;
 	}
 	public void setCourse(String course) {
 		this.course = course;
 	}
	public int getSamecourse() {
		return samecourse;
	}
	public void setSamecourse(int samecourse) {
		this.samecourse = samecourse;
	}
    public void createStudent() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            students.add(createStudent(scanner));

            if (students.size() >= 3) {
                System.out.print("Do you want to continue (Y/N)? ");
                String choice = scanner.next().trim().toUpperCase();
                if (!choice.equals("Y")) {
                    break;
                }
            }
        }

 
    }
    public void diplay() {
    	
    	for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            for (int j =i+1;j<students.size();j++) {
            	if (students.get(i).getName()==students.get(j).getName()) {
            		if(students.get(i).getCourse()==students.get(j).getCourse()) {
            			setSamecourse(samecourse+=1);
            		}
            			
            	}
            }
        }
    	
    	
    	
    	
    	if(samecourse==0) {
	        System.out.println("\nStudent Information:");
	        for (int i = 0; i < students.size(); i++) {
	            Student student = students.get(i);
	            System.out.println("Student " + (i + 1) + ":");
	            System.out.println("Name: " + student.getName());
	            System.out.println("seme: " + student.getSemester());
	            System.out.println("course: " + student.getCourse());
	            System.out.println();
	        }
    	}
    	else {
    		
    	}
    }
	public void sort() {
		Collections.sort(students, new Comparator<Student>() {
	        @Override
	        public int compare(Student s1, Student s2) {
	            return s1.getName().compareTo(s2.getName());
	        }
	    });
	
	    // In danh sách sinh viên đã sắp xếp
	    for (Student student : students) {
	        System.out.println("Name: " + student.getName() + ", Seme: " + student.getSemester() + ", Course: "+student.getCourse());
	    }
	}
	
	
    // Hàm tìm kiếm theo tên
    public static Student findStudentByName(ArrayList<Student> students, String nameToFind) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(nameToFind)) {
                return student;
            }
        }
        return null; // Trả về null nếu không tìm thấy sinh viên
    }
    
    public static boolean removeStudentByName(ArrayList<Student> students, String nameToDelete) {
        Scanner scanner = new Scanner(System.in);

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(nameToDelete)) {
                System.out.println("Found student to delete:");
                System.out.println("Name: " + student.getName() + ", course: " + student.getCourse());
                System.out.print("Do you want to delete or update this student? (D/U): ");
                String choice = scanner.nextLine().trim().toUpperCase();
                if (choice.equals("D")) {
                    students.remove(student);
                    return true; // Xóa thành công
                } else if (choice.equals("U")) {
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new course: ");
                    String newCourse = scanner.nextLine();
                    
                    // Cập nhật thông tin sinh viên
                    student.setName(newName);
                    student.setCourse(newCourse);
                    return false; // Không xóa (đã cập nhật thông tin)
                }
            }
        }
        return false; // Không tìm thấy sinh viên để xóa
    }

 
	private static Student createStudent(Scanner scanner) {
        System.out.println("Enter student information:");
        System.out.print("Input Name: ");
        String name = scanner.next();
        System.out.print("Input Semester: ");
        int semester = scanner.nextInt();
        System.out.print("Input Course name: ");
        String course = scanner.next();
        scanner.nextLine();
        return new Student(name,semester,course);
        }

    
    
}


