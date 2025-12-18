import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {
    private List<Song> songs = new ArrayList<>();
    private List<Artist> artists = new ArrayList<>();

    public void addSong(Song s) {
        songs.add(s);

        Artist existing = findArtist(s.getArtist());
        if (existing == null) {
            Artist newArtist = new Artist(s.getArtist());
            newArtist.addSong(s);
            artists.add(newArtist);
        } else {
            existing.addSong(s);
        }
    }
    // I dont get what can i change its already written beyond my possibilities
    private Artist findArtist(String name) {
        for (Artist a : artists) {
            if (a.getName().equalsIgnoreCase(name))
                return a;
        }
        return null;
    }

    public List<Song> searchByTitle(String title) {
        List<Song> result = new ArrayList<>();
        for (Song s : songs) {
            if (s.getTitle().equalsIgnoreCase(title)) {
                result.add(s);
            }
        }
        return result;
    }

    public List<Song> searchByArtist(String artistName) {
        List<Song> result = new ArrayList<>();
        for (Song s : songs) {
            if (s.getArtist().equalsIgnoreCase(artistName)) {
                result.add(s);
            }
        }
        return result;
    }

    public List<Song> searchByGenre(String genre) {
        List<Song> result = new ArrayList<>();
        for (Song s : songs) {
            if (s.getGenre().equalsIgnoreCase(genre)) {
                result.add(s);
            }
        }
        return result;
    }
}
