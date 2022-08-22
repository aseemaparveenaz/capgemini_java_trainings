package HasA;

public class Person {
	private int age;
	private String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void display()
	{
		System.out.println("The person name is :"+name);
		System.out.println("The person age is :"+age);
	}

}
