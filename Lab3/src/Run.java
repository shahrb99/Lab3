import MusicCollection.Music;
import MusicCollection.MusicCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {

    static Scanner input = new Scanner(System.in);

    static MusicCollection musics = new MusicCollection();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("________________________________________________________________");
            System.out.println("1. Add music\n2. Remove a music\n3. Add a music to the favorite list\n4. Remove a music from the favorite list\n5. Search a music in the list\n6. List of the musics\n7. List of the favorite musics\nWhat do you want to do :");
            int select = input.nextInt();
            input.nextLine();
            System.out.println("________________________________________________________________");

            switch (select) {
                case 1:
                    addMusic();
                    break;
                case 2:
                    removeMusic();
                    break;
                case 3:
                    addToFav();
                    break;
                case 4:
                    removeFromFav();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    musics.listAllMusics();
                    break;
                case 7:
                    musics.favMusics();
                    break;
                default:
                    System.out.println("Invalid!");
                    break;
            }
        }
    }

    public static void addMusic() {

        System.out.println("________________________________________________________________");

        System.out.println("How many musics do you want to add ?!");
        int num = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= num ; i++) {
            System.out.println("Track " + i);

            System.out.println("Name :");
            String name = input.nextLine();

            System.out.println("Singer :");
            String singer = input.nextLine();

            System.out.println("Address :");
            String address = input.nextLine();

            System.out.println("Year of publication :");
            int pubYear = input.nextInt();
            input.nextLine();

            Music music = new Music(address);
            music.setName(name);
            music.setSinger(singer);
            music.setPublicationYear(pubYear);

            musics.addMusic(music);
            System.out.println("Track added");

            System.out.println("________________________________________________________________");
        }
    }

    public static void removeMusic() {

        System.out.println("________________________________________________________________");

        System.out.println("Please enter the address of the music :");
        String address = input.nextLine();

        for (Music music : musics.getMusics()) {
            if (music.getAddress().equals(address)) {
                musics.removeMusic(musics.getMusics().indexOf(music));
                System.out.println("Music deleted successfully");
                System.out.println("________________________________________________________________");
                return;
            }
        }
        System.out.println("The music doesn't exist");
        System.out.println("________________________________________________________________");
    }

    public static void addToFav() {
        System.out.println("________________________________________________________________");
        int i = 1;
        musics.listAllMusics();

        System.out.println("Witch music do you want to add to the favorite list :");
        int select = input.nextInt();
        input.nextLine();

        if (select > 0 && select <= musics.getNumberOfMusics()) {
            musics.addFav(musics.getMusics().get(select-1));
            System.out.println("Music added successfully");
        } else {
            System.out.println("Invalid!");
        }
        System.out.println("________________________________________________________________");
    }

    public static void removeFromFav() {
        System.out.println("________________________________________________________________");
        int i = 1;
        musics.favMusics();

        System.out.println("Witch music do you want to remove from the favorite list :");
        int select = input.nextInt();
        input.nextLine();

        if (select > 0 && select <= musics.getNumberOfMusics()) {
            musics.removeFav(musics.getMusics().get(select-1));
            System.out.println("Music removed successfully");
        } else {
            System.out.println("Invalid!");
        }
        System.out.println("________________________________________________________________");
    }

    public static void search() {
        System.out.println("________________________________________________________________");
        System.out.println("Enter the name of singer or address to search :");
        String search = input.nextLine();

        System.out.println("Searching...");
        musics.search(search);
        System.out.println("________________________________________________________________");
    }
}
