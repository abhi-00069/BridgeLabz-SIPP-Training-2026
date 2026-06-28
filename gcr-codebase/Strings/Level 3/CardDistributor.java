import java.util.Scanner;

public class CardDistributor {

    static String[] makeDeck()
    {

        String suit[]={"Hearts","Diamonds","Clubs","Spades"};
        String rank[]={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String deck[]=new String[52];

        int k=0;

        for(int i=0;i<suit.length;i++)
        {
            for(int j=0;j<rank.length;j++)
            {
                deck[k]=rank[j]+" of "+suit[i];
                k++;
            }
        }

        return deck;

    }

    static void shuffle(String arr[])
    {

        for(int i=0;i<arr.length;i++)
        {
            int r=i+(int)(Math.random()*(arr.length-i));

            String t=arr[i];
            arr[i]=arr[r];
            arr[r]=t;
        }

    }

    static void deal(String arr[],int players,int cards)
    {

        if(players*cards>52)
        {
            System.out.println("Cannot distribute cards.");
            return;
        }

        int k=0;

        for(int i=0;i<players;i++)
        {
            System.out.println("\nPlayer "+(i+1));

            for(int j=0;j<cards;j++)
            {
                System.out.println(arr[k]);
                k++;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Players : ");
        int p=sc.nextInt();

        System.out.print("Cards each : ");
        int c=sc.nextInt();

        String deck[]=makeDeck();

        shuffle(deck);

        deal(deck,p,c);

    }

}
