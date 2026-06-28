import java.util.Scanner;

public class ChocolateShare {

    static int[] findRemainderAndQuotient(int choc,int kids)
    {

        int arr[]=new int[2];

        arr[0]=choc/kids;
        arr[1]=choc%kids;

        return arr;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Chocolates : ");
        int c=sc.nextInt();

        System.out.print("Children : ");
        int n=sc.nextInt();

        int ans[]=findRemainderAndQuotient(c,n);

        System.out.println("Each Child Gets = "+ans[0]);
        System.out.println("Remaining Chocolates = "+ans[1]);

    }

}
