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
    private float tach;
    private float hobbs; 
    private Operations operations;
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
         * @param operations represents the operations of the aircraft.
         */
public Aircraft(String make, String model,String serial_no,String registration_no, String dop, String inspec_time, float tach, float hobbs, Operations operations){
    this.make=make;
    this.model=model;
    this.serial_no=serial_no;
    this.registration_no=registration_no;
    this.dop=dop;
    this.inspec_time=inspec_time;
    this.tach=tach;
    this.hobbs=hobbs;
    this.operations=operations;
}

/** 
 * @return String that represents the Aircrafts's unique serial_no
 * Accessor method to return the serial#
 */
public HashMap get_Aircraft_info(){
    HashMap<String,String> map=new HashMap<String,String>();//Creating HashMap
    map.put("make",this.make);    
    map.put("model",this.model);    
    map.put("serial_no",this.serial_no);    
    map.put("registration_no",this.registration_no);    
    map.put("dop",this.dop);    
    return map;
}

public HashMap get_tach_hobbs(){
    HashMap<String,float> map=new HashMap<String,float>();//Creating HashMap
    map.put("tach",this.tach);    
    map.put("hobbs",this.hobbs);    
    return map;
}

public String getInsp(){
    return this.inspec_time;
}

public Operations getOperations(){
    return this.operations;
}
