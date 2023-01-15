package writecodehere;

import java.io.File;
import java.io.PrintWriter;

public class Car implements Persistable {

    private String licensePlate;
    private String colour;

    public Car(String licensePlate, String colour) {
        this.licensePlate = licensePlate;
        this.colour = colour;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String deflateObjectForSavingToDisk() {
        //save Car object to file with lisence plate and colour
        String returnString = "";
       
        returnString += this.licensePlate + "," + this.colour;
       
        return returnString;      
    }     
   
}

