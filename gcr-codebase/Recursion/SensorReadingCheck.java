import java.util.Scanner;

public class SensorReadingCheck {

    static boolean increasing(int arr[], int i)
    {
        if(i==arr.length-1)
            return true;

        if(arr[i]>=arr[i+1])
            return false;

        return increasing(arr,i+1);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size : ");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.println(increasing(arr,0));

    }

}
