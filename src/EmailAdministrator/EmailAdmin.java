package EmailAdministrator;

import java.util.HashMap;


 //HashMap<String,String>Details=new HashMap<>();

public class EmailAdmin {
    static HashMap<String,String>Details=new HashMap<>();


    EmailAdmin(String email,String Pass){
        Details.put(email,Pass);
    }

    public static void main(String[] args) {

        System.out.println(Details);
    }

}
