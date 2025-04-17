# Desert Island Playlist Project - Starter

## Objective

Study for the AP Computer Science A Exam by building a playlist of your favorite music using Java `Arrays` and `ArrayList`.

## Project Brief

Suppose you're heading to a desert island, cut off from the world, for the next few days. Luckily, you can bring a playlist of your favorite music. This project is a chance to apply your Java skills to build `Playlist.java`, a program to store and customize the best possible music playlist using `Arrays` and `ArrayList`. You'll add your favorite songs and use various functions to manipulate the playlist.

## Tasks

### Create Your Playlist

1. **Add a `main()` Method and Import Libraries**

    - Add a `main()` method to the `Playlist` class.
    - Import `Arrays` and `ArrayList` from `java.util`.

2. **Create an Array of Favorite Songs**

    - Inside `main()`, create an array `favoriteSongs` with 10 favorite songs in "Artist - Song Title" format.

3. **Print the First Three Songs**

    - Print the first three songs in your `favoriteSongs` array.

4. **Create an ArrayList for Desert Island Playlist**

    - Add an `ArrayList` called `desertIslandPlaylist` to store `String` values.

5. **Add Songs to Desert Island Playlist**

    - Use `add()` to add 5 unique favorite songs to `desertIslandPlaylist`.

6. **Print the Desert Island Playlist**
    - Print `desertIslandPlaylist` to see the playlist content.

### Add and Remove Songs

7. **Add All Favorite Songs to Desert Island Playlist**

    - Add all songs from `favoriteSongs` to `desertIslandPlaylist` using `Arrays.asList()` and `addAll()`.

8. **Check the Number of Songs in the Playlist**

    - Use `size()` to print the number of songs in `desertIslandPlaylist`.

9. **Remove Songs to Keep Top 5**
    - Remove songs from `desertIslandPlaylist` using `remove()` until only 5 songs remain.

### Swap Songs

10. **Review the Current Playlist**

    -   Print `desertIslandPlaylist` with your top 5 songs.

11. **Get Indices of Songs to Swap**

    -   Select two songs and get their indices using `indexOf()`, storing them in variables.

12. **Store Song A Temporarily**

    -   Create a `String` variable to temporarily store one of the songs to swap.

13. **Replace Song A with Song B**

    -   Use `set()` to replace the first song with the second song, printing to see the second song appear twice.

14. **Complete the Swap**
    -   Use `set()` again to place the temporary song in the second song's original position, printing the final swapped playlist.

### Remix!

15. **Explore Further**
    -   Consider additional ideas like building playlists for other items, shuffling song order, or reversing the order.

## Getting Started

Open `Playlist.java` and complete the TODO tasks to build your desert island playlist. Run the code to see your playlist evolve as you complete each step.
