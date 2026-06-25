interface Trackable{
    void logActivity(String act);

    default void resetData(){
        System.out.println("All activity data cleared");
    }
}

interface Reportable{
    void generateReport();
}

interface Notifiable{
    void sendAlert(String msg);
}

class FitnessDevice implements Trackable, Reportable, Notifiable{

    String arr[] = new String[10];
    int n = 0;

    public void logActivity(String act){
        arr[n++] = act;
    }

    public void generateReport(){
        System.out.println("Activity Report");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public void sendAlert(String msg){
        System.out.println("Alert : "+msg);
    }
}

public class Main{
    public static void main(String[] args){

        FitnessDevice x = new FitnessDevice();

        x.logActivity("Running");
        x.logActivity("Cycling");
        x.logActivity("Walking");

        x.generateReport();
        x.sendAlert("Drink Water");
        x.resetData();
    }
}
