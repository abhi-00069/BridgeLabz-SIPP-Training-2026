import java.util.Scanner;

public class CollinearPointFinder {

    static boolean slopeWay(double x1,double y1,double x2,double y2,double x3,double y3)
    {
        double a=(y2-y1)*(x3-x2);
        double b=(y3-y2)*(x2-x1);

        return a==b;
    }

    static boolean areaWay(double x1,double y1,double x2,double y2,double x3,double y3)
    {
        double area=x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2);

        return area==0;
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

        System.out.print("x3 : ");
        double x3=sc.nextDouble();

        System.out.print("y3 : ");
        double y3=sc.nextDouble();

        System.out.println("Slope Method : "+slopeWay(x1,y1,x2,y2,x3,y3));
        System.out.println("Area Method : "+areaWay(x1,y1,x2,y2,x3,y3));

    }

}
