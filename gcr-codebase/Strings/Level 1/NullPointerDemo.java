import java.util.Scanner;

public class NullPointerDemo {

    static void makeError()
    {
        String txt=null;

        System.out.println(txt.length());
    }

    static void fixError()
    {
        String txt=null;

        try
        {
            System.out.println(txt.length());
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException Caught");
        }
    }

    public static void main(String[] args) {

        System.out.println("Comment makeError() if you want to see handled exception.");

        //makeError();

        fixError();

    }
}
