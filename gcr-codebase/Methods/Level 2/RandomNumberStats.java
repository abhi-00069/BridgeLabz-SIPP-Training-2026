import java.util.Scanner;

public class RandomNumberStats {

    static int[] generate4DigitRandomArray(int size)
    {

        int arr[]=new int[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=(int)(Math.random()*9000)+1000;
        }

        return arr;

    }

    static double[] findAverageMinMax(int arr[])
    {

        double ans[]=new double[3];

        int sum=0;

        int min=arr[0];
        int max=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];

            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }

        ans[0]=(double)sum/arr.length;
        ans[1]=min;
        ans[2]=max;

        return ans;

    }

    public static void main(String[] args) {

        int arr[]=generate4DigitRandomArray(5);

        System.out.println("Numbers :");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        double ans[]=findAverageMinMax(arr);

        System.out.println("Average = "+ans[0]);
        System.out.println("Minimum = "+(int)ans[1]);
        System.out.println("Maximum = "+(int)ans[2]);

    }

}
