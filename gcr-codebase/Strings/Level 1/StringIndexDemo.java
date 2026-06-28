import java.util.Scanner;

public class StringIndexDemo {

    static void makeProblem(String s)
    {
        System.out.println(s.charAt(s.length()+2));
    }

    static void solveProblem(String s)
    {

        try
        {
            System.out.println(s.charAt(s.length()+2));
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException Caught");
        }
        catch(RuntimeException e)
        {
            System.out.println("Runtime Exception");
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter string : ");
        String s=sc.next();

        //makeProblem(s);

        solveProblem(s);

    }
}
