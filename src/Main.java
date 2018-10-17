
import java.util.Scanner;

public class Main{

    public static void main(String[ ] args) {

        TicTacToe tacToe = new TicTacToe();
        Scanner s = new Scanner(System.in);
        int pos=0;
        System.out.println(tacToe);
        do
        {
            System.out.println(tacToe.player==tacToe.X?"Player X turn":"Player O turn");

            System.out.println("Enter your position (1-9).");
            pos=s.nextInt();
            boolean validMove = tacToe.makeMove(pos);
            while(validMove == false){
                System.out.println("You can't move there! Enter another position (1-9).");
                pos=s.nextInt();
                validMove = tacToe.makeMove(pos);
            }

            System.out.println(tacToe);
            System.out.println("_____________________________");
            tacToe.displayWinner();

        }while(tacToe.isEmpty);
    }
}





//import java.util.Scanner;
//
//public class Main{
//
//    public static void main(String[ ] args) {
//
//        TicTacToe t = new TicTacToe();
//        Scanner s = new Scanner(System.in);
//        int x=0,y=0;
//        do
//        {
//            System.out.println(t.player==t.X?"Player X turn":"Player O turn");
//            System.out.println(t.toString());
//            System.out.println("Enter x and y places");
//            x=s.nextInt();
//            y=s.nextInt();
//
//            t.putSign(x, y);
//            System.out.println(t.toString());
//            System.out.println("_____________________________");
//            t.displayWinner();
//
//        }while(t.isEmpty);
//    }
//}


