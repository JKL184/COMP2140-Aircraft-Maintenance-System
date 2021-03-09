package aircraft;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        System.out.println("Welcome to the Tester class, we will now test all the classes for functionality in the Data Processing Layer of this project");
        Aircraft aircraft = new Aircraft("Cessna","152","XYZ007","NZ005", "Jan 7. 2020", "Feb. 28. 2020", 91.70, 82.50);
        System.out.println("The last inspection date on this aircraft is " + aircraft.getInsp());
        Components co1 = new Components("AIRFRAME", "80762", 36500.00, 6501.4, "22/6/2021");
        Components co2 = new Components("PROPELLER", "R773858", 36500.00, 6501.4, "22/6/2023");
        Components co3 = new Components("ENGINE", "E854428", 36500.00, 6501.4, "22/6/2022");
        aircraft.addComponent(co1);
        aircraft.addComponent(co2);
        aircraft.addComponent(co3);
        System.out.println(aircraft.getPriorityList());
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a new date for the first component in the format dd/mm/yyyy");
        String nd = sc.nextLine();
        sc.close();
        aircraft.getComponents().remove(co1);
        co1.update_date(nd);
        aircraft.getComponents().add(co1);
        System.out.println("The new priority list is: \n" + aircraft.getPriorityList());
        Operations op1 = new Operations(1,12.00,650.00,"01/01/2020","Every 650 hours");
        System.out.println("The date of the last operation added is: " + op1.getDate());
    }
}
