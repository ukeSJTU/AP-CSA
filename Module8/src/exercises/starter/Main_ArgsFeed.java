package exercises.starter;

import java.util.Arrays;

public class Main_ArgsFeed {
    public static void main(String[] args) {
        Newsfeed_ArgsFeed feed;
        // TODO: Check if args[0] is "Robot" to initialize with robot topics, otherwise
        // if "Human" initialize with human topics, else use generic topics
        // Implement conditional logic to set topics based on args[0]
        String[] genericTopics = { "Opinion", "Tech", "Science", "Health" };
        feed = new Newsfeed_ArgsFeed(genericTopics);

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));
    }
}

class Newsfeed_ArgsFeed {
    String[] topics;

    public Newsfeed_ArgsFeed(String[] initialTopics) {
        topics = initialTopics;
    }
}
