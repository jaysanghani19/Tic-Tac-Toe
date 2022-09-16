package TicTacToe;

public class ArrayforTicTacToe {

  private static String []input;
  // Assign Value so user can choose the number. And we can use as constructor
ArrayforTicTacToe(){
    input = new String[9];
    input[0]="1";
    input[1]="2";
    input[2]="3";
    input[3]="4";
    input[4]="5";
    input[5]="6";
    input[6]="7";
    input[7]="8";
    input[8]="9";

}

    // Set Player 1's input
   public void setinputforcross(int n){
    input[n-1]="X";
    }

    // Set player 2's input
    public void setinputforzero(int n){
        input[n-1]="0";
    }


    //Get input of all value on the board of Tic Tac Toe
        public String [] getinput(){
            return input;
        }

}
