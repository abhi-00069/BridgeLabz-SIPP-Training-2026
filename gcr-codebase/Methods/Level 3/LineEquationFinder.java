import java.util.Scanner;

public class LineEquationFinder {

    static double distance(double x1,double y1,double x2,double y2)
    {
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

    static double[] line(double x1,double y1,double x2,double y2)
    {
        double arr[]=new double[2];

        double m=(y2-y1)/(x2-x1);
        double b=y1-m*x1;

        arr[0]=m;
        arr[1]=b;

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("x1 : ");
        double x1=sc.nextDouble();

        System.out.print("y1 : ");
        double y1=sc.nextDouble();

        System.out.print("x2 : ");
        double x2=sc.nextDouble();

        System.out.print("y2 : ");
        double y2=sc.nextDouble();

        System.out.println("Distance = "+distance(x1,y1,x2,y2));

        double ans[]=line(x1,y1,x2,y2);

        System.out.println("Slope = "+ans[0]);
        System.out.println("Intercept = "+ans[1]);

    }

}
