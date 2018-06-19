package projekt;
// State pattern
public class Playing implements Game {
    public void play(Board playground, Player player){
        player.play(playground);
    };
}
