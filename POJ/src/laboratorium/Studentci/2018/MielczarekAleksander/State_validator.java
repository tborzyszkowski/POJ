package projekt;
//Sprawdza w jakim stanie jest gra
public class State_validator {
    String check_state(Board playground){
        // Sprawdzanie czy jest zwyciesca
        for (int y = 0; y < 7; y++){
            if (playground.board[0][y].occupant.color.equals("white")){
                return "white";
            }
        }
        for (int y = 0; y < 7; y++){
            if (playground.board[7][y].occupant.color.equals("black")){
                return "black";
            }
        }

        // Sprawdzanie czy gra jest w remisie
        int draw_validator = 0;
        for (int x = 0; x < 7; x++){
            for (int y = 0; y < 7; y++){
                if (playground.board[x][y].occupant.moveability[3]){
                    draw_validator++;
                }
            }
        }
        if (draw_validator == 0){
            return "Draw";
        }
        // W kazdym innym wypadku gra sie kontynuuje
        return "Playing";
    }
}
