class M_Over
{
	void area(double r)
	{
		double ar = 22/7.0 * r * r;
		System.out.println("Area of circle is: " + ar);
	}

	void area(int l, int b)
	{
		int ar = l*b;
		System.out.println("Area of rectangle is: " + ar);
	}

	int area(int s)
	{
		return s*s;
	}
}

public class M_Overloading1
{
	public static void main(String args[])
	{
		M_Over ob1 = new M_Over();
		double r = 5; 
		ob1.area(r);

		int l=4, b=6; 
		ob1.area(l, b);

		int s=7; System.out.println("Area of square is: " + ob1.area(s));
	}
}