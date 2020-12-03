package aircraft;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Login {

    private String Uname;
    private String Pswd;

    public Login(String name,String pss) {
        this.Uname = name;
        this.Pswd = pss;
        UserDatabase();
        auth(this.Uname,this.Pswd);

    }

   public Boolean auth(String ID,String password){
        ArrayList<String> temp = new ArrayList<>();
        temp = getUserinfo();
        String n = temp.get(0);
        String test =Arrays.toString(n.toString().split(","));
        int end = test.indexOf(",");
        if (test.substring(1, end).equals(ID)){
            if(test.substring(7,15).equals(password)){
                System.out.println("Access Granted");
                return true;
            }
            System.out.println("Access Denied- Password does not Match UserID");
            return false;
        }
       System.out.println("Access Denied- No such UserID found");
       return false;
    }

    ArrayList getUserinfo()  {
        //make hashmap of string string to store the id and password
        ArrayList<String> data = new ArrayList<>();
        try {
            File datatemp = new File("Database.txt");
            Scanner reader = new Scanner(datatemp);
            if (datatemp.exists()) {
                while (reader.hasNextLine()) {
                    data.add(reader.nextLine());
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }

    private void UserDatabase() {
        try {
            File Database = new File("Database.txt");
            if (Database.createNewFile()) {
                System.out.println("File created: " + Database.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter writer = new FileWriter("Database.txt");
            writer.write("0001,passwrd1");
            writer.close();
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}