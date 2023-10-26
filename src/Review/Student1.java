package Review;

public class Student1 {
	//Attributes
	private String name;
	private int age;
	private int id;
	static int count=1;
	//Method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//greeting method
	public void greeting() {
		System.out.println("Hello");
	//syso = System.out.println()
	}
	public void introduce() {
		System.out.println("My name is: "+name);
		System.out.println("I am "+age+" years old");
		System.out.println("My id is:"+id);
	}
	//Constructors
	public Student1(String name,int age ) {
		this.name=name;
		this.age=age;
		
		this.id=count++;
	}
	public Student1() {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 a = new Student1("Hoang huu hung",19);
		Student1 b = new Student1("hung",12);
		Student1 c = new Student1("hung",12);
		Student1 d = new Student1("hung",12);
		a.introduce();
		b.introduce();
		c.introduce();
		d.introduce();
		
	
	}

}
