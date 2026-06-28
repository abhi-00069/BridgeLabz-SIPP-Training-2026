import java.util.Scanner;

public class ConverterUtility {

    static double convertFahrenheitToCelsius(double f)
    {
        return (f-32)*5/9;
    }

    static double convertCelsiusToFahrenheit(double c)
    {
        return (c*9/5)+32;
    }

    static double convertPoundsToKg(double p)
    {
        return p*0.453592;
    }

    static double convertKgToPounds(double k)
    {
        return k*2.20462;
    }

    static double convertGallonsToLiters(double g)
    {
        return g*3.78541;
    }

    static double convertLitersToGallons(double l)
    {
        return l*0.264172;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Fahrenheit : ");
        double f=sc.nextDouble();

        System.out.print("Celsius : ");
        double c=sc.nextDouble();

        System.out.print("Pounds : ");
        double p=sc.nextDouble();

        System.out.print("Kilograms : ");
        double k=sc.nextDouble();

        System.out.print("Gallons : ");
        double g=sc.nextDouble();

        System.out.print("Liters : ");
        double l=sc.nextDouble();

        System.out.println("F to C = "+convertFahrenheitToCelsius(f));
        System.out.println("C to F = "+convertCelsiusToFahrenheit(c));
        System.out.println("Pounds to Kg = "+convertPoundsToKg(p));
        System.out.println("Kg to Pounds = "+convertKgToPounds(k));
        System.out.println("Gallons to Liters = "+convertGallonsToLiters(g));
        System.out.println("Liters to Gallons = "+convertLitersToGallons(l));

    }

}
