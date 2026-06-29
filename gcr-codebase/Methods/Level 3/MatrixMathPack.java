public class MatrixMathPack {

    static int[][] randomMatrix(int r,int c)
    {
        int arr[][]=new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=(int)(Math.random()*9)+1;
            }
        }

        return arr;
    }

    static int[][] add(int a[][],int b[][])
    {
        int c[][]=new int[a.length][a[0].length];

        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                c[i][j]=a[i][j]+b[i][j];

        return c;
    }

    static int[][] sub(int a[][],int b[][])
    {
        int c[][]=new int[a.length][a[0].length];

        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                c[i][j]=a[i][j]-b[i][j];

        return c;
    }

    static int[][] mul(int a[][],int b[][])
    {
        int c[][]=new int[a.length][b[0].length];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                for(int k=0;k<b.length;k++)
                    c[i][j]+=a[i][k]*b[k][j];
            }
        }

        return c;
    }

    static void show(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
                System.out.print(arr[i][j]+" ");

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int a[][]=randomMatrix(2,2);
        int b[][]=randomMatrix(2,2);

        System.out.println("Addition");
        show(add(a,b));

        System.out.println("Subtraction");
        show(sub(a,b));

        System.out.println("Multiplication");
        show(mul(a,b));

    }

}
