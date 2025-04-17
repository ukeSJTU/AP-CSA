public class MadLibs {
    public static void main(String[] args) {
        /*
         * This program generates a mad libbed story.
         * Author: uke
         * Date: 4/9/2025
         */

        String name1 = "Peter";
        String adjective1 = "great";
        String adjective2 = "good";
        String adjective3 = "beautiful";
        String verb1 = "sing";
        String noun1 = "cow";
        String noun2 = "chicken";
        String noun3 = "egg";
        String noun4 = "milk";
        String noun5 = "grass";
        String noun6 = "flower";
        String name2 = "Alice";
        int number = 10;
        String place1 = "farm";

        // The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a "
                + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2
                + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the "
                + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1
                + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " + name1
                + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";

        System.out.println(story);
    }
}
