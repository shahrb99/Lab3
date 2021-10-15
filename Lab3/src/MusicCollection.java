package MusicCollection;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the musics.
    private ArrayList<Music> musics;

    // A player for the music files.
    private MusicPlayer player;

    // an arraylist for storing the favorite musics
    private ArrayList<Music> favMusics;

    /**
     * Create a MusicCollection
     */
    public MusicCollection() {
        musics = new ArrayList<>();
        player = new MusicPlayer();
        favMusics = new ArrayList<>();
    }

    /**
     * Add a music to the collection.
     * @param music The music to be added.
     */
    public void addMusic(Music music) {
        musics.add(music);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfMusics() {
        return musics.size();
    }

    /**
     * List a music from the collection.
     * @param index The index of the music to be listed.
     */
    public void listMusic(int index) {
        if (validIndex(index)) {
            System.out.println(musics.get(index).print());
        }
    }

    /**
     * Show a list of all the musics in the collection.
     */
    public void listAllMusics() {
        System.out.println("All musics in the list :");
        int i = 1;
        for (Music music : musics) {
            System.out.println(i + ". " + music.print());
            i++;
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeMusic(int index) {
        if (validIndex(index)) {
            musics.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
        if (validIndex(index)) {
            player.startPlaying(musics.get(index).getAddress());
        }
    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        player.stop();
    }

    /**
     * add a music to favorite musics list
     * @param music a music track
     */
    public void addFav(Music music) {
        favMusics.add(music);
    }

    /**
     * remove a music from favorite musics list
     * @param music a music track
     */
    public void removeFav(Music music) {
        if (favMusics.contains(music)) {
            favMusics.remove(music);
        }
    }

    /**
     * show a list of all the favorite musics in the collection
     */
    public void favMusics() {
        System.out.println("Favorite musics :");
        int i = 1;
        for (Music music : favMusics) {
            System.out.println(i + ". " + music.print());
            i++;
        }
    }

    /**
     * search a string in the list of musics
     * @param str a string that might be the singer nam or the address of music file
     */
    public void search(String str) {
        for (Music music : musics) {
            if (music.getAddress().equals(str) || music.getSinger().equals(str)) {
                System.out.println(music.print());
            }
        }
    }

    /**
     * get the list of musics
     * @return musics field
     */
    public ArrayList<Music> getMusics() {
        return musics;
    }

    /**
     * get the list of favorite musics
     * @return favMusics field
     */
    public ArrayList<Music> getFavMusics() {
        return favMusics;
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        // The return value.
        // Set according to whether the index is valid or not.
        return index < musics.size() && index >= 0;
    }
}