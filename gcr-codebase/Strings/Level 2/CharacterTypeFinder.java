import java.util.Scanner;

public class CharacterTypeFinder {

    static String check(char ch)
    {

        if(ch>='A' && ch<='Z')
            ch=(char)(ch+32);

        if(ch<'a' || ch>'z')
            return "Not Letter";

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            return "Vowel";

        return "Consonant";
    }

    static String[][] makeTable(String s)
    {

        String arr[][]=new String[s.length()][2];

        for(int i=0;i<s.length();i++)
        {
            arr[i][0]=String.valueOf(s.charAt(i));
            arr[i][1]=check(s.charAt(i));
        }

        return arr;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter text : ");
        String txt=sc.nextLine();

        String ans[][]=makeTable(txt);

        System.out.println();

        System.out.println("Character\tType");

        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i][0]+"\t\t"+ans[i][1]);
        }

    }

}
