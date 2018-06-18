package projekt;
import java.util.Scanner;
// Template pattern
public class Human extends Player {
    void play(Board playground){
        System.out.print("Row of the pawn to move: ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.print("Column of the pawn to move: ");
        int y = s.nextInt();
        System.out.print("Where to move the pawn: ");
        int where = s.nextInt();
        Coordinates move = new Coordinates();
        move.x = x;
        move.y = y;
        move(move, playground, where);
    }
}
