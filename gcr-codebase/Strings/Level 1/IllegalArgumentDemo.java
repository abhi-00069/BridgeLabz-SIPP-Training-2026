import java.util.Scanner;

public class IllegalArgumentDemo {

    static void wrongWay(String s)
    {
        System.out.println(s.substring(5,2));
    }

    static void rightWay(String s)
    {

        try
        {
            System.out.println(s.substring(5,2));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException Caught");
        }
        catch(RuntimeException e)
        {
            System.out.println("Runtime Exception Caught");
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter string : ");
        String s=sc.next();

        //wrongWay(s);

        rightWay(s);

    }
}
