import java.util.Scanner;

public class FactorStorage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        int max = 10;
        int arr[] = new int[max];

        int idx = 0;

        for(int i=1;i<=num;i++)
        {

            if(num%i==0)
            {

                if(idx==max)
                {
                    max = max*2;

                    int temp[] = new int[max];

                    for(int j=0;j<arr.length;j++)
                    {
                        temp[j]=arr[j];
                    }

                    arr=temp;
                }

                arr[idx]=i;
                idx++;

            }

        }

        System.out.println("\nFactors are :");

        for(int i=0;i<idx;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

}
