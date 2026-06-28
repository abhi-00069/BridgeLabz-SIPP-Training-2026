import java.util.Scanner;

public class TriangleRun {

    static double rounds(double a,double b,double c)
    {
        double p=a+b+c;

        return 5000/p;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Side 1 : ");
        double a=sc.nextDouble();

        System.out.print("Side 2 : ");
        double b=sc.nextDouble();

        System.out.print("Side 3 : ");
        double c=sc.nextDouble();

        System.out.println("Rounds = "+rounds(a,b,c));

    }

}
