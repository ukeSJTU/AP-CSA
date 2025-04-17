package exercises.solution;

public class Newsfeed_NumTopics {
    String[] topics = { "Opinion", "Tech", "Science", "Health" };
    int[] views = { 0, 0, 0, 0 };

    public Newsfeed_NumTopics() {
    }

    public String[] getTopics() {
        return topics;
    }

    public int getNumTopics() {
        return topics.length;
    }
}
