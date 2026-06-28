import java.util.Scanner;

public class SmallBigWord {

    static int myLength(String s)
    {
        int c=0;

        while(true)
        {
            try
            {
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

    static String[] splitText(String s)
    {
        int words=1;

        for(int i=0;i<myLength(s);i++)
        {
            if(s.charAt(i)==' ')
                words++;
        }

        String arr[]=new String[words];

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

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter text : ");
        String txt=sc.nextLine();

        String arr[]=splitText(txt);

        String small=arr[0];
        String big=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(myLength(arr[i])<myLength(small))
                small=arr[i];

            if(myLength(arr[i])>myLength(big))
                big=arr[i];
        }

        System.out.println("Shortest Word : "+small);
        System.out.println("Longest Word : "+big);

    }

}
