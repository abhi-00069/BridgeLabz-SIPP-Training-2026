import java.util.Scanner;

public class PalindromeChecker {

    static boolean method1(String s)
    {
        int i=0;
        int j=s.length()-1;

        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

    static boolean method2(String s,int i,int j)
    {
        if(i>=j)
            return true;

        if(s.charAt(i)!=s.charAt(j))
            return false;

        return method2(s,i+1,j-1);
    }

    static String reverse(String s)
    {
        String ans="";

        for(int i=s.length()-1;i>=0;i--)
        {
            ans=ans+s.charAt(i);
        }

        return ans;
    }

    static boolean method3(String s)
    {
        String rev=reverse(s);

        char a[]=s.toCharArray();
        char b[]=rev.toCharArray();

        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter text : ");
        String txt=sc.nextLine();

        System.out.println("Method 1 : "+method1(txt));
        System.out.println("Method 2 : "+method2(txt,0,txt.length()-1));
        System.out.println("Method 3 : "+method3(txt));

    }

}
