import java.util.Scanner;

public class WordSplitter {

    static int myLength(String s)
    {
        int c=0;

        while(true)
        {
            try{
                s.charAt(c);
                c++;
            }
            catch(Exception e)
            {
                break;
            }
        }

        return c;
    }

    static String[] makeWords(String s)
    {

        int count=1;

        for(int i=0;i<myLength(s);i++)
        {
            if(s.charAt(i)==' ')
            count++;
        }

        String arr[]=new String[count];

        String temp="";
        int k=0;

        for(int i=0;i<myLength(s);i++)
        {
            if(s.charAt(i)!=' ')
            {
                temp=temp+s.charAt(i);
            }
            else
            {
                arr[k]=temp;
                temp="";
                k++;
            }
        }

        arr[k]=temp;

        return arr;

    }

    static boolean check(String a[],String b[])
    {

        if(a.length!=b.length)
        return false;

        for(int i=0;i<a.length;i++)
        {
            if(!a[i].equals(b[i]))
            return false;
        }

        return true;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter text : ");
        String txt=sc.nextLine();

        String x[]=makeWords(txt);

        String y[]=txt.split(" ");

        System.out.println("Same : "+check(x,y));

    }

}
