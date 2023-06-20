package JDBC;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDate;

public class CheckValid {
    public static boolean checkString1(String String1){
        for(int i=0;i<String1.length();i++){
            if(String1.charAt(i)>=33&&String1.charAt(i)<=64){
                return false;
            }
        }
        return true;
    }

    public static boolean checkInteger(int N){
        String ans=Integer.toString(N);
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)<=47&&ans.charAt(i)<=58){
                return false;
            }
        }
        return true;
    }

    public static String Date(String date){
        String ans="";
        for(int i=0;i<date.length();i++){
            ans=date.charAt(i)+ans;
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        boolean String1=checkString1("qwertyuio");
        boolean String2=checkString1("qwertyuio");
        boolean String3=checkString1("hjhzhdlJ");
        boolean String4=checkString1("qwertyuio");
        boolean String5=checkString1("qwertyuio");

        boolean no1=checkInteger(9887788);
        boolean no2=checkInteger(5654758);
        //LocalDate obj= LocalDate.now();

       // String date= Date("17-05-2023");
        System.out.println(String1+" "+String2+" "+String3+" "+String4+" "+String5+" "+no1+" "+no2+" ");



        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/jdbc";
        String uname="root";
        String password="qwerty123$";

        Connection con= DriverManager.getConnection(url,uname,password);
        Statement st=con.createStatement();
        String query=" ";
        if(String1&&String2&&String3&String4&String5&&no1&&no2){

            st.executeUpdate(query);
        }





    }


}
