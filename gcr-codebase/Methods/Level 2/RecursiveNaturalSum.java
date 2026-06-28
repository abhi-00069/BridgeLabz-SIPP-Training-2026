import java.util.Scanner;

public class RecursiveNaturalSum {

    static int rec(int n)
    {
        if(n==1)
            return 1;

        return n+rec(n-1);
    }

    static int formula(int n)
    {
        return n*(n+1)/2;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n : ");
        int n=sc.nextInt();

        if(n<=0)
        {
            System.out.println("Not Natural Number");
            return;
        }

        int a=rec(n);
        int b=formula(n);

        System.out.println("Recursive Sum = "+a);
        System.out.println("Formula Sum = "+b);

        if(a==b)
            System.out.println("Both Answers are Same");

    }

}
