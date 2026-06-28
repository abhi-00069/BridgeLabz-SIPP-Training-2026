import java.util.Scanner;

public class NestedFrequency {

    static void find(String s)
    {

        char arr[]=s.toCharArray();
        int freq[]=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            freq[i]=1;

            if(arr[i]=='0')
                continue;

            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    freq[i]++;
                    arr[j]='0';
                }
            }
        }

        System.out.println("\nCharacter\tFrequency");

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!='0')
            {
                System.out.println(arr[i]+"\t\t"+freq[i]);
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter text : ");
        String txt=sc.nextLine();

        find(txt);

    }

}
