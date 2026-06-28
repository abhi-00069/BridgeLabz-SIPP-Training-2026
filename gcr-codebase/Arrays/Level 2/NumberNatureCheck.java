import java.util.Scanner;

public class NumberNatureCheck {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int nums[]=new int[5];

        for(int i=0;i<nums.length;i++)
        {
            System.out.print("Enter number : ");
            nums[i]=sc.nextInt();
        }

        System.out.println();

        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]>0)
            {

                if(nums[i]%2==0)
                {
                    System.out.println(nums[i]+" is Positive Even");
                }
                else
                {
                    System.out.println(nums[i]+" is Positive Odd");
                }

            }
            else if(nums[i]<0)
            {
                System.out.println(nums[i]+" is Negative");
            }
            else
            {
                System.out.println(nums[i]+" is Zero");
            }

        }

        System.out.println();

        if(nums[0]==nums[4])
        {
            System.out.println("First and Last elements are Equal");
        }
        else if(nums[0]>nums[4])
        {
            System.out.println("First element is Greater");
        }
        else
        {
            System.out.println("First element is Smaller");
        }

    }

}
