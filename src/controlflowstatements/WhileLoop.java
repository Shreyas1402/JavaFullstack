package controlflowstatements;

public class WhileLoop {
    public static void main(String[] args)
    {
        int i=1;
        while (i<6)
        {
            System.out.println(i+":HELLO");
            i++;
        }
        int no=2,power=2;
        int result=1;
                while(power>0)
                {
                    result=result*no;
                    power--;

                }
        System.out.println("");
    }
}
