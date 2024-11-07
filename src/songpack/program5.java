package songpack;

import java.io.IOException;
import java.util.ArrayList;

public class program5 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        BinarySearchTree songs = MyDataReader.readFileToBST(args[0], args[1]);
        long end = System.currentTimeMillis();

        System.out.println( (end-start) + " milliseconds to read the rock songs into a binary search tree");

        ArrayList<Song> sortedSongs = songs.toSortedArrayList();

        start = System.currentTimeMillis();
        ArrayList<Song> topSongs = songs.search(sortedSongs.get(sortedSongs.size()-11).getViews());
        end = System.currentTimeMillis();

        ArrayList<String> topSongNames = new ArrayList<>();
        for (Song song : topSongs) {
            topSongNames.addFirst(song.getTitle());
        }

        System.out.println("Top-10 Titles of Songs with the highest number of views: \n"+ topSongNames);
        System.out.println( (end-start) + " milliseconds to find the top-10 popular songs");

        start = System.currentTimeMillis();
        BinarySearchTree clone = songs.clone();
        end = System.currentTimeMillis();
        System.out.println( (end-start) + " milliseconds to clone the tree");

        start = System.currentTimeMillis();
        clone.filterByViews(1000, 10000);
        boolean cloneisBST = clone.isBST();
        end = System.currentTimeMillis();
        System.out.println("validation result of cloning and filtering: " + cloneisBST);
        System.out.println( (end-start) + " milliseconds to filter the tree and validate the binary search tree");

        System.out.println("The Artist(s) with the highest views in the given range: ");
        start = System.currentTimeMillis();
        ArrayList<String> popularArtists = clone.popularArtists();
        end = System.currentTimeMillis();

        System.out.println(popularArtists);

        System.out.println( (end-start) + " milliseconds to find the popular artists");




    }
}
