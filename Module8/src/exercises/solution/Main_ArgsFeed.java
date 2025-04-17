package exercises.solution;

import java.util.Arrays;

public class Main_ArgsFeed {
    public static void main(String[] args) {
        Newsfeed_ArgsFeed feed;
        if (args.length > 0 && args[0].equals("Robot")) {
            String[] robotTopics = { "Oil", "Parts", "Algorithms", "Love" };
            feed = new Newsfeed_ArgsFeed(robotTopics);
        } else if (args.length > 0 && args[0].equals("Human")) {
            String[] humanTopics = { "Politics", "Science", "Sports", "Love" };
            feed = new Newsfeed_ArgsFeed(humanTopics);
        } else {
            String[] genericTopics = { "Opinion", "Tech", "Science", "Health" };
            feed = new Newsfeed_ArgsFeed(genericTopics);
        }

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
