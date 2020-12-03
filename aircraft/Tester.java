package aircraft;

public class Tester {
    public static void main(String[] args){
        System.out.println("Welcome to the Tester class, we will now test all the classes for functionality in the Data Processing Layer of this project");
        Aircraft aircraft = new Aircraft("Cessna","152","XYZ007","NZ005", "Jan 7. 2020", "Feb. 28. 2020", 91.70, 82.50);
        System.out.println("The last inspection date on this aircraft is " + aircraft.getInsp());
    }
}
