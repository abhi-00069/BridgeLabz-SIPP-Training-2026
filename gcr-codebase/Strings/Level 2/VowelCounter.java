import java.util.Scanner;

public class VowelCounter {

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

    static int[] count(String s)
    {
        int ans[]=new int[2];

        for(int i=0;i<s.length();i++)
        {
            String x=check(s.charAt(i));

            if(x.equals("Vowel"))
                ans[0]++;

            else if(x.equals("Consonant"))
                ans[1]++;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter text : ");
        String txt=sc.nextLine();

        int a[]=count(txt);

        System.out.println("Vowels : "+a[0]);
        System.out.println("Consonants : "+a[1]);

    }

}
