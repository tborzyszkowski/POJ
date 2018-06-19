package projekt;

import java.util.Arrays;

public class Board implements API {
    private String opposite_color(String color){
        String color_opposite;
        if (color.equals("white")){
            return "black";
        }
        else {
            return "white";
        }
    }
    private int opposite_position(int x, String color){
        if (color.equals("white")){
            return (x+1);
        }
        else {
            return (x-1);
        }
    }
    private void moveability(int where, int x, int y){
        String color = this.board[x][y].occupant.color;
        String color_opposite = opposite_color(color);
        int opposite_x = opposite_position(x, color);
        if (where == 0) { // left
            if (y == 0) { // Jezeli pionek jest na brzegu planszy, nie moze sie poruszyc w lewo
                this.board[x][y].occupant.moveability[0] = false;
            }
            else if (this.board[opposite_x][y - 1].occupant.color != null && this.board[opposite_x][y - 1].occupant.color.equals(color)) { // Jezeli po lewej jest drugi pionek o tym samym kolorze, nie moze sie poruszyc w lewo
                this.board[x][y].occupant.moveability[0] = false;
            }
            else {
                this.board[x][y].occupant.moveability[0] = true;
                if (y > 0 && this.board[opposite_x][y - 1].occupant.color != null && this.board[opposite_x][y - 1].occupant.color.equals(color_opposite)){
                    this.board[x][y].occupant.strike[0] = true;
                }
            }
        }
        if (where == 1) { // forward
            if (this.board[opposite_x][y].occupied){ // Jezeli przed pionkiem jest inny pionek, nie moze sie poruszyc do przodu
                this.board[x][y].occupant.moveability[1] = false;
            }
            else {
                this.board[x][y].occupant.moveability[1] = true;
            }
        }
        if (where == 2) { // right
            if (y == 7) { // Jezeli pionek jest na brzegu planszy, nie moze sie poruszyc w prawo
                this.board[x][y].occupant.moveability[2] = false;
            } else if (this.board[opposite_x][y + 1].occupant.color != null && this.board[opposite_x][y + 1].occupant.color.equals(color)) { // Jezeli po lewej jest drugi pionek o tym samym kolorze, nie moze sie poruszyc w lewo
                this.board[x][y].occupant.moveability[2] = false;
            }
            else {
                this.board[x][y].occupant.moveability[2] = true;
                if (y > 0 && this.board[opposite_x][y - 1].occupant.color != null && this.board[opposite_x][y - 1].occupant.color.equals(color_opposite)){
                    this.board[x][y].occupant.strike[1] = true;
                }
            }
        }
        if (this.board[x][y].occupant.moveability[0] || this.board[x][y].occupant.moveability[1] || this.board[x][y].occupant.moveability[2]){
            this.board[x][y].occupant.moveability[3] = true;
        }
        if (this.board[x][y].occupant.strike[0] || this.board[x][y].occupant.strike[1]){
            this.board[x][y].occupant.strike[2] = true;
        }
        else {
            this.board[x][y].occupant.moveability[3] = false;
        }
    }
    public void check_moveability(){
        for (int x = 0; x < 8; x++){
            for (int y = 0;  y < 8; y++){
                if (this.board[x][y].occupied){
                    moveability(0,  x, y);
                    moveability(1,  x, y);
                    moveability(2,  x, y);
                }
            }
        }
    }
    Tile[][] board = new Tile[8][8];
    Board(){
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                board[x][y] = new Tile();
                //board[x][y].occupied = false;
                //board[x][y].occupant.set(null, x, y);
            }
        }
    }
    void start(){
        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 8; y++) {
                this.board[x][y].occupied = true;
                this.board[x][y].occupant.set("white", x, y);
                this.board[7-x][y].occupied = true;
                this.board[7-x][y].occupant.set("black", 7-x, y);
            }
        }
    }

    public void print(){
        for (int x = 7; x >= 0; x--) {
            System.out.println(" ");
            for (int y = 0; y < 8; y++) {
                this.board[x][y].print();
            }
        }
    }
    public void move(Coordinates pawn, int where){ //Zamienia pole pionka na pole pionka docelowego
        this.board[pawn.x][pawn.y].occupant.print_pos();
        String color = this.board[pawn.x][pawn.y].occupant.color;
        System.out.print(color);
        Coordinates direction;
        direction = pawn;
        if (color.equals("white")){
            direction.x = pawn.x+1;
        }
        else{
            direction.x = pawn.x-1;
        }
        if (where == 1){ //left
            direction.y = pawn.y-1; //diry = 0
        }
        else if (where == 2){ //forward //
            direction.y = pawn.y;
        }
        else if (where == 3){ //right
            direction.y = pawn.y+1;
        }
        this.board[direction.x][direction.y].occupant.inherit(this.board[pawn.x][pawn.y].occupant); // przepisanie pionka do nowej pozycji
        this.board[direction.x][direction.y].occupied = true;
        this.board[direction.x][direction.y].occupant.move(where);// ustawienie nowej pozycji w pionku
        this.board[pawn.x][pawn.y].occupant = null; // usuniecie starego pionka
        this.board[pawn.x][pawn.y].occupied = false;
        this.board[direction.x][direction.y].occupant.print_pos();

    }

//x=row y=column
}
