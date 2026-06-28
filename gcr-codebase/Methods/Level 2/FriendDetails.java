import java.util.Scanner;

public class FriendDetails {

    static int youngest(int arr[])
    {
        int pos=0;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[pos])
                pos=i;
        }

        return pos;
    }

    static int tallest(double arr[])
    {
        int pos=0;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[pos])
                pos=i;
        }

        return pos;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String names[]={"Amar","Akbar","Anthony"};

        int age[]=new int[3];
        double h[]=new double[3];

        for(int i=0;i<3;i++)
        {
            System.out.println(names[i]);

            System.out.print("Age : ");
            age[i]=sc.nextInt();

            System.out.print("Height : ");
            h[i]=sc.nextDouble();
        }

        int a=youngest(age);
        int b=tallest(h);

        System.out.println("Youngest : "+names[a]);
        System.out.println("Tallest : "+names[b]);

    }

}
