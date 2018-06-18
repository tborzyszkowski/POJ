package projekt;

public class Pawn implements API {

    public String color;
    public Coordinates coord = new Coordinates();
    public boolean[] moveability = new boolean[4];
    public boolean[] strike = new boolean[3];


    public void print(){
        System.out.print(color);
        System.out.print(coord.x);
        System.out.print(coord.y);
    }
    public void set(String color, int x, int y){
        this.color = color;
        this.coord.x = x;
        this.coord.y = y;
    }
    public void move(int where) {
        if (where == 1) { //left
            this.coord.y--;
            if (this.color == "black") {
                this.coord.x--;
            }
            if (this.color == "white") {
                this.coord.x++;
            }
        }
        else if (where == 2) { //forward
            if (this.color == "black") {
                this.coord.x--;
            }
            if (this.color == "white") {
                this.coord.x++;
            }
        }
        else if (where == 3) { //right
            this.coord.y++;
            if (this.color == "black") {
                this.coord.x--;
            }
            if (this.color == "white") {
                this.coord.x++;
            }
        }
    }
    public void print_pos(){
        System.out.print(Character.toChars(65+coord.y));
        System.out.print(coord.x+1);
    }
    public void inherit(Pawn pawn){
        this.color = pawn.color;
        this.coord = pawn.coord;
    }
}
