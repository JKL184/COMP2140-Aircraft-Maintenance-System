import java.util.*;

public class Menu {
    Scanner ans = new Scanner(System.in);
    Scanner option = new Scanner(System.in);
    public Menu(){

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
               System.out.println("Would you like to do go back to the menu?");
               System.out.println("1 for yes, 0 to exit");
               int b = option.nextInt();
               switch (b){
                   case 1:
                       Displaymenu();
                   case 0:
                       System.exit(0);
               }
           case 2:
               Display_statreport();
               System.out.println("Would you like to do go back to the menu?");
               System.out.println("1 for yes, 0 to exit");
               int c = option.nextInt();
               switch (c){
                   case 1:
                       Displaymenu();
                   case 0:
                       System.exit(0);
               }
           case 3:
               DisplayExpense();
               System.out.println("Would you like to do go back to the menu?");
               System.out.println("1 for yes, 0 to exit");
               int d = option.nextInt();
               switch (d){
                   case 1:
                       Displaymenu();
                   case 0:
                       System.exit(0);
               }
           case 4:
               Upload_data();
               System.out.println("Would you like to do go back to the menu?");
               System.out.println("1 for yes, 0 to exit");
               int e = option.nextInt();
               switch (e){
                   case 1:
                       Displaymenu();
                   case 0:
                       System.exit(0);
               }
       }
    }

    private void Display_parts(){
        System.out.println("Display");
    }

   private void Display_statreport(){
       System.out.println("Report");
    }

    private void DisplayExpense(){
        System.out.println("Expense");
    }

    private void Upload_data(){
        System.out.println("upload");
    }

   private void Alert(){

    }

}
