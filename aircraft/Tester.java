package aircraft;

public class Tester {
    public static void main(String[] args){
        System.out.println("Welcome to the Tester class, we will now test all the classes for functionality in the Data Processing Layer of this project");
        Aircraft aircraft = new Aircraft("Cessna","152","XYZ007","NZ005", "Jan 7. 2020", "Feb. 28. 2020", 91.70, 82.50);
        System.out.println("The last inspection date on this aircraft is " + aircraft.getInsp());
        Components co1 = new Components("AIRFRAME", "80762", 36500.00, 6501.4, "22/6/2021");
        Components co2 = new Components("PROPELLER", "R773858", 36500.00, 6501.4, "22/6/2023");
        aircraft.addComponent(co1);
        aircraft.addComponent(co2);
        System.out.println(aircraft.getPriorityList());
    }
}
