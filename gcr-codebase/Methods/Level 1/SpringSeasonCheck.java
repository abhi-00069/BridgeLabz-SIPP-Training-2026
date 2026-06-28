import java.util.Scanner;

public class SpringSeasonCheck {

    static boolean spring(int m,int d)
    {

        if((m==3 && d>=20) || m==4 || m==5 || (m==6 && d<=20))
            return true;

        return false;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Month : ");
        int m=sc.nextInt();

        System.out.print("Day : ");
        int d=sc.nextInt();

        if(spring(m,d))
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");

    }

}
