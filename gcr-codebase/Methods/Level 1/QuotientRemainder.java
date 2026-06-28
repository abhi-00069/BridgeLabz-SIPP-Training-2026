import java.util.Scanner;

public class QuotientRemainder {

    static int[] findRemainderAndQuotient(int n,int d)
    {

        int arr[]=new int[2];

        arr[0]=n/d;
        arr[1]=n%d;

        return arr;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Number : ");
        int n=sc.nextInt();

        System.out.print("Divisor : ");
        int d=sc.nextInt();

        int ans[]=findRemainderAndQuotient(n,d);

        System.out.println("Quotient = "+ans[0]);
        System.out.println("Remainder = "+ans[1]);

    }

}
