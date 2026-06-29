import java.util.Scanner;

public class SpecialNumberPack {

    static boolean prime(int n)
    {
        if(n<2)
            return false;

        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                return false;
        }

        return true;
    }

    static boolean neon(int n)
    {
        int sq=n*n;
        int s=0;

        while(sq>0)
        {
            s=s+sq%10;
            sq/=10;
        }

        return s==n;
    }

    static boolean spy(int n)
    {
        int s=0,p=1,x=n;

        while(x>0)
        {
            int d=x%10;
            s+=d;
            p*=d;
            x/=10;
        }

        return s==p;
    }

    static boolean automorphic(int n)
    {
        int sq=n*n;

        return String.valueOf(sq).endsWith(String.valueOf(n));
    }

    static boolean buzz(int n)
    {
        return n%7==0 || n%10==7;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n=sc.nextInt();

        System.out.println("Prime = "+prime(n));
        System.out.println("Neon = "+neon(n));
        System.out.println("Spy = "+spy(n));
        System.out.println("Automorphic = "+automorphic(n));
        System.out.println("Buzz = "+buzz(n));

    }

}
