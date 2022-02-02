class Box2a
{
	int length = 5;
	int width = 5;
	int height = 5;
}

class Box2
{
	public static void main(String args[])
	{
		Box2a ob1 = new Box2a();
		Box2a ob2 = new Box2a();
		
		System.out.println("Area of first box is: " + 2*(ob1.length*ob1.width +ob1.length*ob1.height +ob1.width*ob1.height));
		System.out.println("Area of second box is: " + 2*(ob2.length*ob2.width +ob2.length*ob2.height +ob2.width*ob2.height));

		System.out.println("Volume of first box is: " + (ob1.length * ob1.width * ob1.height));
		System.out.println("Volume of second box is: " + (ob1.length * ob1.width * ob1.height));
	}
}