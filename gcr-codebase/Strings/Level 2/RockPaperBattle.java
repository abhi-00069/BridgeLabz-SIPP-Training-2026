import java.util.Scanner;

public class RockPaperBattle {

    static String compChoice()
    {
        int x=(int)(Math.random()*3);

        if(x==0)
            return "Rock";
        else if(x==1)
            return "Paper";
        else
            return "Scissors";
    }

    static String winner(String p,String c)
    {

        if(p.equalsIgnoreCase(c))
            return "Draw";

        if(p.equalsIgnoreCase("Rock") && c.equals("Scissors"))
            return "Player";

        if(p.equalsIgnoreCase("Paper") && c.equals("Rock"))
            return "Player";

        if(p.equalsIgnoreCase("Scissors") && c.equals("Paper"))
            return "Player";

        return "Computer";

    }

    static String[][] play(int n)
    {

        Scanner sc=new Scanner(System.in);

        String ans[][]=new String[n][3];

        for(int i=0;i<n;i++)
        {

            System.out.print("Rock/Paper/Scissors : ");
            String p=sc.next();

            String c=compChoice();

            String w=winner(p,c);

            ans[i][0]=p;
            ans[i][1]=c;
            ans[i][2]=w;

        }

        return ans;

    }

    static void show(String arr[][])
    {

        int p=0;
        int c=0;

        System.out.println();

        System.out.println("Player\tComputer\tWinner");

        for(int i=0;i<arr.length;i++)
        {

            System.out.println(arr[i][0]+"\t"+arr[i][1]+"\t\t"+arr[i][2]);

            if(arr[i][2].equals("Player"))
                p++;

            if(arr[i][2].equals("Computer"))
                c++;

        }

        System.out.println();

        System.out.println("Player Wins : "+p);
        System.out.println("Computer Wins : "+c);

        double pp=(double)p*100/arr.length;
        double cp=(double)c*100/arr.length;

        System.out.println("Player Win % : "+pp);
        System.out.println("Computer Win % : "+cp);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Number of Games : ");
        int n=sc.nextInt();

        String arr[][]=play(n);

        show(arr);

    }

}
