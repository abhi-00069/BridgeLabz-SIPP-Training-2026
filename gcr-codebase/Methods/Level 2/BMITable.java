import java.util.Scanner;

public class BMITable {

    static void findBMI(double arr[][])
    {

        for(int i=0;i<arr.length;i++)
        {
            double h=arr[i][1]/100.0;

            arr[i][2]=arr[i][0]/(h*h);
        }

    }

    static String[] status(double arr[][])
    {

        String ans[]=new String[arr.length];

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i][2]<=18.4)
                ans[i]="Underweight";
            else if(arr[i][2]<=24.9)
                ans[i]="Normal";
            else if(arr[i][2]<=39.9)
                ans[i]="Overweight";
            else
                ans[i]="Obese";

        }

        return ans;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double arr[][]=new double[10][3];

        for(int i=0;i<10;i++)
        {
            System.out.println("Person "+(i+1));

            System.out.print("Weight : ");
            arr[i][0]=sc.nextDouble();

            System.out.print("Height(cm) : ");
            arr[i][1]=sc.nextDouble();
        }

        findBMI(arr);

        String st[]=status(arr);

        System.out.println();

        System.out.println("Weight\tHeight\tBMI\tStatus");

        for(int i=0;i<10;i++)
        {
            System.out.printf("%.1f\t%.1f\t%.2f\t%s\n",
                    arr[i][0],arr[i][1],arr[i][2],st[i]);
        }

    }

}
