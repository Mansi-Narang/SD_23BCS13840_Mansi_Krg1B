import java.util.*;

interface SocialMedia{
    public void publishPost();
    public void getFeed();
}

interface ChatApp{
    public void chat();
}

class Instagram implements SocialMedia, ChatApp{
    @Override
    public void publishPost(){
        // post published 
        System.out.println("Post Published");
    }
    @Override
    public void getFeed(){
        // feed of all following
        System.out.println("Feed");
    }
    public void chat(){
        // real time chat 
        System.out.println("Chat");
    }
};

class Whatsapp implements ChatApp{
    @Override
    public void chat(){
        // real time chat
        System.out.println("Chat with contacts");
    }
};

public class LSP{
    public static void main(String[] args){
        SocialMedia insta = new Instagram();
        insta.getFeed();
        insta.publishPost();

        ChatApp whatsapp = new Whatsapp();
        whatsapp.chat();
    }
};
