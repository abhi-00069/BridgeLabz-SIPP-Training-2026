import java.util.Scanner;

public class FootballHeightStats {

    static int[] createHeightArray()
    {
        int arr[]=new int[11];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=(int)(Math.random()*101)+150;
        }

        return arr;
    }

    static int sum(int arr[])
    {
        int s=0;

        for(int i=0;i<arr.length;i++)
            s=s+arr[i];

        return s;
    }

    static double mean(int arr[])
    {
        return (double)sum(arr)/arr.length;
    }

    static int shortest(int arr[])
    {
        int x=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<x)
                x=arr[i];
        }

        return x;
    }

    static int tallest(int arr[])
    {
        int x=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>x)
                x=arr[i];
        }

        return x;
    }

    public static void main(String[] args) {

        int arr[]=createHeightArray();

        System.out.print("Heights : ");

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println();

        System.out.println("Shortest = "+shortest(arr));
        System.out.println("Tallest = "+tallest(arr));
        System.out.println("Mean = "+mean(arr));

    }

}
