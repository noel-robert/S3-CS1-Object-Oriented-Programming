// Experiment 5 - Polymorphism
abstract class Shape
{
	abstract void numberOfSides();
}

class Rectangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("Number of sides in a Rectangle = 4");
	}
}

class Triangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("Number of sides in a Triangle = 3");
	}
}

class Hexagon extends Shape
{
	void numberOfSides()
	{
		System.out.println("Number of sides in a Hexagon = 6");
	}
}

public class Experiment5
{
	public static void main(String args[])
	{
		Rectangle ob1 = new Rectangle();
		ob1.numberOfSides();

		Triangle ob2 = new Triangle();
		ob2.numberOfSides();
		
		Hexagon ob3 =  new Hexagon();
		ob3.numberOfSides();
	}
}