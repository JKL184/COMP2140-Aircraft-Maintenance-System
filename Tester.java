public class Tester {
        public static void main(String args[]){
            Menu men = new Menu();
            Login nm;
            nm = new Login("0001","passwrd1");
            if (nm.auth("0001","passwrd1").equals(true)){
                men.Displaymenu();
            }

        }
}
