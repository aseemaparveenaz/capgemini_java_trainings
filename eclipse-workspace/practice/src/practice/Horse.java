package practice;

public class Horse extends Animal {
	public void eat()
	{
		System.out.println("Horse is eating");
	}
	public static void main(String[] args)
	{
		Animal a=new Animal();
		Animal h=new Horse();
		h.eat();
		a.eat();
	}
}
