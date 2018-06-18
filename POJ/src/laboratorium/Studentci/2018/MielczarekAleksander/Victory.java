package projekt;
// State pattern
public class Victory implements Game {
    public void play(Board playground, Player player){
        System.out.println(player.color + " won the game!");
    };
}
