import java.util.Scanner;

public class QuadraticRoots {

    static double[] roots(double a,double b,double c)
    {

        double d=b*b-4*a*c;

        if(d<0)
            return new double[0];

        double ans[];

        if(d==0)
        {
            ans=new double[1];
            ans[0]=-b/(2*a);
        }
        else
        {
            ans=new double[2];

            ans[0]=(-b+Math.sqrt(d))/(2*a);
            ans[1]=(-b-Math.sqrt(d))/(2*a);
        }

        return ans;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("a : ");
        double a=sc.nextDouble();

        System.out.print("b : ");
        double b=sc.nextDouble();

        System.out.print("c : ");
        double c=sc.nextDouble();

        double ans[]=roots(a,b,c);

        if(ans.length==0)
        {
            System.out.println("No Real Roots");
        }
        else
        {
            for(int i=0;i<ans.length;i++)
                System.out.println("Root "+(i+1)+" = "+ans[i]);
        }

    }

}
