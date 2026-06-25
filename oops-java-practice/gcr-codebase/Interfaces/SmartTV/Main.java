interface StreamingService{

    void streamMovie(String movie);

    default void showSubscriptionDetails(){
        System.out.println("Streaming Subscription Active");
    }
}

interface GamingService{

    void playGame(String game);

    default void showSubscriptionDetails(){
        System.out.println("Gaming Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService{

    public void streamMovie(String movie){
        System.out.println("Playing Movie : "+movie);
    }

    public void playGame(String game){
        System.out.println("Launching Game : "+game);
    }

    public void showSubscriptionDetails(){
        System.out.println("Streaming + Gaming Subscription");
    }
}

public class Main{

    public static void main(String[] args){

        SmartTV tv = new SmartTV();

        String movies[] = {
                "Avengers",
                "Inception",
                "Interstellar"
        };

        String games[] = {
                "FIFA",
                "Minecraft",
                "PUBG"
        };

        for(String m : movies){
            tv.streamMovie(m);
        }

        for(String g : games){
            tv.playGame(g);
        }

        tv.showSubscriptionDetails();
    }
}
