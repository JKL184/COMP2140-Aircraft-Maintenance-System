package aircraft;

public class Operations {
    // Inspect/ operation number
    private double id;
    // Frequency broken up into hours and date
    private double frequencyH;
    private double frequencyD;
    // Hours already logged
    private double hours;
    // The due date for the component
    private String date;
    // Value of the tachometer
    private double tachometer;
    // Any note left by the engineer
    private String note;

    // Constructor method for the case where both frequencies are specified
    public Operations(int id, double frequencyH, double frequencyD, double hours, String date, String note){
        this.id = id;
        this.frequencyH = frequencyH;
        this.frequencyD = frequencyD;
        this.hours = hours;
        this.date = date;
        this.note = note;
    }

    // Constructor method for the case where only one type of frequency is specified
    public Operations(int id, double frequency, double hours, String date, String note){
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
    public double getID(){
        return this.id;
    }

    // Method to get the frequency for the days
    public double getFrequencyD(){
        return this.frequencyD;
    }

    // Method to get the frequency for the hours
    public double getFrequencyH(){
        return this.frequencyH;
    }

    // Method to get hours
    public double getHours(){
        return this.hours;
    }

    // Method to get date
    public String getDate(){
        return this.date;
    }

    // Method to get tachometer value
    public double getTachometer(){
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
    public void updateFrequency(double frequencyH, double frequencyD){
        this.frequencyH = frequencyH;
        this.frequencyD = frequencyD;
    }

    // Method to calculate the hours remaining before a part needs to change
    public double hoursRemaining(double tachometer){
        double tachDifference = tachometer - this.tachometer;
        double hoursRemaining = this.hours - tachDifference;
        /* If tachDifference is greater than hours then print statement needs to be made to notify the user that the part urgently needs
        to be changed */
        return hoursRemaining;
    }
}
