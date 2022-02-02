class ref1
{
	int a;

	ref1(int a)
	{
		this.a = a;
	}

	void fn(ref1 ob1)
	{
		System.out.println("Value of 'ob1.a' inside function before changing " + ob1.a);
		ob1.a++;
		System.out.println("Value of 'ob1.a' inside function after changing " + ob1.a);
	}
}

public class byReference1
{
	public static void main(String args[])
	{
		ref1 ob1 = new ref1(5);
		System.out.println("Value of 'ob1.a' inside main before passing " + ob1.a);
		ob1.fn(ob1);
		System.out.println("Value of 'ob1.a' inside main after passing " + ob1.a);
	}
}