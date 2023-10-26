package Review;
import java.util.Scanner;

public class Student {
    String name;
    int age;
    int id = nextID++;
    static int nextID = 1;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void getting() {
    	System.out.println("Hello");
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
		return id;
	}
    public String getName() {
        return name;
    }

    public void setAge(int age) {
       this.age=age;

    }

    public int getAge() {
        return age;
    }
    public void info() {
    	Scanner input = new Scanner(System.in);
    	System.out.print("input your name: ");
    	name= input.nextLine();
    	System.out.print("input your age:");
    	age= input.nextInt();
    	input.close();
    }
    public void introduce() {
        
        
    	System.out.println("My name is: " +getName());
        System.out.println("I am "+ getAge()+ " years old");
        System.out.println("My ID is: "+ getId());
        
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.info();
		stu.getting();
		stu.introduce();
	}

}
