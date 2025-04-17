package exercises.solution;

public class Newsfeed_FavoriteArticles {
    String[] topics = { "Opinion", "Tech", "Science", "Health" };
    int[] views = { 0, 0, 0, 0 };
    String[] favoriteArticles;

    public Newsfeed_FavoriteArticles() {
        favoriteArticles = new String[10];
    }

    public void setFavoriteArticle(int favoriteIndex, String newArticle) {
        favoriteArticles[favoriteIndex] = newArticle;
    }
}
