package CompanyQuestions;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DiatanceAndUser1 {
    static Scanner s=new Scanner(System.in);
    static TreeMap<Integer, String> map = new TreeMap<>();

    public static void CheckValid(TreeMap<Integer, String> map, int d,int NoOfUsers, int NoOfDays,ArrayList<Integer>blocked) {
        ArrayList<Integer> A = new ArrayList<>();
        for (Map.Entry<Integer, String> it : map.entrySet()) {
            if(blocked.contains(it.getKey())){
                continue;
            }
            else if(it.getKey()>=d) {
                A.add(it.getKey());
            }

        }
        System.out.println(A);
          Distance(A,NoOfUsers,NoOfDays);
    }

    public static void CheckValid1(TreeMap<Integer, String> map, int d,int NoOfUsers, int NoOfDays,ArrayList<String>blocked) {
        ArrayList<Integer> A = new ArrayList<>();
        for (Map.Entry<Integer, String> it : map.entrySet()) {
            if(blocked.contains(it.getValue())){
                continue;
            }
            else if(it.getKey()>=d) {
                A.add(it.getKey());
            }

        }
        System.out.println(A);
        Distance(A,NoOfUsers,NoOfDays);
    }

    public static void Distance(ArrayList<Integer> A, int NoOfUsers, int NoOfDays) {
        int index = 0;
        int day=0;
        int i=0;
        while (day<NoOfDays) {
            TreeMap<Integer, String> Ans = new TreeMap<>();
            while (Ans.size() < NoOfUsers) {
                if (index >=A.size()) {
                    index = 0;
                }
                Ans.put(A.get(index), map.get(A.get(index)));
               // System.out.println(Ans);

                index++;
            }
            day++;

            System.out.println("day" +day);
            for (Map.Entry<Integer, String> it : Ans.entrySet()) {
               // System.out.println(i);
                System.out.println("User: " + it.getValue() + "\n" + "Distance: " + it.getKey());

            }
          //  i++;

        }

    }
    public static void Update(TreeMap<Integer, String> map, int d,int NoOfUsers, int NoOfDays,ArrayList<Integer>blocked) {
        System.out.println("ENTER THE DISTANCE ");
        int distance = s.nextInt();
        System.out.println("ENTER THE USER ");
        String user = s.next();


        map.put(d, user);


    }

    public static void Remove(int UserId) {
        String user = map.get(UserId);
        map.remove(UserId);
        System.out.println("Successfully removed user " + user);
    }
    public static void main(String[] args) {
        ArrayList<Integer>blocked=new ArrayList<>();
        ArrayList<String>b1=new ArrayList<>();
        b1.add("Shruti");
        b1.add("sharvi");
        map.put(1, "Shreyas");
        map.put(2, "Ravi");
        map.put(3, "Anju");
        map.put(4,"Shruti");
        map.put(5,"sharvi");
        map.put(6,"random");

        System.out.println(map.size());
     System.out.println("ENTER 1 TO KNOW THE NUMBER OF USERS \n ENTER 2 TO UPDATE THE LIST \n ENTER 3 TO DELETE A USER ");
        int ch= s.nextInt();

        switch(ch){
            case 1: {
                System.out.println("ENTER YOUR DISTANCE ");
                int d = s.nextInt();
                System.out.println("ENTER THE NUMBER OF USERS YOU WANT TO SEE");
                int u = s.nextInt();
                System.out.println("ENTER THE NUMBER OF DAYS FOR WHICH YOU WANT TO SEE THEM");
                int nd = s.nextInt();
              /*  System.out.println("ENTER THE NUMBER OF DISTANCES YOU WANT TO BLOCK");
                int number=s.nextInt();

                for(int i=1;i<=number;i++){
                    System.out.println("ENTER THE "+i+"th DISTANCE YOU WISH TO BLOCK");
                    int block=s.nextInt();
                    blocked.add(block);
                }
                System.out.println(blocked);*/
                CheckValid1(map,d,u,nd,b1);
                break;
            }

            case 2:{
                //Update(map,d,u,nd,blocked);
                break;
            }
            case 3:{
                System.out.println("ENTER THE USER DISTANCE YOU WANT TO DELETE");
                Remove(s.nextInt());
                break;
            }
            default:{
                System.out.println("WRONG INPUT");
            }
        }



    }




    }

