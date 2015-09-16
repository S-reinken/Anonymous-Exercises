package main;

public class Player
{
	int xposition;
	int yposition;
	boolean leftmove;
	boolean rightmove;
	boolean upmove;
	boolean downmove;
	boolean yesmove;
	String a;
	String color;
	public Player()
	{
		xposition = 100;
		yposition = 200;
		a = "c";
		leftmove = false;
		rightmove = false;
		upmove = false;
		downmove = false;
		yesmove = false;
		color = "red";
	}
	void setChar(String f)
	{
		a = f;
	}

}
