package writecodehere;

import java.io.File;
import java.io.PrintWriter;

public class PersistanceManager {

    public boolean persistObjectToDisk(File file, Persistable objectToPersist) {
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.println(objectToPersist.deflateObjectForSavingToDisk());
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
