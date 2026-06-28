import java.util.Scanner;

public class LengthFinder {

    static int myLength(String s)
    {
        int cnt=0;

        while(true)
        {
            try
            {
                s.charAt(cnt);
                cnt++;
            }
            catch(Exception e)
            {
                break;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter string : ");
        String txt=sc.next();

        int a=myLength(txt);

        System.out.println("Own Length : "+a);
        System.out.println("Built In : "+txt.length());

    }

}
