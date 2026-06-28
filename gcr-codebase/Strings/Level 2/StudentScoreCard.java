import java.util.Scanner;

public class StudentScoreCard {

    static int[][] marks(int n)
    {

        Scanner sc=new Scanner(System.in);

        int arr[][]=new int[n][3];

        for(int i=0;i<n;i++)
        {

            System.out.println("\nStudent "+(i+1));

            for(int j=0;j<3;j++)
            {

                int x;

                while(true)
                {
                    x=(int)(Math.random()*91)+10;

                    if(x>=0)
                        break;
                }

                arr[i][j]=x;

            }

        }

        return arr;

    }

    static double[][] calculate(int arr[][])
    {

        double ans[][]=new double[arr.length][3];

        for(int i=0;i<arr.length;i++)
        {

            int total=0;

            for(int j=0;j<3;j++)
            {
                total=total+arr[i][j];
            }

            double avg=(double)total/3;
            double per=avg;

            avg=Math.round(avg*100.0)/100.0;
            per=Math.round(per*100.0)/100.0;

            ans[i][0]=total;
            ans[i][1]=avg;
            ans[i][2]=per;

        }

        return ans;

    }

    static String[] grade(double arr[][])
    {

        String g[]=new String[arr.length];

        for(int i=0;i<arr.length;i++)
        {

            double p=arr[i][2];

            if(p>=80)
                g[i]="A";
            else if(p>=70)
                g[i]="B";
            else if(p>=60)
                g[i]="C";
            else if(p>=50)
                g[i]="D";
            else if(p>=40)
                g[i]="E";
            else
                g[i]="R";

        }

        return g;

    }

    static void display(int m[][],double x[][],String g[])
    {

        System.out.println();

        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPer\tGrade");

        for(int i=0;i<m.length;i++)
        {

            System.out.println(
                    m[i][0]+"\t"+
                    m[i][1]+"\t"+
                    m[i][2]+"\t"+
                    x[i][0]+"\t"+
                    x[i][1]+"\t"+
                    x[i][2]+"\t"+
                    g[i]
            );

        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Number of Students : ");
        int n=sc.nextInt();

        int marks[][]=marks(n);

        double ans[][]=calculate(marks);

        String grade[]=grade(ans);

        display(marks,ans,grade);

    }

}
