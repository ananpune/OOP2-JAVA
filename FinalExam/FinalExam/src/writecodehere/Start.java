package writecodehere;

import java.io.File;

public class Start {
    public static void main(String[] args)  {
         Car car = new Car("ABC123", "Blue");
         PersistanceManager pm = new PersistanceManager();
         System.out.println (pm.persistObjectToDisk(new File("CarFile.txt"), car));
        

         PlayList playlist = new PlayList("Rich's Playlist");
         playlist.addSong(new Song ("Aiko Aiko", 600));
         playlist.addSong(new Song ("Dazed and Confused",480));
         playlist.addSong(new Song ("Freebird",800));
         System.out.println(pm.persistObjectToDisk(new File("Playlist.txt"), playlist));   
    }
}
