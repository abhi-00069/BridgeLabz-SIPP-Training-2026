import java.util.Scanner;

public class DistanceConverter {

    static double convertKmToMiles(double km)
    {
        return km*0.621371;
    }

    static double convertMilesToKm(double m)
    {
        return m*1.60934;
    }

    static double convertMetersToFeet(double m)
    {
        return m*3.28084;
    }

    static double convertFeetToMeters(double f)
    {
        return f*0.3048;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Kilometers : ");
        double km=sc.nextDouble();

        System.out.print("Miles : ");
        double miles=sc.nextDouble();

        System.out.print("Meters : ");
        double meter=sc.nextDouble();

        System.out.print("Feet : ");
        double feet=sc.nextDouble();

        System.out.println("Km to Miles = "+convertKmToMiles(km));
        System.out.println("Miles to Km = "+convertMilesToKm(miles));
        System.out.println("Meters to Feet = "+convertMetersToFeet(meter));
        System.out.println("Feet to Meters = "+convertFeetToMeters(feet));

    }

}
