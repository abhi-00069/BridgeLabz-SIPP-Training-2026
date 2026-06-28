import java.util.Scanner;

public class SmallLargeFinder {

    static int[] findSmallestAndLargest(int a,int b,int c)
    {

        int ans[]=new int[2];

        int small=a;
        int big=a;

        if(b<small)
            small=b;

        if(c<small)
            small=c;

        if(b>big)
            big=b;

        if(c>big)
            big=c;

        ans[0]=small;
        ans[1]=big;

        return ans;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("First : ");
        int a=sc.nextInt();

        System.out.print("Second : ");
        int b=sc.nextInt();

        System.out.print("Third : ");
        int c=sc.nextInt();

        int arr[]=findSmallestAndLargest(a,b,c);

        System.out.println("Smallest = "+arr[0]);
        System.out.println("Largest = "+arr[1]);

    }

}
