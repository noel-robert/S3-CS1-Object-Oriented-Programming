// Program to implement heirarchial Inheritance

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

class Cat extends Animal
{
	void meow()
	{
		System.out.println("Meowing...");
	}
}

public class hierarchicalInheritance1
{
	public static void main(String args[])
	{
		Cat c = new Cat();
		c.meow();
		c.eat();
		// c.bark();		// This statement will give compile time error
	}
}