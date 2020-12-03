package aircraft;
/**
 * The Aircraft class contains information on a single Aircraft.
 * @author Tadave Brown
 * @version 1.0
 * @since 2020-11-21
 */
public class Components{
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
public Component(String make, String model,String serial_no,String registration_no, String dop, String inspec_time, float tach, float hobbs, Operations operations){
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
 * @return String that represents the components's unique serial_no
 * Accessor method to return the serial#
 */
public String get_serialno(){
    return serial_no;
}

/** 
 * @return String that represents the components's name
 * Accessor method to return the name of component
 */
public String get_name(){
    return item_name;
}

/** 
 * @return String that represents the components's maintenance information
 * Accessor method to return the maintenance information of the component
 */
public String get_maint_info(){
    return maint_info;
}

/** 
 * @param ID represents the ID of the engineer that will be assigned to the component
 * Mutator method that sets the maintenance engineer of the component
     */
public void  append_engineer(String ID){
    this.maint_engineer=ID;
}

public void  update_date(String new_date){
    this.maint_date=new_date;
}
