public class EmployeeBonusChart {

    static double[][] makeData()
    {
        double arr[][]=new double[10][2];

        for(int i=0;i<10;i++)
        {
            arr[i][0]=(int)(Math.random()*90000)+10000;
            arr[i][1]=(int)(Math.random()*10)+1;
        }

        return arr;
    }

    static double[][] calc(double arr[][])
    {
        double ans[][]=new double[10][2];

        for(int i=0;i<10;i++)
        {
            double sal=arr[i][0];
            double year=arr[i][1];

            double bonus;

            if(year>5)
                bonus=sal*0.05;
            else
                bonus=sal*0.02;

            ans[i][0]=bonus;
            ans[i][1]=sal+bonus;
        }

        return ans;
    }

    public static void main(String[] args) {

        double oldData[][]=makeData();
        double newData[][]=calc(oldData);

        double oldSum=0,newSum=0,bonusSum=0;

        System.out.println("Salary\tYears\tBonus\tNew Salary");

        for(int i=0;i<10;i++)
        {
            System.out.printf("%.0f\t%.0f\t%.2f\t%.2f\n",
                    oldData[i][0],oldData[i][1],newData[i][0],newData[i][1]);

            oldSum+=oldData[i][0];
            bonusSum+=newData[i][0];
            newSum+=newData[i][1];
        }

        System.out.println();

        System.out.println("Old Salary Total = "+oldSum);
        System.out.println("Bonus Total = "+bonusSum);
        System.out.println("New Salary Total = "+newSum);

    }

}
