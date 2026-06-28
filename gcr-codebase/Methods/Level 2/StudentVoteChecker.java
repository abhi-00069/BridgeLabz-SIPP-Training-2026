import java.util.Scanner;

public class StudentVoteChecker {

    static boolean canStudentVote(int age)
    {

        if(age<0)
            return false;

        if(age>=18)
            return true;

        return false;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int age[]=new int[10];

        for(int i=0;i<10;i++)
        {
            System.out.print("Age of Student "+(i+1)+" : ");
            age[i]=sc.nextInt();
        }

        System.out.println();

        for(int i=0;i<10;i++)
        {
            System.out.println("Student "+(i+1)+" -> "+canStudentVote(age[i]));
        }

    }

}
