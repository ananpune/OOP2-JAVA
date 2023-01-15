package writecodehere;

public class Song {
    private String name;
    private int songLength;

    public Song(String name, int songLength) {
        this.name = name;
        this.songLength = songLength;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSongLength() {
        return songLength;
    }
    public void setSongLength(int songLength) {
        this.songLength = songLength;
    }
}
