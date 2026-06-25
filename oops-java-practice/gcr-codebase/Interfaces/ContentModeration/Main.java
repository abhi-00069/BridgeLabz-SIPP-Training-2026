interface TextModeration{

    boolean isOffensive(String post);

    default void displayModerationPolicy(){
        System.out.println("No offensive language allowed");
    }

    static boolean containsRestrictedWords(String post){
        String bad[] = {"hate","abuse","badword"};

        post = post.toLowerCase();

        for(String x : bad){
            if(post.contains(x)){
                return true;
            }
        }

        return false;
    }
}

interface SpamDetection{

    boolean isSpam(String post);

    default void displayModerationPolicy(){
        System.out.println("No spam posts allowed");
    }
}

class ContentModerator implements TextModeration, SpamDetection{

    public boolean isOffensive(String post){
        return TextModeration.containsRestrictedWords(post);
    }

    public boolean isSpam(String post){

        post = post.toLowerCase();

        if(post.contains("buy now") || post.contains("http")){
            return true;
        }

        return false;
    }

    public void displayModerationPolicy(){
        System.out.println("No Spam and No Offensive Posts");
    }
}

public class Main{

    public static void main(String[] args){

        String posts[] = {
                "Hello everyone",
                "BUY NOW limited offer",
                "I hate this game",
                "Visit http://abc.com",
                "Have a nice day"
        };

        ContentModerator obj = new ContentModerator();

        obj.displayModerationPolicy();

        for(String p : posts){

            if(obj.isSpam(p)){
                System.out.println("Spam : "+p);
            }
            else if(obj.isOffensive(p)){
                System.out.println("Offensive : "+p);
            }
            else{
                System.out.println("Valid : "+p);
            }
        }
    }
}
