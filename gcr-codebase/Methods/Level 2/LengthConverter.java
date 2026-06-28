import java.util.Scanner;

public class LengthConverter {

    static double convertYardsToFeet(double y)
    {
        return y*3;
    }

    static double convertFeetToYards(double f)
    {
        return f*0.333333;
    }

    static double convertMetersToInches(double m)
    {
        return m*39.3701;
    }

    static double convertInchesToMeters(double i)
    {
        return i*0.0254;
    }

    static double convertInchesToCm(double i)
    {
        return i*2.54;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Yards : ");
        double y=sc.nextDouble();

        System.out.print("Feet : ");
        double f=sc.nextDouble();

        System.out.print("Meters : ");
        double m=sc.nextDouble();

        System.out.print("Inches : ");
        double in=sc.nextDouble();

        System.out.println("Yards to Feet = "+convertYardsToFeet(y));
        System.out.println("Feet to Yards = "+convertFeetToYards(f));
        System.out.println("Meters to Inches = "+convertMetersToInches(m));
        System.out.println("Inches to Meters = "+convertInchesToMeters(in));
        System.out.println("Inches to Cm = "+convertInchesToCm(in));

    }

}
