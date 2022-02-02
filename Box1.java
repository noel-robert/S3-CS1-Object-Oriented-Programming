class Box1a
{
	int length, width, height;
}

class Box1
{
	public static void main(String args[])
	{
		Box1a ob1 = new Box1a();
		Box1a ob2 = new Box1a();

		ob1.length = 1; ob1. width = 1; ob1.height = 1;
		ob2.length = 1; ob2. width = 1; ob2.height = 1;

		System.out.println("Area of first box is: " + 2*(ob1.length*ob1.width +ob1.length*ob1.height +ob1.width*ob1.height));
		System.out.println("Area of second box is: " + 2*(ob2.length*ob2.width +ob2.length*ob2.height +ob2.width*ob2.height));

		System.out.println("Volume of first box is: " + (ob1.length * ob1.width * ob1.height));
		System.out.println("Volume of second box is: " + (ob1.length * ob1.width * ob1.height));
	}
}
