class val1
{
	void fn(int a)
	{
		System.out.println("Value of 'a' inside function before changing " + a);
		a++;
		System.out.println("Value of 'a' inside function after changing " + a);
	}
}

public class byValue1
{
	public static void main(String args[])
	{
		val1 ob1 = new val1();
		int a = 5;
		System.out.println("Value of 'a' inside main before passing " + a);
		ob1.fn(a);
		System.out.println("Value of 'a' inside main after passing " + a);
	}
}