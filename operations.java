package aircraft;
import java.util.*;  
/**
 * The Operations class contains information on all operations on a single aircraft.
 * @author Khalid Williams
 * @version 1.0
 * @since 2020-11-21
 */

public class Operations {
    private int id;
    private String description;
    private int interval;
    private int dueDate;
    private float timeRemaining;
    private float dateCW;
    private String note;

    public Operations(int id, String description, int interval, int dueDate, float timeRemaining, float dateCW, String note){
        this.id = id;
        this.description = description;
        this.interval = interval;
        this.dueDate = dueDate;
        this.timeRemaining = timeRemaining;
        this.dateCW = dateCW;
        this.note = note;
    }

    public int getID(){
        return this.id;
    }

    public String getDescription(){
        return this.description;
    }

    public float getDateCW(){
        return this.dateCW;
    }

    public float getRemainingTime(){
        return this.timeRemaining;
    }

    public String getNote(){
        return this.note;
    }

    public String updateNote(String note){
        this.note = note;
    }

    public String updateDescription(String description){
        this.description = description;
    }
}
