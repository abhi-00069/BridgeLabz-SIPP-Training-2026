import java.util.Scanner;

public class StudentVoteTable {

    static int[] takeAge(int n)
    {

        Scanner sc=new Scanner(System.in);

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {

            System.out.print("Enter age of student "+(i+1)+" : ");
            arr[i]=sc.nextInt();

        }

        return arr;

    }

    static String[][] checkVote(int arr[])
    {

        String ans[][]=new String[arr.length][2];

        for(int i=0;i<arr.length;i++)
        {

            ans[i][0]=String.valueOf(arr[i]);

            if(arr[i]<0)
            {
                ans[i][1]="Invalid";
            }
            else if(arr[i]>=18)
            {
                ans[i][1]="True";
            }
            else
            {
                ans[i][1]="False";
            }

        }

        return ans;

    }

    static void display(String arr[][])
    {

        System.out.println();

        System.out.println("Age\tCan Vote");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i][0]+"\t"+arr[i][1]);
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Number of students : ");
        int n=sc.nextInt();

        int age[]=takeAge(n);

        String ans[][]=checkVote(age);

        display(ans);

    }

}
