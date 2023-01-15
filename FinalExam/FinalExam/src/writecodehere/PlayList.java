package writecodehere;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PlayList implements Persistable  {

    private ArrayList<Song> songs;
    private String name;

    public PlayList(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public void addSong(Song song) {
        this.songs.add(song);
    }
    public int getTotalLength(){
        int totalLength = 0;
        for(Song song : this.songs){
            totalLength += song.getSongLength();
        }
        return totalLength;
    }

    @Override
    public String deflateObjectForSavingToDisk() {
        String returnString = "";
        for (Song song : songs){
            returnString += song.getName() + ", " + song.getSongLength() + ", ";
        }
        return this.name + "#" + getTotalLength()+ "# "+ returnString;
    }
    
    
}
