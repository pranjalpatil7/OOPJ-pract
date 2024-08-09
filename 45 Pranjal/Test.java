
// Driver code
public class Test
{
	public static void main(String[] args)
	{
		// create boxes using the various
		// constructors
		Box mybox1=new Box(10,15,20);
		Box mybox2=new Box(0);
		Box mybox3=new Box(7);
		double vol;
		// get volume of first box
		vol=mybox1.volume();
		System.out.println("Volume of mybox1 is "+vol);
		// get volume of second box
		vol=mybox2.volume();
		System.out.println("Volume of mybox2 is "+vol);
		// get volume of third box
		vol=mybox3.volume();
		System.out.println("Volume of mybox3 is "+vol);
	}
}

// Constructor Overloading
class Box
{
	double width,height,depth;
	// constructor used when all dimensions
	// specified
	Box(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	// constructor used when no dimensions
	// specified
	Box()
	{
		width=height=depth=0;
	}
	// constructor used when cube is created
	Box(double len)
	{
		width=height=depth=len;
	}
	// compute and return volume
	double volume()
	{
		return width*height*depth;
	}
}


	
	