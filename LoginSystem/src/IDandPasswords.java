import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords(){

        logininfo.put("Michal","Rama21");
        logininfo.put("Czarodziej12","PASSWORD02");
        logininfo.put("Wartownik","Test01");

    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}