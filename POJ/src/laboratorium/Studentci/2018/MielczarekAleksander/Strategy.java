package projekt;

// Strategy Pattern

public interface Strategy {
    Coordinates choose_pawn(Board playground, String color);
    int choose_move(Board playground, String color, Coordinates chosen);
}
