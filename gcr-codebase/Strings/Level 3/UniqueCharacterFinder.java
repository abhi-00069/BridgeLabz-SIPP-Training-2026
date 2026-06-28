import java.util.Scanner;

public class UniqueCharacterFinder {

    static int myLength(String s)
    {
        int c=0;

        while(true)
        {
            try{
                s.charAt(c);
                c++;
            }
            catch(Exception e){
                break;
            }
        }

        return c;
    }

    static char[] unique(String s)
    {

        char temp[]=new char[myLength(s)];
        int k=0;

        for(int i=0;i<myLength(s);i++)
        {
            boolean ok=true;

            for(int j=0;j<i;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    ok=false;
                    break;
                }
            }

            if(ok)
            {
                temp[k]=s.charAt(i);
                k++;
            }
        }

        char ans[]=new char[k];

        for(int i=0;i<k;i++)
            ans[i]=temp[i];

        return ans;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter text : ");
        String txt=sc.nextLine();

        char arr[]=unique(txt);

        System.out.println("Unique Characters :");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

}
