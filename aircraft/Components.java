package aircraft;
import java.text.SimpleDateFormat;  
import java.util.Date;
/**
 * The Component class contains information on a single Aircraft component.
 * @author Jordan Lewis
 * @version 1.0
 * @since 2020-11-21
 */
public class Components implements Comparable<Components>{
    private String item_name;
    private String serial_no;
    private String remarks;
    private double maint_cost;
    private String maint_engineer;
    private double maint_interval;
    private Date maint_date;

    /**
	 * Constructor that accepts and stores the component name, serial#, information about component's maintenance, and cost of maintenance on the component.
         * @param item_name represents the component name
         * @param serial_no represents the serial_no of the component.
         * @param maint_cost represents the cost of maintenance
         */
    public Components(String item_name,String serial_no, double maint_cost,double maint_interval,String maint_date){
        this.item_name=item_name;
        this.serial_no=serial_no;
        this.maint_cost=maint_cost;
        this.maint_interval=maint_interval;
        try{
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(maint_date);
            this.maint_date = date1;
        }
        catch (Exception e){
            System.out.println("Invalid date format");
        }
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
    public void addRemark(String remark){
        this.remarks = remark;
    }

    public String getRemark(){
        return remarks;
    }

    public Date getMaintDate(){
        return maint_date;
    }

    /** 
     * @param ID represents the ID of the engineer that will be assigned to the component
     * Mutator method that sets the maintenance engineer of the component
         */
    public void append_engineer(String ID){
        this.maint_engineer=ID;
    }



    public void update_date(String new_date){
        try{
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(new_date);
            this.maint_date = date1;
        }
        catch (Exception e){
            System.out.println("Invalid date format");
        }
    }

    

    @Override
    public int compareTo(Components o) {
        return getMaintDate().compareTo(o.getMaintDate());
    }

    public String toString(){
        return get_name() + " " + get_serialno() + " " + getMaintDate();
    }
}