class Box3a
{
	int length = 5, width = 5, height = 5;
	int ar = 0, vol = 0;

	int volume()
	{
		vol = length * width * height;
		return vol;
	}

	int area()
	{
		ar = 2*(length*width +length*height +width*height);
		return ar;
	}
}

class Box3
{
	public static void main(String args[])
	{
		Box3a ob1 = new Box3a();
		Box3a ob2 = new Box3a();

		System.out.println("Area of first box is: " + ob1.area());
		System.out.println("Area of second box is: " + ob2.area());

		System.out.println("Volume of first box is: " + ob1.volume());
		System.out.println("Volume of second box is: " + ob2.volume());
	}
}