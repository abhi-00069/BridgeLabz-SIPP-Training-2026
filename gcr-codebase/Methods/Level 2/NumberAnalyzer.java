import java.util.Scanner;

public class NumberAnalyzer {

    static boolean isPositive(int n)
    {
        return n>=0;
    }

    static boolean isEven(int n)
    {
        return n%2==0;
    }

    static int compare(int a,int b)
    {
        if(a>b)
            return 1;

        if(a<b)
            return -1;

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];

        for(int i=0;i<5;i++)
        {
            System.out.print("Enter number : ");
            arr[i]=sc.nextInt();
        }

        System.out.println();

        for(int i=0;i<5;i++)
        {

            if(isPositive(arr[i]))
            {
                if(isEven(arr[i]))
                    System.out.println(arr[i]+" is Positive Even");
                else
                    System.out.println(arr[i]+" is Positive Odd");
            }
            else
            {
                System.out.println(arr[i]+" is Negative");
            }

        }

        int x=compare(arr[0],arr[4]);

        if(x==1)
            System.out.println("First element is Greater");
        else if(x==-1)
            System.out.println("Last element is Greater");
        else
            System.out.println("Both are Equal");

    }

}
