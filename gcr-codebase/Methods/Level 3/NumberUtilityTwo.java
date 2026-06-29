import java.util.Scanner;

public class NumberUtilityTwo {

    static int count(int n)
    {
        int c=0;

        while(n>0)
        {
            c++;
            n=n/10;
        }

        return c;
    }

    static int[] digits(int n)
    {
        int arr[]=new int[count(n)];

        for(int i=arr.length-1;i>=0;i--)
        {
            arr[i]=n%10;
            n=n/10;
        }

        return arr;
    }

    static int sum(int arr[])
    {
        int s=0;

        for(int x:arr)
            s=s+x;

        return s;
    }

    static int squareSum(int arr[])
    {
        int s=0;

        for(int x:arr)
            s=s+(int)Math.pow(x,2);

        return s;
    }

    static boolean harshad(int n,int arr[])
    {
        return n%sum(arr)==0;
    }

    static int[][] frequency(int arr[])
    {
        int f[]=new int[10];

        for(int x:arr)
            f[x]++;

        int c=0;

        for(int i=0;i<10;i++)
        {
            if(f[i]>0)
                c++;
        }

        int ans[][]=new int[c][2];

        int k=0;

        for(int i=0;i<10;i++)
        {
            if(f[i]>0)
            {
                ans[k][0]=i;
                ans[k][1]=f[i];
                k++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number : ");
        int n=sc.nextInt();

        int arr[]=digits(n);

        System.out.println("Sum = "+sum(arr));
        System.out.println("Square Sum = "+squareSum(arr));
        System.out.println("Harshad = "+harshad(n,arr));

        int ans[][]=frequency(arr);

        System.out.println("Digit\tFreq");

        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i][0]+"\t"+ans[i][1]);
        }

    }

}
