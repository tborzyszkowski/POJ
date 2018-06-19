package projekt;
// State pattern
public class Context {
    public Game game;

    public Context(){
        game = null;
    }
    public void setState(Game game){
        this.game = game;
    }

    public Game getState(){
        return game;
    }
}
