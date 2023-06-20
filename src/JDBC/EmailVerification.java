package JDBC;
import EmailAdministrator.Email;
import com.codekul.Select;

import javax.print.DocFlavor;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmailVerification {
/* String sql = "SELECT * FROM table_name WHERE column_name = ?";
PreparedStatement statement = connection.prepareStatement(sql);*/

static ArrayList<String>A=new ArrayList<>();
     public static String checkUser(Connection con) throws Exception {
         Scanner s = new Scanner(System.in);
         System.out.println("ENTER YOUR NAME ");

         String userName = s.nextLine();
         A.add(userName);
         String Query= "Select UserName from Email where UserName=?";
         PreparedStatement a=con.prepareStatement(Query);
         a.setString(1,userName);
         ResultSet r=a.executeQuery();
         if(r.next()){
             System.out.println("User Already exists try again");
             checkUser(con);
         }

         return A.get(A.size()-1);

     }
    public static void establishConnection(Connection con) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER YOUR EMAIL ID");
        String email = s.nextLine();
        String query = "select * from Email where Email_ID=?";
        PreparedStatement q = con.prepareStatement(query);
        q.setString(1, email);
        ResultSet rs = q.executeQuery();
        if (rs.next()) {
            System.out.println("User Already Exists");
        }
        // AS EMAIL DOES NOT EXIST WE ADD THE NEW USER
        else {

            String userName = checkUser(con) ;

                System.out.println("HELLO " + userName);


                String update_STATEMENT = "insert into Email(UserName,Email_ID) values (?,?)";
                PreparedStatement p = con.prepareStatement(update_STATEMENT);

                p.setString(1, userName);
                p.setString(2, email);

                int m = p.executeUpdate();
                if (m == 1) {
                    System.out.println("EMAIL SENT");
                }



        }
    }


    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String uname = "root";
        String password = "qwerty123$";
        Connection con = DriverManager.getConnection(url, uname, password);
        establishConnection(con);

    }
}
