import java.util.Scanner;

public class NumberFormatShow {

    static void makeCrash(String s)
    {
        int n = Integer.parseInt(s);
        System.out.println(n);
    }

    static void handleCrash(String s)
    {

        try
        {
            int n = Integer.parseInt(s);
            System.out.println(n);
        }
        catch(NumberFormatException e)
        {
            System.out.println("NumberFormatException Caught");
        }
        catch(RuntimeException e)
        {
            System.out.println("Runtime Exception");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text : ");
        String txt = sc.next();

        //makeCrash(txt);

        handleCrash(txt);

    }

}
