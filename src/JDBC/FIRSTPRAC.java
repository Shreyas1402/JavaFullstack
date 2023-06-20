package JDBC;
import java.sql.*;
import java.util.HashMap;


public class FIRSTPRAC {
    public static void Update() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");

        //to create the connection obj
        String url="jdbc:mysql://localhost:3306/jdbc";
        String username="root";
        String password="qwerty123$";
        Connection con =DriverManager.getConnection(url,username,password);

        // to create a statement
        String Query="Select * from info where id=2"; // write your query here
        // Execute the Query
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(Query);

    }
    public static void main(String[] args) throws Exception {
        HashMap<Integer,String>Info=new HashMap<>();
      Class.forName("com.mysql.jdbc.Driver");

      //to create the connection obj
       String url="jdbc:mysql://localhost:3306/jdbc";
       String username="root";
        String password="qwerty123$";
        Connection con =DriverManager.getConnection(url,username,password);

        // to create a statement
        String Query="Select * from info where id=2"; // write your query here
        // Execute the Query
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(Query);


              while(rs.next()){
                  System.out.println(rs.getString(2));
              }
               //System.out.println(Info);
              st.close();
              con.close();
        }

    }

