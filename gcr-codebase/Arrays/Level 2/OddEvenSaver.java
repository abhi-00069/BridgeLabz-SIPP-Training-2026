import java.util.Scanner;

public class OddEvenSaver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number : ");
        int n = sc.nextInt();

        if(n<=0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int odd[] = new int[n/2 + 1];
        int even[] = new int[n/2 + 1];

        int a=0;
        int b=0;

        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                even[b]=i;
                b++;
            }
            else
            {
                odd[a]=i;
                a++;
            }
        }

        System.out.println("\nOdd Numbers :");

        for(int i=0;i<a;i++)
        {
            System.out.print(odd[i]+" ");
        }

        System.out.println("\n");

        System.out.println("Even Numbers :");

        for(int i=0;i<b;i++)
        {
            System.out.print(even[i]+" ");
        }

    }

}
