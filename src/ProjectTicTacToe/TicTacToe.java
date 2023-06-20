package ProjectTicTacToe;

import java.util.Scanner;

public class TicTacToe {
    private Player player1,player2;
    private Board board;

    public void startGame(){
        Scanner s=new Scanner(System.in);
        player1=TakeplayerInput(1);
        player2=TakeplayerInput(2);
        while(player1.getSymbol()== player2.getSymbol()){
            System.out.println("Symbol already taken pick a new symbol ");
            System.out.println("ENTER A NEW SYMBOL");
            player2.setSymbol(s.next().charAt(0));
        }

        board =new Board(player1.getSymbol(),player2.getSymbol());

        boolean playerturn1=true;
    }


    private Player TakeplayerInput(int num){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter player "+num+" name: ");
        String name =s.nextLine();
        System.out.println("Enter player "+num+" Symbol: ");
        char symbol=s.next().charAt(0);
       Player p=new Player();
       return p;
    }



}
