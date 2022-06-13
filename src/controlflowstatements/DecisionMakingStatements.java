package controlflowstatements;


public class DecisionMakingStatements {
    public static void main(String[] args)
    {
        String city ="PUNE";
        if(city=="PUNE")
        {
            System.out.println("YOU ARE FROM PUNE");
        }
        else
        {
            System.out.println("YOU ARE FROM MUMBAI");
        }

        //ELSE IF LADDER

        if(city=="MUMBAI")
        {
            System.out.println("YOU ARE FROM MUMBAI");
        }
        else if(city=="GOA")
        {
            System.out.println("YOU ARE FROM GOA");
        }
        else
        {
            System.out.println("YOU ARE FROM PUNE");
        }
       String country="INDIA";
        if(country=="INDIA")
        {
            if(city=="PUNE")
            {
                System.out.println("PUNE IS IN INDIA");
            }
            else
            {
                System.out.println("MUMBAI IS IN INDIA");
            }

        }
        else
        {
            System.out.println("YOU ARE IN SOME OTHER COUNTRY");
        }

    }
}
