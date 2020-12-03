public class operations {
    private int id;
    private String description;
    // private float interval;
    // private int dueDate;
    private float timeRemaining;
    private float dateCW;
    private String note;

    public operations(int id, String description, float interval, int dueDate, float timeRemaining, float dateCW, String note){
        this.id = id;
        this.description = description;
        this.interval = interval;
        this.dueDate = dueDate;
        this.timeRemaining = timeRemaining;
        this.dateCW = dateCW;
        this.note = note;
    }

    public getID(){
        return this.id;
    }

    public getDescription(){
        return this.description;
    }

    public getDateCW(){
        return this.dateCW;
    }

    public getRemainingTime(){
        return this.timeRemaining;
    }

    public getNote(){
        return this.note;
    }

    public updateNote(String note){
        this.note = note;
    }

    public updateDescription(String description){
        this.description = description;
    }
}
