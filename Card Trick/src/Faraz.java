import java.util.Random;

public class Faraz
{
	char[] cards;
	char[] cards21;
	String[] suits;
	String[] suits21;

	public void filldeck()
	{
		cards = new char[52];
		suits = new String[52];
		int b = 49;
		int a;
		for (a=0; a<52; a++)
		{
			if (b==49)
			{
				cards[a] = 'A';
			}
			else if (b==58)
			{
				cards[a] = 'T';
			}
			else if (b==59)
			{
				cards[a] = 'J';
			}
			else if (b==60)
			{
				cards[a] = 'Q';
			}
			else if (b==61)
			{
				cards[a] = 'K';
			}
			else cards[a] = (char)b;
			if (b==61) b = 49;
			else b++;
		}
		for (a=1; a<5; a++)
		{
			for (b=0; b<13; b++)
			{
				if (a==1) suits[b] = "\u2660";
				if (a==2) suits[b + 13] = "\u2663";
				if (a==3) suits[b + 26] = "\u2665";
				if (a==4) suits[b + 39] = "\u2666";
			}
		}
	}
	
	public void shuffledeck()
	{
	    int a;
	    suits21 = new String[21];
		cards21 = new char[21];
		char[] copy;
		copy = new char[52];
		String[] scopy;
		scopy = new String[52];
		Random r = new Random();
		int random;
		for (a=0; a<52; a++)
		{
			random = r.nextInt(52);
			copy[a] = cards[a];
			scopy[a] = suits[a];
			cards[a] = cards[random];
			suits[a] = suits[random];
			cards[random] = copy[a];
			suits[random] = scopy[a];
		}

		for (a=0; a<21; a++)
		{
			cards21[a] = cards[a];
			suits21[a] = suits[a];
		}
	}

	public void displaydeck()
	{
		int counter = 0;
		for (int a=0; a<7; a++)
		{
			for (int b=0; b<3; b++)
			{
				System.out.print(cards21[counter] + suits21[counter] + " ");
				counter++;
			}
			System.out.println();
		}
	}
}
