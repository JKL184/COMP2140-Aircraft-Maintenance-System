package aircraft;

public class Engineer {
    private String id;
    private String password;

    public Engineer(String id, String password){
        this.id = id;
        this.password = password;
    }

    public String getID(){
        return id;
    }

    public String getPassword(){
        return password;
    }

    public void update_info(String  id, String password){
        this.id = id;
        this.password = password;
    }
}
