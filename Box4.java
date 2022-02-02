class Box4a
{
	int length, width, height;
	int ar = 0, vol = 0;

	Box4a()
	{
		length = 1; width = 2; height = 3;
	}

	int volume()
	{
		vol = length * width * height;
		return vol;
	}

	int area()
	{
		ar = 2*(length*width + length*height + width*height);
		return ar;
	}
}

class Box4
{
	public static void main(String args[])
	{
		Box4a ob1 = new Box4a();
		Box4a ob2 = new Box4a();

		System.out.println("Area of first box is: " + ob1.area());
		System.out.println("Area of second box is: " + ob2.area());

		System.out.println("Volume of first box is: " + ob1.volume());
		System.out.println("Volume of second box is: " + ob2.volume());
	}	
}