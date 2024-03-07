import java.util.Scanner;
public class Mod7 {
        public static void main (String[] args){


    Scanner in = new Scanner (System.in);
    String playerA = "";
    String playerB ="";
    playerA = playerMove(in, "what is player A move");
    playerB = playerMove(in, "what is player B mover");
    System.out.println("player a move is: "+playerA);
    System.out.println("playen b move is: " + playerB);


}
private static String playerMove(Scanner pipe, String message){
        String move = "";
        while (true) {
            System. out. println(message);
            if(move.equalsIgnoreCase ( "r") || move.equalsIgnoreCase ("s") || move.equalsIgnoreCase("p") )
            {
                break;
            }
            else   {
                System.out.println("incorecttry again");
            }
        }
        return move;
    }
}