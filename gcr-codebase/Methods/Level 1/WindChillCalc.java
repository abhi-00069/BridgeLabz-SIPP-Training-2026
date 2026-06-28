import java.util.Scanner;

public class WindChillCalc {

    static double calculateWindChill(double t,double v)
    {

        double w;

        w=35.74+(0.6215*t)-35.75*Math.pow(v,0.16)
                +0.4275*t*Math.pow(v,0.16);

        return w;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Temperature : ");
        double t=sc.nextDouble();

        System.out.print("Wind Speed : ");
        double v=sc.nextDouble();

        System.out.println("Wind Chill = "+calculateWindChill(t,v));

    }

}
