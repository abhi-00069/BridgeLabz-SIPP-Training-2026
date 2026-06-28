import java.util.Scanner;

public class StudentVoteCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter age of student "+(i+1)+": ");
            arr[i]=sc.nextInt();
        }

        System.out.println();

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]<0)
            {
                System.out.println("Invalid age");
            }
            else if(arr[i]>=18)
            {
                System.out.println("The student with age "+arr[i]+" can vote.");
            }
            else
            {
                System.out.println("The student with age "+arr[i]+" cannot vote.");
            }

        }

    }

}
