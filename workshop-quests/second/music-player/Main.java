import java.util.ArrayList;

class Song {
    private String title;
    private String artist;
    private int duration;
    private int playCount;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        setDuration(duration);
        this.playCount = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration <= 0) {
            this.duration = 1;
        } else {
            this.duration = duration;
        }
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public void play() {
        playCount++;
        Playlist.totalSongsPlayed++;
        System.out.println("Playing: " + title);
    }

    public String getInfo() {
        return "Title: " + title +
        ", Artist: " + artist +
        ", Duration: " + duration +
        ", PlayCount: " + playCount;
    }
}

class Playlist {
    private ArrayList<Song> songs;
    public static int totalSongsPlayed = 0;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void playAll() {
        for (Song s : songs) {
            s.play();
        }
    }
}