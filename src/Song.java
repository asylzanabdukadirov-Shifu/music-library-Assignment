public class Song {
    private String title;
    private String artist;
    private String genre;
    private double duration; // minutes
    private int playCount = 0;

    public Song(String title, String artist, String genre, double duration) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.duration = duration;
    }

    public void play() {
        playCount++;
        System.out.println("Now playing: " + title + " by " + artist);
    }

    public String getInfo() {
        return title + " | Artist: " + artist + " | Genre: " + genre +
                " | Duration: " + duration + " min" +
                " | Played: " + playCount + " times";
    }

    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getGenre() { return genre; }
}
