import java.util.Scanner;

public class BMIReport {

    static String[][] findBMI(double arr[][])
    {
        String ans[][] = new String[10][4];

        for(int i=0;i<10;i++)
        {
            double wt = arr[i][0];
            double ht = arr[i][1]/100.0;

            double bmi = wt/(ht*ht);

            String st;

            if(bmi<=18.4)
                st="Underweight";
            else if(bmi<=24.9)
                st="Normal";
            else if(bmi<=39.9)
                st="Overweight";
            else
                st="Obese";

            ans[i][0]=String.valueOf(arr[i][1]);
            ans[i][1]=String.valueOf(arr[i][0]);
            ans[i][2]=String.format("%.2f",bmi);
            ans[i][3]=st;
        }

        return ans;
    }

    static void display(String arr[][])
    {
        System.out.println("\nHeight\tWeight\tBMI\tStatus");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i][0]+"\t"+arr[i][1]+"\t"+arr[i][2]+"\t"+arr[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        double data[][]=new double[10][2];

        for(int i=0;i<10;i++)
        {
            System.out.println("Person "+(i+1));
            System.out.print("Weight : ");
            data[i][0]=sc.nextDouble();

            System.out.print("Height(cm) : ");
            data[i][1]=sc.nextDouble();
        }

        String ans[][]=findBMI(data);

        display(ans);

    }

}
