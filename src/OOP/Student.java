package OOP;

import java.util.Scanner;

public class Student {
	private String name;
	private int age;
	private int id;
	static int count=1;
	//constructor
	public Student() {
		this.id =count++;
	}
	public Student(String name, int age) {
		this.name=name;
		this.age=age;
		this.id =count++;
	}
	//method
	
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	public void greeting() {
		System.out.println("hello");
	}
	public void introduce() {
		Scanner sc =new Scanner(System.in);
		System.out.println("input name");
		this.name=sc.nextLine();
		System.out.println("input age");
		this.age =sc.nextInt();
	}
	
	public void display() {
		System.out.println("Student has Id: "+id);
		System.out.println("Student name: "+name);
		System.out.println("Student age: "+age);
		this.greeting();
		System.out.println("-------------------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a= new Student("hung",20);
		a.display();
		Student b=new Student();
		b.introduce();
		b.display();
		Student c=new Student();
		c.introduce();
		c.display();
		
	}

}
