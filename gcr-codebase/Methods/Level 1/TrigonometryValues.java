import java.util.Scanner;

public class TrigonometryValues {

    static double[] calculateTrigonometricFunctions(double angle)
    {

        double arr[]=new double[3];

        double r=Math.toRadians(angle);

        arr[0]=Math.sin(r);
        arr[1]=Math.cos(r);
        arr[2]=Math.tan(r);

        return arr;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Angle in Degrees : ");
        double a=sc.nextDouble();

        double ans[]=calculateTrigonometricFunctions(a);

        System.out.println("Sin = "+ans[0]);
        System.out.println("Cos = "+ans[1]);
        System.out.println("Tan = "+ans[2]);

    }

}
