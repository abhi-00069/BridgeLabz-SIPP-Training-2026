public class MatrixAdvanceOps {

    static int[][] randomMatrix()
    {
        int arr[][]=new int[2][2];

        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                arr[i][j]=(int)(Math.random()*9)+1;

        return arr;
    }

    static int[][] transpose(int a[][])
    {
        int t[][]=new int[2][2];

        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                t[j][i]=a[i][j];

        return t;
    }

    static int determinant(int a[][])
    {
        return a[0][0]*a[1][1]-a[0][1]*a[1][0];
    }

    static void inverse(int a[][])
    {
        int d=determinant(a);

        if(d==0)
        {
            System.out.println("Inverse Not Possible");
            return;
        }

        System.out.println("Inverse");

        System.out.printf("%.2f %.2f\n",
                (double)a[1][1]/d,
                (double)-a[0][1]/d);

        System.out.printf("%.2f %.2f\n",
                (double)-a[1][0]/d,
                (double)a[0][0]/d);
    }

    static void show(int a[][])
    {
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
                System.out.print(a[i][j]+" ");

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[][]=randomMatrix();

        System.out.println("Matrix");
        show(arr);

        System.out.println("Transpose");
        show(transpose(arr));

        System.out.println("Determinant = "+determinant(arr));

        inverse(arr);

    }

}
