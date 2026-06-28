import java.util.Scanner;

public class SpaceTrimmer {

    static int[] findPos(String s)
    {
        int a=0;
        int b=s.length()-1;

        while(a<s.length() && s.charAt(a)==' ')
        {
            a++;
        }

        while(b>=0 && s.charAt(b)==' ')
        {
            b--;
        }

        int arr[]=new int[2];
        arr[0]=a;
        arr[1]=b;

        return arr;
    }

    static String makeSub(String s,int st,int end)
    {
        String ans="";

        for(int i=st;i<=end;i++)
        {
            ans=ans+s.charAt(i);
        }

        return ans;
    }

    static boolean same(String a,String b)
    {

        if(a.length()!=b.length())
            return false;

        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=b.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter text : ");
        String txt=sc.nextLine();

        int x[]=findPos(txt);

        String one=makeSub(txt,x[0],x[1]);
        String two=txt.trim();

        System.out.println("Own Trim : "+one);
        System.out.println("Built In : "+two);

        System.out.println("Same : "+same(one,two));

    }

}
