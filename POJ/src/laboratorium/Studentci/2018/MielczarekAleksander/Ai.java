package projekt;
//Template pattern, Strategy pattern
public class Ai extends Player {
    private Strategy strategy;

    Ai(Strategy strategy){
        this.strategy = strategy;
    }
    void play(Board playground){
        Coordinates chosen = this.strategy.choose_pawn(playground, color);
        int move = this.strategy.choose_move(playground, color, chosen);
        playground.move(chosen, move);
    }
}
