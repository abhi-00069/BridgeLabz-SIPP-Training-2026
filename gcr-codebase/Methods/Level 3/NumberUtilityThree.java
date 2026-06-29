import java.util.Scanner;

public class NumberUtilityThree {

    static int count(int n)
    {
        int c=0;

        while(n>0)
        {
            c++;
            n=n/10;
        }

        return c;
    }

    static int[] digits(int n)
    {
        int arr[]=new int[count(n)];

        for(int i=arr.length-1;i>=0;i--)
        {
            arr[i]=n%10;
            n=n/10;
        }

        return arr;
    }

    static int[] reverse(int arr[])
    {
        int brr[]=new int[arr.length];

        int k=0;

        for(int i=arr.length-1;i>=0;i--)
        {
            brr[k]=arr[i];
            k++;
        }

        return brr;
    }

    static boolean same(int a[],int b[])
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
                return false;
        }

        return true;
    }

    static boolean duck(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==0)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n=sc.nextInt();

        int arr[]=digits(n);
        int rev[]=reverse(arr);

        System.out.println("Palindrome = "+same(arr,rev));
        System.out.println("Duck Number = "+duck(arr));

    }

}
