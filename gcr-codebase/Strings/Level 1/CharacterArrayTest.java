import java.util.Scanner;

public class CharacterArrayTest {

    static char[] makeArray(String s)
    {
        char arr[]=new char[s.length()];

        for(int i=0;i<s.length();i++)
        {
            arr[i]=s.charAt(i);
        }

        return arr;
    }

    static boolean check(char a[],char b[])
    {
        if(a.length!=b.length)
        {
            return false;
        }

        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i])
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

        char x[]=makeArray(s);
        char y[]=s.toCharArray();

        System.out.println("Characters :");

        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }

        System.out.println();

        System.out.println("Same Array : "+check(x,y));

    }
}
