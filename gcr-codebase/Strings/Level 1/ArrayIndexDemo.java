import java.util.Scanner;

public class ArrayIndexDemo {

    static void makeError(String arr[])
    {
        System.out.println(arr[arr.length+1]);
    }

    static void fixError(String arr[])
    {

        try
        {
            System.out.println(arr[arr.length+1]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException Caught");
        }
        catch(RuntimeException e)
        {
            System.out.println("Runtime Exception");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String names[] = new String[3];

        for(int i=0;i<names.length;i++)
        {
            System.out.print("Enter name : ");
            names[i]=sc.next();
        }

        //makeError(names);

        fixError(names);

    }

}
