import java.util.Scanner;

public class LeapYearFinder {

    static boolean leap(int y)
    {

        if(y<1582)
            return false;

        if((y%400==0)||((y%4==0)&&(y%100!=0)))
            return true;

        return false;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Year : ");
        int y=sc.nextInt();

        if(leap(y))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");

    }

}
