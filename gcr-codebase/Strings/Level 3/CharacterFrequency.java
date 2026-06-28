import java.util.Scanner;

public class CharacterFrequency {

    static String[][] findFreq(String s)
    {
        int freq[]=new int[256];

        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)]++;
        }

        int cnt=0;

        for(int i=0;i<256;i++)
        {
            if(freq[i]>0)
                cnt++;
        }

        String ans[][]=new String[cnt][2];

        int k=0;

        for(int i=0;i<256;i++)
        {
            if(freq[i]>0)
            {
                ans[k][0]=String.valueOf((char)i);
                ans[k][1]=String.valueOf(freq[i]);
                k++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter text : ");
        String txt=sc.nextLine();

        String arr[][]=findFreq(txt);

        System.out.println("\nCharacter\tFrequency");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i][0]+"\t\t"+arr[i][1]);
        }

    }

}
