import java.util.Scanner;

public class UpperCaseMaker {

    static String myUpper(String s)
    {

        String ans="";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(ch>='a' && ch<='z')
            {
                ch=(char)(ch-32);
            }

            ans=ans+ch;
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

        System.out.print("Enter text : ");
        String txt=sc.nextLine();

        String x=myUpper(txt);
        String y=txt.toUpperCase();

        System.out.println("Own Method : "+x);
        System.out.println("Built In : "+y);

        System.out.println("Same : "+same(x,y));

    }

}
