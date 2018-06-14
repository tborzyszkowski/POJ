package com.ola.breakthrough.Player.Human;

import com.ola.breakthrough.Board.Board;
import com.ola.breakthrough.Board.BoardMove;
import com.ola.breakthrough.Player.IPlayer;
import com.ola.breakthrough.Board.TeamName;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LocalHumanPlayer implements IPlayer {

    Scanner scanner = new Scanner(System.in);

    private TeamName team;
    public LocalHumanPlayer(TeamName team)
    {
        this.team = team;
    }

    @Override
    public BoardMove pickMove(List<BoardMove> moves) {
        while(true){
            System.out.println("Podaj ruch");
            String line = scanner.nextLine().toUpperCase(); //Czyta wpisana fraze w formacie np. "a6 a5"

            String[] split = line.split(" "); //Odziela wpisana fraze spacja

            int fromX = split[0].charAt(0) - 65; //Wpisana litera pierwszego polecenia (skad skacze pionek) zamieniona na liczbe (z tablicy ASCII)
            int fromY = Integer.parseInt(split[0].substring(1));

            int toX = split[1].charAt(0) - 65; //Wpisana litera drugiego polecenia (dokad skacze pionek) zamieniona na liczbe
            int toY = Integer.parseInt(split[1].substring(1));

            for (BoardMove move : moves) {
                if((move.getFrom().getX() == fromX) && (move.getFrom().getY() == fromY) && (move.getTo().getX() == toX) && (move.getTo().getY() == toY)){
                    return move; //Jezeli w liscie "move" znajduje sie wpisany ruch, zwraca ten ruch
                }
            }
        }
    }

    @Override
    public TeamName getTeam() {
        return team;
    }
}
