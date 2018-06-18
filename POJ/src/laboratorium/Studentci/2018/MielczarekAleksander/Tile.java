package projekt;

public class Tile implements API {
    boolean occupied;
    Pawn occupant = new Pawn();
    Tile(){
        this.occupied = false;
    }
    void set(Pawn pawn){
        this.occupant = pawn;
    }
    void clear(){
        this.occupied = false;
    }//TF
    public void print(){
        if (occupied) {
            occupant.print_pos();
        }
        else {
            System.out.print("00");
        }
    }

}
