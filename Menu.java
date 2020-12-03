import java.util.*;

public class Menu {
    Scanner ans = new Scanner(System.in);

    public Menu(){
        Displaymenu();
    }
   public void Displaymenu(){
        System.out.println("~~~~Welcome to the Aircraft Maintenace System~~~~");
        System.out.println("PLease choose what you would like to do");
        System.out.println("(1) Display parts");
        System.out.println("(2) Display status report");
        System.out.println("(3) Display Expense");
        System.out.println("(4) Upload data");
        int a = ans.nextInt();

       switch(a){
           case 1:
               Display_parts();
           case 2:
               Display_statreport();
           case 3:
               DisplayExpense();
           case 4:
               Upload_data();
       }
    }

    private void Display_parts(){

    }

   private void Display_statreport(){

    }

    private void DisplayExpense(){

    }

    private void Upload_data(){

    }

   private void Alert(){

    }

}
