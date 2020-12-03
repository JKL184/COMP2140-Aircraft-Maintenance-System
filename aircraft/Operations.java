package aircraft;

public class Operations {
    // Inspect/ operation number
    private float id;
    // Frequency broken up into hours and date
    private float frequencyH;
    private float frequencyD;
    // Hours already logged
    private float hours;
    // The due date for the component
    private String date;
    // Value of the tachometer
    private float tachometer;
    // Any note left by the engineer
    private String note;

    // Constructor method for the case where both frequencies are specified
    public Operations(int id, float frequencyH, float frequencyD, float hours, String date, String note){
        this.id = id;
        this.frequencyH = frequencyH;
        this.frequencyD = frequencyD;
        this.hours = hours;
        this.date = date;
        this.note = note;
    }

    // Constructor method for the case where only one type of frequency is specified
    public Operations(int id, float frequency, float hours, String date, String note){
        this.id = id;
        if (frequency < 50) {
            this.frequencyD = frequency;
        }
        else{
            this.frequencyH = frequency;
        }
        this.hours = hours;
        this.date = date;
        this.note = note;
    }

    // GETTER METHODS FOR ALL VARIABLES

    // Method to get the ID
    public float getID(){
        return this.id;
    }

    // Method to get the frequency for the days
    public float getFrequencyD(){
        return this.frequencyD;
    }

    // Method to get the frequency for the hours
    public float getFrequencyH(){
        return this.frequencyH;
    }

    // Method to get hours
    public float getHours(){
        return this.hours;
    }

    // Method to get date
    public String getDate(){
        return this.date;
    }

    // Method to get tachometer value
    public float getTachometer(){
        return this.tachometer;
    }

    // Method to get note
    public String getNote(){
        return this.note;
    }

    // Method to update any note left by engineer
    public void updateNote(String note){
        this.note = note;
    }

    // Method to update frequency
    public void updateFrequency(float frequencyH, float frequencyD){
        this.frequencyH = frequencyH;
        this.frequencyD = frequencyD;
    }

    // Method to calculate the hours remaining before a part needs to change
    public float hoursRemaining(float tachometer){
        float tachDifference = tachometer - this.tachometer;
        float hoursRemaining = this.hours - tachDifference;
        /* If tachDifference is greater than hours then print statement needs to be made to notify the user that the part urgently needs
        to be changed */
        return hoursRemaining;
    }
}
