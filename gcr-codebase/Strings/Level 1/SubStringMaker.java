import java.util.Scanner;

public class SubStringMaker {

    static String makeSub(String s,int st,int end)
    {
        String ans="";

        for(int i=st;i<end;i++)
        {
            ans=ans+s.charAt(i);
        }

        return ans;
    }

    static boolean same(String a,String b)
    {
        if(a.length()!=b.length())
        {
            return false;
        }

        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=b.charAt(i))
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter string : ");
        String s=sc.next();

        System.out.print("Start index : ");
        int a=sc.nextInt();

        System.out.print("End index : ");
        int b=sc.nextInt();

        String x=makeSub(s,a,b);
        String y=s.substring(a,b);

        System.out.println("Own substring : "+x);
        System.out.println("Built in : "+y);

        System.out.println("Same : "+same(x,y));

    }
}
