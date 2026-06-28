import java.util.Scanner;

public class NumberCollector {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double arr[] = new double[10];
        double total = 0;

        int i = 0;

        while(true)
        {
            System.out.print("Enter number : ");
            double x = sc.nextDouble();

            if(x<=0)
            {
                break;
            }

            if(i==10)
            {
                break;
            }

            arr[i]=x;
            i++;

        }

        System.out.println("\nNumbers are:");

        for(int j=0;j<i;j++)
        {
            System.out.println(arr[j]);
            total = total + arr[j];
        }

        System.out.println("Sum = "+total);

    }

}
