package ProjectTicTacToe;

public class Board {
    private char board[][];
    private int size=3;
    private  char p1Symbol,p2Symbol;
    private int count;

    public Board(char p1Symbol,char p2Symbol){
        board =new char[size][size];
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                board[i][j]=' ';
            }
            System.out.println();
        }
        this.p1Symbol=p1Symbol;
        this.p2Symbol=p2Symbol;

    }


}
