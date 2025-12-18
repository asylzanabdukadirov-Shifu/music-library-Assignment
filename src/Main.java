public class Main {
    public static void main(String[] args) {

        MusicLibrary library = new MusicLibrary();

        // Adding sample songs
        Song s1 = new Song("Shape of You", "Ed Sheeran", "Pop", 4.0);
        Song s2 = new Song("Believer", "Imagine Dragons", "Rock", 3.5);
        Song s3 = new Song("Natural", "Imagine Dragons", "Rock", 3.2);

        library.addSong(s1);
        library.addSong(s2);
        library.addSong(s3);

        User user = new User("Asylzhan");

        Playlist myPlaylist = user.createPlaylist("My Favorites");

        user.addSongToPlaylist(myPlaylist, s1);
        user.addSongToPlaylist(myPlaylist, s2);

        // Play a single song
        System.out.println("\nPlaying single song:");
        user.playSong(s1);

        // Play playlist
        System.out.println("\nPlaying playlist:");
        myPlaylist.playAll();

        // Library search example
        System.out.println("\nSearch results for genre 'Rock':");
        for (Song s : library.searchByGenre("Rock")) {
            System.out.println("-" + s.getInfo());
        }
    }
}
