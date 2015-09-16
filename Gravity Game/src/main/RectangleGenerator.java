package main;

public class RectangleGenerator
{
	int xposition1;
	int yposition1;
	int xposition2;
	int yposition2;
	int length1;
	int length2;
	int height;
	
	public RectangleGenerator()
	{
		xposition1 = 0;
		yposition1 = 651;
		height = 34;
		length1 = ((int)Math.random())*((651*3)/5);
		//System.out.println("" + Math.random()*(651*3/5));
		xposition2 = (int)(length1 + Math.random());
		yposition2 = 651;
		length2 = (int)(((651*3)/5) - xposition2);
	}
	
	public int generate()
	{
		
		return 0;
	}

	
}
