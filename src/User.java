import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Playlist> playlists = new ArrayList<>();

    public User(String username) {
        this.username = username;
    }

    public Playlist createPlaylist(String name) {
        Playlist p = new Playlist(name);
        playlists.add(p);
        System.out.println("Playlist created: " + name);
        return p;
    }

    public void addSongToPlaylist(Playlist p, Song s) {
        p.addSong(s);
    }

    public void playSong(Song s) {
        s.play();
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public String getUsername() {
        return username;
    }
}
