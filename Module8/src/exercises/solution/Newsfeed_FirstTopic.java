package exercises.solution;

public class Newsfeed_FirstTopic {
    String[] topics = { "Opinion", "Tech", "Science", "Health" };
    public int[] views = { 0, 0, 0, 0 };

    public Newsfeed_FirstTopic() {
    }

    public String[] getTopics() {
        return topics;
    }

    public String getFirstTopic() {
        return topics[0];
    }

    public void viewTopic(int topicIndex) {
        views[topicIndex] += 1;
    }
}
