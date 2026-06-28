import java.util.Scanner;

public class SixToNineTable {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number : ");
        int n=sc.nextInt();

        int ans[]=new int[4];

        int k=0;

        for(int i=6;i<=9;i++)
        {
            ans[k]=n*i;
            k++;
        }

        System.out.println();

        k=0;

        for(int i=6;i<=9;i++)
        {
            System.out.println(n+" x "+i+" = "+ans[k]);
            k++;
        }

    }

}
