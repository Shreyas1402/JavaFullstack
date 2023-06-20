package CompanyQuestions;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
class UserDistance{
    int distance;
    String user;
    public UserDistance(int d,String user) {
        distance=d;
        this.user=user;
    }
}

public class DistanceAndUser {
    static TreeMap<Integer, UserDistance> UserInfo= new TreeMap<>();


    static ArrayList<Integer> A = new ArrayList<>();

    static Scanner s = new Scanner(System.in);

    public static void CheckValid(TreeMap<Integer,UserDistance> UserInfo,ArrayList<Integer> A,int distance,int NumberOfUsers,int NoOfDays){
        for(Map.Entry<Integer,UserDistance> it:UserInfo.entrySet()){
            UserDistance Dist=it.getValue();
            if(Dist.distance>=distance){
                A.add(it.getKey());
            }
        }
        Distance(A,NumberOfUsers,NoOfDays);

    }
    public static void Distance(ArrayList<Integer> A, int NoOfUsers,int NoOfDays){
        int days=1;
        int index=0;
        while(days<=NoOfDays){
            HashMap<Integer,UserDistance> Answer=new HashMap<>();
            while(Answer.size()<NoOfUsers){

                if(index==A.size()){
                    index=0;
                }
                Answer.put(A.get(index),UserInfo.get(A.get(index)));

                index++;
            }


            System.out.println("Day no "+days);
            for(Map.Entry<Integer,UserDistance> it:Answer.entrySet()){
                UserDistance u=it.getValue();
                System.out.println("USER ID: "+it.getKey()+" UserName: "+u.user+" Distance "+u.distance);
            }
            days++;


        }
    }

    public static void main(String[] args) {

        UserInfo.put(1,new UserDistance(1,"Shreyas"));
        UserInfo.put(2,new UserDistance(2,"Ravi"));
        UserInfo.put(3,new UserDistance(3,"Anju"));
        UserInfo.put(4,new UserDistance(4,"Shruti"));

           CheckValid(UserInfo,A,0,3,3);


    }
}

