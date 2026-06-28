import java.util.Scanner;

public class WordLengthTable {

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

    static String[] splitWords(String s)
    {

        int cnt=1;

        for(int i=0;i<myLength(s);i++)
        {
            if(s.charAt(i)==' ')
            cnt++;
        }

        String arr[]=new String[cnt];

        String t="";
        int j=0;

        for(int i=0;i<myLength(s);i++)
        {

            if(s.charAt(i)!=' ')
            {
                t=t+s.charAt(i);
            }
            else
            {
                arr[j]=t;
                j++;
                t="";
            }

        }

        arr[j]=t;

        return arr;

    }

    static String[][] makeTable(String arr[])
    {

        String ans[][]=new String[arr.length][2];

        for(int i=0;i<arr.length;i++)
        {
            ans[i][0]=arr[i];
            ans[i][1]=String.valueOf(myLength(arr[i]));
        }

        return ans;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter text : ");
        String txt=sc.nextLine();

        String words[]=splitWords(txt);

        String table[][]=makeTable(words);

        System.out.println();

        System.out.println("Word\tLength");

        for(int i=0;i<table.length;i++)
        {
            System.out.println(table[i][0]+"\t"+Integer.parseInt(table[i][1]));
        }

    }

}
