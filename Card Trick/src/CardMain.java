import java.util.*;

public class CardMain {

    static Faraz deck;

    public static void redeal(int choice)
    {
        int location = 0;
        int location2 = 0;
        int location3 = 0;
        char[] copy;
        String[] scopy;
        copy = new char[21];
        scopy = new String[21];
        if (choice==1) {location = 1; location2 = 0; location3 = 2;}
        if (choice==2) {location = 0; location2 = 1; location3 = 2;}
        if (choice==3) {location = 0; location2 = 2; location3 = 1;}
        for (int a=0; a<7; a++)
        {
            copy[a] = deck.cards21[a];
            scopy[a] = deck.suits21[a];
            deck.cards21[a] = deck.cards21[location];
            deck.suits21[a] = deck.suits21[location];
            deck.cards21[location] = copy[a];
            deck.suits21[location] = scopy[a];
            location += 3;
            //System.out.print(deck.cards21[a] + deck.suits21[a] + " \n");
        }
        for (int a=7; a<14; a++)
        {
            copy[a] = deck.cards21[a];
            scopy[a] = deck.suits21[a];
            deck.cards21[a] = deck.cards21[location2];
            deck.suits21[a] = deck.suits21[location2];
            deck.cards21[location2] = copy[a];
            deck.suits21[location2] = scopy[a];
            location += 3;
        }
        for (int a=14; a<21; a++)
        {
            copy[a] = deck.cards21[a];
            scopy[a] = deck.suits21[a];
            deck.cards21[a] = deck.cards21[location3];
            deck.suits21[a] = deck.suits21[location3];
            deck.cards21[location3] = copy[a];
            deck.suits21[location3] = scopy[a];
            location += 3;
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int c;
        deck = new Faraz();
        deck.filldeck();
        deck.shuffledeck();
        deck.displaydeck();

        System.out.println("Please choose a card and enter the number of the pile it is in");
        c = input.nextInt();
        redeal(c);
        deck.displaydeck();
        System.out.println("Please enter the number of the pile the card is in");
        c = input.nextInt();
        redeal(c);
        deck.displaydeck();
        System.out.println("Enter the number of the pile one more time");
        c = input.nextInt();
        redeal(c);
        System.out.println("Your card is: " + deck.cards21[10] + deck.suits21[10]);
    }
}