package TicTacToe;


import java.util.Objects;
import java.util.Scanner;

public class Allmethods {
   static ArrayforTicTacToe game = new ArrayforTicTacToe();
  static Scanner sc = new Scanner(System.in);
 static String []input= game.getinput();

        public static int checkResult(String Player1, String Player2){
            String sumofinput1=input[0]+input[1]+input[2];
            String sumofinput2=input[3]+input[4]+input[5];
            String sumofinput3=input[6]+input[7]+input[8];
            String sumofinput4=input[0]+input[3]+input[6];
            String sumofinput5=input[1]+input[4]+input[7];
            String sumofinput6=input[2]+input[5]+input[8];
            String sumofinput7=input[0]+input[4]+input[8];
            String sumofinput8=input[2]+input[4]+input[6];
        int result=0;
            if (sumofinput1.equals("XXX") || sumofinput2.equals("XXX") || sumofinput3.equals("XXX") || sumofinput4.equals("XXX") || sumofinput5.equals("XXX") || sumofinput6.equals("XXX") || sumofinput7.equals("XXX") || sumofinput8.equals("XXX")) {
                System.out.println(Player1 +" Wins");
                     result =1;
            }


            if (sumofinput1.equals("000") || sumofinput2.equals("000") || sumofinput3.equals("000") || sumofinput4.equals("000") || sumofinput5.equals("000") || sumofinput6.equals("000") || sumofinput7.equals("000") || sumofinput8.equals("000")) {
                System.out.println(Player2 +" Wins");
                result = 1;
            }
            return result;
          
        }
        // printBoard method is for printing The Board of Tic Tac Toe
        // Like this

    public static void printBoard(){
        System.out.println("_____________");
        System.out.println("| "+input[0]+" | "+input[1]+" | "+input[2]+" |");
        System.out.println("-------------");
        System.out.println("| "+input[3]+" | "+input[4]+" | "+input[5]+" |");
        System.out.println("-------------");
        System.out.println("| "+input[6]+" | "+input[7]+" | "+input[8]+" |");
        System.out.println("-------------");
    }

    int choice;
    public void mainLoop()
    {
        System.out.println("Welcome Tic Tac Toe 3 X 3 by Jay Sanghani");
        System.out.println("This is 2 Player game");
        System.out.println("Enter the 1st Player name");
        String Player1=sc.nextLine();

        System.out.println(" ");

        System.out.println("Enter the 2nd Player name");
        String Player2=sc.nextLine();

        System.out.println(" ");

        printBoard();
        System.out.println("This is Tic Tac Toe Board Enter the number where you want put Your sign");
        System.out.println(" ");
        //int choice;
        for (int i =1;i<10;i++)
        {

            if (i%2!=0)
            {
                System.out.println(Player1 +"'s Turn  Enter your choice");
                choice=sc.nextInt();
                while (choice<1 || choice>9)
                {
                    System.out.println("Your choice is wrong.");
                    System.out.println(" ");
                    System.out.println("Enter Your choice again");
                    choice = sc.nextInt();
                }
            }
            else
            {
                System.out.println(Player2 + " Turn.  Enter your choice");
                choice=sc.nextInt();
                while (choice<1 || choice>9)
                {
                    System.out.println("Your choice is wrong.");
                    System.out.println(" ");
                    System.out.println("Enter Your choice again");
                    choice = sc.nextInt();
                }
            }
            if (!Objects.equals(input[choice - 1], "X") && !Objects.equals(input[choice - 1], "0"))
            {
                if(i%2!=0)
                {
                    game.setinputforcross(choice);
                }
                else
                {
                    game.setinputforzero(choice);
                }
            }

            else {
                while (Objects.equals(input[choice - 1], "X") || Objects.equals(input[choice - 1], "0"))
                {
                    System.out.println(" ");
                    System.out.println("You've entered wrong choice Please enter your choice again");
                    choice = sc.nextInt();
                }
                if(i%2!=0)
                {
                    game.setinputforcross(choice);
                }
                else {
                    game.setinputforzero(choice);
                }

            }
            System.out.println(" ");
            printBoard();

           int result=checkResult(Player1,Player2);
           if(result==1)
           {
               break;
           }

           while (i==9)
           {
               if (result!=1)
               {
                   System.out.println(" ");
                   System.out.println("Match is Draw");
                   break;
               }
           }
        }
    }

}
