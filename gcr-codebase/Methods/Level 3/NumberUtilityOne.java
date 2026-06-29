import java.util.Scanner;

public class NumberUtilityOne {

    static int countDigits(int n)
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
        int c=countDigits(n);

        int arr[]=new int[c];

        for(int i=c-1;i>=0;i--)
        {
            arr[i]=n%10;
            n=n/10;
        }

        return arr;
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

    static boolean armstrong(int n)
    {
        int arr[]=digits(n);

        int p=arr.length;
        int s=0;

        for(int i=0;i<arr.length;i++)
        {
            s=s+(int)Math.pow(arr[i],p);
        }

        return s==n;
    }

    static int[] largeSmall(int arr[])
    {
        int ans[]=new int[4];

        int big=Integer.MIN_VALUE;
        int sbig=Integer.MIN_VALUE;

        int small=Integer.MAX_VALUE;
        int ssmall=Integer.MAX_VALUE;

        for(int x:arr)
        {
            if(x>big)
            {
                sbig=big;
                big=x;
            }
            else if(x>sbig && x!=big)
            {
                sbig=x;
            }

            if(x<small)
            {
                ssmall=small;
                small=x;
            }
            else if(x<ssmall && x!=small)
            {
                ssmall=x;
            }
        }

        ans[0]=big;
        ans[1]=sbig;
        ans[2]=small;
        ans[3]=ssmall;

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number : ");
        int n=sc.nextInt();

        int arr[]=digits(n);

        int x[]=largeSmall(arr);

        System.out.println("Digits = "+countDigits(n));
        System.out.println("Duck = "+duck(arr));
        System.out.println("Armstrong = "+armstrong(n));
        System.out.println("Largest = "+x[0]);
        System.out.println("Second Largest = "+x[1]);
        System.out.println("Smallest = "+x[2]);
        System.out.println("Second Smallest = "+x[3]);

    }

}
