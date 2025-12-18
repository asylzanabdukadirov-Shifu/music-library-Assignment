import java.util.ArrayList;
import java.util.List;

public class Artist {
    private String name;
    private List<Song> songs = new ArrayList<>();

    public Artist(String name) {
        this.name = name;
    }

    public void addSong(Song s) {
        songs.add(s);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }
}
