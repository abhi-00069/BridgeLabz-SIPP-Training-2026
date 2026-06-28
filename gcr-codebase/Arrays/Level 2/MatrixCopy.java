import java.util.Scanner;

public class MatrixCopy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Rows : ");
        int r = sc.nextInt();

        System.out.print("Columns : ");
        int c = sc.nextInt();

        int mat[][] = new int[r][c];

        System.out.println("Enter elements :");

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }

        int arr[] = new int[r*c];

        int k=0;

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[k]=mat[i][j];
                k++;
            }
        }

        System.out.println("\n1D Array :");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

}
