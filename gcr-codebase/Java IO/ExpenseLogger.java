import java.io.*;
import java.util.*;

public class ExpenseLogger {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        try{

            BufferedWriter bw=new BufferedWriter(new FileWriter("expenses.txt",true));

            System.out.print("Expense Name : ");
            String name=sc.nextLine();

            System.out.print("Amount : ");
            int amt=sc.nextInt();

            bw.write(name+" - "+amt);
            bw.newLine();

            bw.close();

            System.out.println("Expense Saved.");

        }
        catch(IOException e){

            System.out.println("File Error.");

        }

    }

}
