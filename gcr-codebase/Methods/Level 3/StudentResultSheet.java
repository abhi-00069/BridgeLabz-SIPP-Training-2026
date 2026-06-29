public class StudentResultSheet {

    static int[][] marks(int n)
    {
        int arr[][]=new int[n][3];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=(int)(Math.random()*90)+10;
            }
        }
        return arr;
    }

    static double[][] report(int arr[][])
    {
        double ans[][]=new double[arr.length][3];

        for(int i=0;i<arr.length;i++)
        {
            int total=0;

            for(int j=0;j<3;j++)
                total+=arr[i][j];

            double avg=(double)total/3;
            double per=avg;

            ans[i][0]=total;
            ans[i][1]=Math.round(avg*100)/100.0;
            ans[i][2]=Math.round(per*100)/100.0;
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[][]=marks(5);

        double ans[][]=report(arr);

        System.out.println("P\tC\tM\tTotal\tAvg\tPer");

        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d\t%d\t%d\t%.0f\t%.2f\t%.2f\n",
                    arr[i][0],arr[i][1],arr[i][2],
                    ans[i][0],ans[i][1],ans[i][2]);
        }

    }

}
