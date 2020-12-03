package aircraft;
import java.util.*;  
/**
 * The Aircraft class contains information on a single Aircraft.
 * @author Tadave Brown
 * @version 1.0
 * @since 2020-11-21
 */
public class Aircraft{
    private String make;
    private String model;
    private String serial_no;
    private String registration_no; 
    private String dop;
    private String inspec_time; 
    private double tach;
    private double hobbs; 
    private ArrayList<Operations> operations = new ArrayList<Operations>();
    private ArrayList<Components> components = new ArrayList<Components>();
    /**
	 * Constructor that accepts and stores the aircraft makes, model, serial#, registration #, date of production, Time of operation, inspection time, tachometer, hobbs, operations, 
         * @param make represents the aircraft make
         * @param model represents the aircraft model
         * @param serial_no represents the serial_no of the aircraft.
         * @param registration_no represents the registration_no of the aircraft.
         * @param dop represents the date of production  of the aircraft.
         * @param inspec_time represents the serial_no of the aircraft.
         * @param tach represents the number on the tachometer of the aircraft.
         * @param hobbs represents the number on the hobbs meter of the aircraft.
         */
    
        public Aircraft(String make, String model,String serial_no,String registration_no, String dop, String inspec_time, double tach, double hobbs){
        this.make=make;
        this.model=model;
        this.serial_no=serial_no;
        this.registration_no=registration_no;
        this.dop=dop;
        this.inspec_time=inspec_time;
        this.tach=tach;
        this.hobbs=hobbs;
    }

    /** 
     * @return HashMap that represents the Aircrafts's information
     */
    public HashMap<String,String> get_Aircraft_info(){
        HashMap<String,String> map=new HashMap<String,String>();//Creating HashMap
        map.put("Aircraft Make",this.make);    
        map.put("Model",this.model);    
        map.put("Serial #",this.serial_no);    
        map.put("Registration #",this.registration_no);    
        map.put("Date Made",this.dop);    
        return map;
    }

    /** 
     * @return HashMap that represents the Aircrafts's tachometer value and hobbs meter value
     */
    public HashMap<String,Double> get_tach_hobbs(){
        HashMap<String,Double> map=new HashMap<String,Double>();//Creating HashMap
        map.put("Tach",this.tach);    
        map.put("Hobbs",this.hobbs);    
        return map;
    }

    /** 
     * @return String that represents the Aircrafts's inspection time
     */
    public String getInsp(){
        return this.inspec_time;
    }

    /** 
     * @return Operations ArrayList holds all the operations that the aircraft has had
     */
    public ArrayList<Operations> getOperations(){
        return this.operations;
    }

    public void addOperation(Operations op){
        this.operations.add(op);
    }

    public void addComponent(Components co){
        this.components.add(co);
    }

    public String getPriorityList(){
        Collections.sort(components);
        String finalString = "";
        for(Components component: components){
            finalString += component.toString() + "\n";
        }
        return finalString;
    }
}
