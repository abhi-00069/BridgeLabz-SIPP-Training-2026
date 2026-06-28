import java.util.Scanner;

public class FactorOperations {

    static int[] factors(int n)
    {
        int c=0;

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }

        int arr[]=new int[c];

        int k=0;

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                arr[k]=i;
                k++;
            }
        }

        return arr;
    }

    static int sum(int arr[])
    {
        int s=0;

        for(int i=0;i<arr.length;i++)
            s=s+arr[i];

        return s;
    }

    static int product(int arr[])
    {
        int p=1;

        for(int i=0;i<arr.length;i++)
            p=p*arr[i];

        return p;
    }

    static double squareSum(int arr[])
    {
        double s=0;

        for(int i=0;i<arr.length;i++)
            s=s+Math.pow(arr[i],2);

        return s;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number : ");
        int n=sc.nextInt();

        int arr[]=factors(n);

        System.out.print("Factors : ");

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println("\nSum = "+sum(arr));
        System.out.println("Product = "+product(arr));
        System.out.println("Sum of Squares = "+squareSum(arr));

    }

}
