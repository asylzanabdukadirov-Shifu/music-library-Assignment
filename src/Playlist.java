import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String playlistName;
    private List<Song> songs = new ArrayList<>();

    public Playlist(String name) {
        this.playlistName = name;
    }

    public void addSong(Song s) {
        songs.add(s);
        System.out.println(s.getTitle() + "added to playlist:" + playlistName);
    }

    public void removeSong(String title) {
        songs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
    }

    public void playAll() {
        System.out.println("Playing playlist: " + playlistName);
        for (Song s : songs) {
            s.play();
        }
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return playlistName;
    }
}
