import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeSkillTeam {

    static void find(int arr[],int target,int idx,ArrayList<Integer> temp,int sum)
    {

        if(sum==target)
        {
            System.out.println(temp);
            return;
        }

        if(idx==arr.length || sum>target)
            return;

        temp.add(arr[idx]);
        find(arr,target,idx+1,temp,sum+arr[idx]);

        temp.remove(temp.size()-1);
        find(arr,target,idx+1,temp,sum);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Size : ");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.print("Target : ");
        int target=sc.nextInt();

        System.out.println("Possible Teams :");

        find(arr,target,0,new ArrayList<Integer>(),0);

    }

}
