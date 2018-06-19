package projekt;
// Template pattern
public abstract class Player {
    String color;
    private String opposite_color(String color){
        String color_opposite;
        if (color.equals("white")){
            return "black";
        }
        else {
            return "white";
        }
    }
    private int opposite_position(int y, String color){
        if (color.equals("white")){
            return (y+1);
        }
        else {
            return (y-1);
        }
    }
    private void moveability(int where, Board playground, int x, int y){
            String color = playground.board[x][y].occupant.color;
            String color_opposite = opposite_color(color);
            int opposite_y = opposite_position(y, color);
            if (playground.board[x][opposite_y].occupant.color.equals(color_opposite)){
                playground.board[x][y].occupant.moveability[2] = false;
            }
            else{
                playground.board[x+(where-2)][y].occupant.moveability[2] = true;
            }
    }
    void check_moveability(Board playground){
        for (int x = 0; x < 8; x++){
            for (int y = 0;  y < 8; y++){
                if (playground.board[x][y].occupied){
                    moveability(1, playground, x, y);
                    moveability(2, playground, x, y);
                    moveability(3, playground, x, y);
                }
            }
        }
    }

    boolean validate_move(Coordinates pawn, Board playground, int where){
        return playground.board[pawn.x][pawn.y].occupant.moveability[where];
    }
    void move(Coordinates pawn, Board playground, int where){
        if (validate_move(pawn, playground, where)){
            playground.move(pawn, where);
        }
    }
    void play(Board playground){

    }
}
