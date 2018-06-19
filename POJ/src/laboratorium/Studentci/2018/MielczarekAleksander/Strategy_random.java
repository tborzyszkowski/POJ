package projekt;

import java.util.Random;

// Strategy Pattern
public class Strategy_random implements Strategy {
    public int count_pawns(Board playground, String color){ // Policzenie zywych pionkow
        int live_pawns = 0;
        for (int x = 0; x < 7; x++){
            for (int y = 0; y < 7; y++){
                if (playground.board[x][y].occupied && playground.board[x][y].occupant.color.equals(color) && playground.board[x][y].occupant.moveability[3]){
                    live_pawns++;
                }
            }
        }
        System.out.print(live_pawns);
        return live_pawns;
    }

    public Coordinates choose_pawn(Board playground, String color){ // Losowe wybranie pionka do poruszenia
        int live_pawns;
        live_pawns = count_pawns(playground, color);
        Random rand = new Random();
        int value = rand.nextInt(live_pawns) + 1;
        Coordinates chosen = new Coordinates();
        for(int i = 0; i < live_pawns;){
            for (chosen.x = 0; chosen.x < 7; chosen.x++){
                for (chosen.y = 0; chosen.y < 7; chosen.y++){
                    if (playground.board[chosen.x][chosen.y].occupant.color.equals("color") && playground.board[chosen.x][chosen.y].occupied && playground.board[chosen.x][chosen.y].occupant.moveability[3]){
                        i++;
                    }
                }
            }
        }
        return chosen;
    }

    public int choose_move(Board playground, String color, Coordinates chosen){ // Losowe wybranie ruchu dla wybranego pionka

        int list_size = 0;
        for (int i = 0; i < 3; i++) { // Sprawdzanie ilosci dostepnych ruchow
            if (playground.board[chosen.x][chosen.y].occupant.moveability[i]) {
                list_size++;
            }
        }
        int[] move_list = new int[list_size];
        int j = 0;
        for (int i = 0; i < 3; i++){ // Tworzenie listy dostepnych ruchow;
            if (playground.board[chosen.x][chosen.y].occupant.moveability[i]) {
                move_list[j] = i;
                j++;
            }
        }
        Random rand = new Random();
        int chosen_move = move_list[rand.nextInt(list_size)]; // Losowe wybranie ruchu
        return chosen_move;
    }
}
