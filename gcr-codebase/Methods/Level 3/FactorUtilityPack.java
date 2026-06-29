import java.util.Scanner;

public class FactorUtilityPack {

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

    static int greatest(int arr[])
    {
        return arr[arr.length-1];
    }

    static int sum(int arr[])
    {
        int s=0;

        for(int x:arr)
            s+=x;

        return s;
    }

    static long product(int arr[])
    {
        long p=1;

        for(int x:arr)
            p*=x;

        return p;
    }

    static double cubeProduct(int arr[])
    {
        double p=1;

        for(int x:arr)
        {
            p*=Math.pow(x,3);
        }

        return p;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n=sc.nextInt();

        int arr[]=factors(n);

        System.out.print("Factors : ");

        for(int x:arr)
            System.out.print(x+" ");

        System.out.println("\nGreatest Factor = "+greatest(arr));
        System.out.println("Sum = "+sum(arr));
        System.out.println("Product = "+product(arr));
        System.out.println("Cube Product = "+cubeProduct(arr));

    }

}
