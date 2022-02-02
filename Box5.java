class Box5a
{
	int length, width, height;
	int ar = 0, vol = 0;

	Box5a(int l, int w, int h)
	{
		length = l; width = w; height = h;
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

class Box5
{
	public static void main(String args[])
	{
		Box5a ob1 = new Box5a(1, 2, 3);
		Box5a ob2 = new Box5a(1, 2, 3);

		System.out.println("Area of first box is: " + ob1.area());
		System.out.println("Area of second box is: " + ob2.area());

		System.out.println("Volume of first box is: " + ob1.volume());
		System.out.println("Volume of second box is: " + ob2.volume());
	}	
}