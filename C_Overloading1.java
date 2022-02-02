class C_Over1
{
	C_Over1(double r)
	{
		System.out.println("Area of circle = " + 22/7.0*r*r);
	}

	C_Over1(int s)
	{
		System.out.println("Area of square = " + s*s);
	}

	C_Over1(int l, int b)
	{
		System.out.println("Area of rectangle = " + l*b);
	}
}

public class C_Overloading1
{
	public static void main(String args[])
	{
		C_Over1 ob1 = new C_Over1(5.0);
		C_Over1 ob2 = new C_Over1(10);
		C_Over1 ob3 = new C_Over1(5, 10);
	}
}