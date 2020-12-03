import java.lang.reflect.Array;

public class Login {

    private String Uname;
    private String Pswd;

    public Login(String name,String pss){
        this.Uname = name;
        this.Pswd = pss;
    }

   public Boolean auth(String ID){
        Array real = getUserinfo();
        for(int i =0;i<real.getLength(); i++ )
            if (real[i] == ID) {
                return true;
            }
        return false;

    }

    Array getUserinfo(){

    }
}