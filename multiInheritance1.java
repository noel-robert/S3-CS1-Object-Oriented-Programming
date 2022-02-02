// Program to implement multilevel Inheritance

class Animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
}

class babyDog extends Dog
{
	void weep()
	{
		System.out.println("Weeping...");
	}
}

public class multiInheritance1
{
	public static void main(String args[])
	{
		babyDog b = new babyDog();
		b.weep();
		b.bark();
		b.eat();
	}
}