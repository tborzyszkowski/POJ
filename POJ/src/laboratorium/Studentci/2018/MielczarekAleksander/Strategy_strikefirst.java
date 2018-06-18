package projekt;

import java.util.Random;

// Strategy Pattern
public class Strategy_strikefirst implements Strategy {
    public int count_pawns(Board playground, String color){ // Policzenie zywych pionkow ktore moga zbic
        int live_pawns = 0;
        for (int x = 0; x < 7; x++){
            for (int y = 0; y < 7; y++){
                if (playground.board[x][y].occupied && playground.board[x][y].occupant.color.equals(color) && playground.board[x][y].occupied && playground.board[x][y].occupant.strike[2]){
                    live_pawns++;
                }
            }
        }
        return live_pawns;
    }

    public Coordinates choose_pawn(Board playground, String color){ // Losowe wybranie pionka do poruszenia ktory jest w stanie zbic
        int live_pawns;
        live_pawns = count_pawns(playground, color);
        Random rand = new Random();
        int value = rand.nextInt(live_pawns) + 1;
        Coordinates chosen = new Coordinates();
        for(int i = 0; i < live_pawns;){
            for (chosen.x = 0; chosen.x < 7; chosen.x++){
                for (chosen.y = 0; chosen.y < 7; chosen.y++){
                    if (playground.board[chosen.x][chosen.y].occupant.color.equals("color") && playground.board[chosen.x][chosen.y].occupied && playground.board[chosen.x][chosen.y].occupant.strike[2]){
                        i++;

                    }
                }
            }
        }
        return chosen;
    }

    public int choose_move(Board playground, String color, Coordinates chosen){ // Losowe wybranie ruchu dla wybranego pionka


        int list_size = 0;
        for (int i = 0; i < 2; i++) { // Sprawdzanie ilosci dostepnych ruchow
            if (playground.board[chosen.x][chosen.y].occupant.strike[i]) {
                list_size++;
            }
        }
        int[] move_list = new int[list_size];
        int j = 0;
        for (int i = 0; i < 2; i++){ // Tworzenie listy dostepnych ruchow;
            if (playground.board[chosen.x][chosen.y].occupant.strike[i]) {
                if (i == 1){
                    move_list[j] = 2;
                    j++;
                }
                else {
                    move_list[j] = 0;
                    j++;
                }
            }
        }
        Random rand = new Random();
        int chosen_move = move_list[rand.nextInt(list_size)]; // Losowe wybranie ruchu
        return chosen_move;
    }
}
