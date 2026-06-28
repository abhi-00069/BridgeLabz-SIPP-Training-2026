import java.util.Scanner;

public class UniqueFrequency {

    static char[] unique(String s)
    {

        char temp[]=new char[s.length()];
        int k=0;

        for(int i=0;i<s.length();i++)
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

    static String[][] makeTable(String s)
    {

        char arr[]=unique(s);

        String ans[][]=new String[arr.length][2];

        for(int i=0;i<arr.length;i++)
        {
            int c=0;

            for(int j=0;j<s.length();j++)
            {
                if(arr[i]==s.charAt(j))
                    c++;
            }

            ans[i][0]=String.valueOf(arr[i]);
            ans[i][1]=String.valueOf(c);
        }

        return ans;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter text : ");
        String txt=sc.nextLine();

        String ans[][]=makeTable(txt);

        System.out.println("\nCharacter\tFrequency");

        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i][0]+"\t\t"+ans[i][1]);
        }

    }

}
