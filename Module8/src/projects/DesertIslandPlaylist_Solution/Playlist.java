package projects.DesertIslandPlaylist_Solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Playlist {
    public static void main(String[] args) {
        String[] favoriteSongs = {
                "The Beatles - Hey Jude",
                "Queen - Bohemian Rhapsody",
                "Led Zeppelin - Stairway to Heaven",
                "Pink Floyd - Comfortably Numb",
                "Michael Jackson - Billie Jean",
                "Nirvana - Smells Like Teen Spirit",
                "Bob Dylan - Like a Rolling Stone",
                "Radiohead - Paranoid Android",
                "David Bowie - Space Oddity",
                "Fleetwood Mac - Dreams"
        };

        // Print first three songs from favoriteSongs
        System.out.println(favoriteSongs[0]);
        System.out.println(favoriteSongs[1]);
        System.out.println(favoriteSongs[2]);

        ArrayList<String> desertIslandPlaylist = new ArrayList<>();
        desertIslandPlaylist.add("Daft Punk - Get Lucky");
        desertIslandPlaylist.add("The Weeknd - Blinding Lights");
        desertIslandPlaylist.add("Tame Impala - The Less I Know The Better");
        desertIslandPlaylist.add("Arctic Monkeys - Do I Wanna Know?");
        desertIslandPlaylist.add("Kendrick Lamar - HUMBLE.");

        // Print desertIslandPlaylist
        System.out.println(desertIslandPlaylist);

        // Add all songs from favoriteSongs to desertIslandPlaylist
        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));

        // Print the size of desertIslandPlaylist
        System.out.println(desertIslandPlaylist.size());

        // Remove songs from desertIslandPlaylist until only 5 songs remain
        desertIslandPlaylist.remove("Kendrick Lamar - HUMBLE.");
        desertIslandPlaylist.remove("Arctic Monkeys - Do I Wanna Know?");
        desertIslandPlaylist.remove("Tame Impala - The Less I Know The Better");
        desertIslandPlaylist.remove("The Weeknd - Blinding Lights");
        desertIslandPlaylist.remove("Fleetwood Mac - Dreams");
        desertIslandPlaylist.remove("David Bowie - Space Oddity");
        desertIslandPlaylist.remove("Radiohead - Paranoid Android");
        desertIslandPlaylist.remove("Bob Dylan - Like a Rolling Stone");
        desertIslandPlaylist.remove("Nirvana - Smells Like Teen Spirit");
        desertIslandPlaylist.remove("Michael Jackson - Billie Jean");

        // Print the updated desertIslandPlaylist
        System.out.println(desertIslandPlaylist);

        // Select two songs to swap, get their indices
        int indexA = desertIslandPlaylist.indexOf("Daft Punk - Get Lucky");
        int indexB = desertIslandPlaylist.indexOf("Pink Floyd - Comfortably Numb");

        // Store the first song to swap in a temporary variable
        String tempA = "Daft Punk - Get Lucky";

        // Replace the first song with the second song
        desertIslandPlaylist.set(indexA, "Pink Floyd - Comfortably Numb");

        // Print desertIslandPlaylist to see the second song appearing twice
        System.out.println(desertIslandPlaylist);

        // Use set() again to place the temporary song in the second song's original
        // position
        desertIslandPlaylist.set(indexB, tempA);

        // Print the final playlist after the swap
        System.out.println(desertIslandPlaylist);
    }
}
