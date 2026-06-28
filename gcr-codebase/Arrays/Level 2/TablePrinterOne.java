import java.util.Scanner;

public class TablePrinterOne {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number : ");
        int num=sc.nextInt();

        int table[]=new int[10];

        for(int i=1;i<=10;i++)
        {
            table[i-1]=num*i;
        }

        System.out.println();

        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" x "+i+" = "+table[i-1]);
        }

    }

}
