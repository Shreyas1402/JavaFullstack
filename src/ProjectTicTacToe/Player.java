package ProjectTicTacToe;

public class Player {
    String name;
    private char symbol;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setSymbol(char symbol){
        this.symbol=symbol;

    }
    public char getSymbol(){
        return symbol;
    }
}
