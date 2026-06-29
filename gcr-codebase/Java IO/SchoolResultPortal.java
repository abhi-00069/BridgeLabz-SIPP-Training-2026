import java.io.*;
import java.util.*;

public class SchoolResultPortal {

    public static void main(String[] args) {

        try{

            BufferedReader br=new BufferedReader(new FileReader("students.txt"));

            BufferedWriter bw=new BufferedWriter(new FileWriter("report.txt",true));

            String line;

            while((line=br.readLine())!=null)
            {

                String p[]=line.split(" ");

                String name=p[0];

                int m1=Integer.parseInt(p[1]);
                int m2=Integer.parseInt(p[2]);
                int m3=Integer.parseInt(p[3]);

                double avg=(m1+m2+m3)/3.0;

                bw.write(name+" Average = "+avg);
                bw.newLine();

            }

            br.close();
            bw.close();

            System.out.println("Report Written.");

        }
        catch(FileNotFoundException e){

            System.out.println("students.txt not found.");

        }
        catch(IOException e){

            System.out.println("File Error.");

        }

    }

}
