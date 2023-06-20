package EmailAdministrator;

import java.util.HashMap;
import java.util.Scanner;

public  class Email {

   static private String FirstName;
    static private String LastName;
    static private String Department;
    static private String Password;
    static final private  int PasswordCapacity=8;
    static private String Company="Explarity.com";
    static private String email;


    public static void Email() {
        Scanner s=new Scanner(System.in);

        System.out.println("Welcome to Explarity Solutions");
        System.out.println("Please enter your FirstName: ");
        FirstName =s.nextLine();
        System.out.println("Please enter your LastName");
        LastName = s.nextLine();
        System.out.println("Welcome to Explarity Solutions"+FirstName+" "+LastName +"\n ");
        System.out.println("Please Enter\n 1 for New Eamil\n 2 for Password change\n 3 to Know your Password");
        int i=s.nextInt();

             if(i==1){

                Department=getDept();
                Password=getPassword(PasswordCapacity);

                email=FirstName+"."+LastName+"@"+Department+"."+Company;
             //   checkPassword(email,Password);
                print();
            }
            if(i==2){
                System.out.println("PLease enter your email");
               String em= s.nextLine();
             //   changePassword(em);
            }
            if(i==3){
                System.out.println("PLease enter your email");
                String em=s.nextLine();
             //   System.out.println(getpass(em));

            }


        }



   /* public static String checkPassword(String eamil,String password) {
        if (Details.containsValue(password)) {
            Password = getPassword(PasswordCapacity);
        }
        return Password;
    }*/
         public static EmailAdmin print(){
          System.out.println("YOUR Email ID is: "+email);
          System.out.println("YOUR Password is: "+Password);
          return new EmailAdmin(email,Password);


        }









    public static String getDept(){
        System.out.println(" 1 for  Accounting\n 2 for Development\n 3 for Sales\n 4 for Marketing");
        Scanner a=new Scanner(System.in);
        int dep=a.nextInt();
        if(dep==1){
            return "Accounting";
        }
        else if(dep==2){
            return "Development";

        }
       else if(dep==3){
            return "Sales";
        }
        else if(dep==4){
            return "Marketing";
        }
        else{
            System.out.println("Please enter a valid input");
           return getDept();
        }

    }

    public static String getPassword(int length){
        String PasswordSet="ABCDEFGHIJKLMNOPQUERSTUWXYZabcdefghijklmnopquerstuvwxyz1234567890!@#$%%^&*()_+}{";
        String capital="ABCDEFGHIJKLMNOPQUERSTUWXYZ";
        String small="abcdefghijklmnopquerstuvwxyz";
        String Integers="1234567890";
        String special="!@#$%%^&*()_+}{";


        char password[]=new char [length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random()*PasswordSet.length());
             password [i]=PasswordSet.charAt(rand);
        }

        return new String(password);
    }

    /*public static void changePassword(String email){
        if(Details.containsKey(email)){
        System.out.println("Please enter your new password of 8 characters");
        Scanner b=new Scanner(System.in);
        String pass=b.nextLine();
        if(pass.length()!=PasswordCapacity){
            System.out.println("Password should be of 8 characters");
            changePassword(email);
        }
        Details.put(email,pass);

        }
        else{
            System.out.println("Wrong input");}
    }

    public  static String getpass(String email){
        String val=Details.get(email);
        return val;
    }



    public static void getallinfo(){
        System.out.println(Details);
    }

*/
    public static void main(String[] args) {
        Email();

    }



}
