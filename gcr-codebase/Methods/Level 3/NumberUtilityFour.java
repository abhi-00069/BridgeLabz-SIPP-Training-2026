import java.util.Scanner;

public class NumberUtilityFour {

    static int factorSum(int n)
    {
        int s=0;

        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                s+=i;
        }

        return s;
    }

    static boolean perfect(int n)
    {
        return factorSum(n)==n;
    }

    static boolean abundant(int n)
    {
        return factorSum(n)>n;
    }

    static boolean deficient(int n)
    {
        return factorSum(n)<n;
    }

    static int fact(int n)
    {
        int f=1;

        for(int i=1;i<=n;i++)
            f*=i;

        return f;
    }

    static boolean strong(int n)
    {
        int x=n;
        int s=0;

        while(x>0)
        {
            s+=fact(x%10);
            x/=10;
        }

        return s==n;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n=sc.nextInt();

        System.out.println("Perfect = "+perfect(n));
        System.out.println("Abundant = "+abundant(n));
        System.out.println("Deficient = "+deficient(n));
        System.out.println("Strong = "+strong(n));

    }

}
