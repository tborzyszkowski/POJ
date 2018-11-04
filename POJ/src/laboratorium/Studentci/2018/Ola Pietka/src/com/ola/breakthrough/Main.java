package com.ola.breakthrough;

import com.ola.breakthrough.Board.Board;
import com.ola.breakthrough.Board.TeamName;
import com.ola.breakthrough.Player.Human.HumanPlayerType;
import com.ola.breakthrough.Player.IPlayer;
import com.ola.breakthrough.Player.PlayerFactory;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Witaj w grze breakthrough!");
        System.out.println("----------ZASADY---------");
        System.out.println("1. Mozesz poruszac sie o jedno pole do przodu lub na skos.");
        System.out.println("2. Mozesz zbic pionka przeciwnika jedynie na skos");
        System.out.println("3. Aby przesunac pionka na wybrane pole musisz wpisac index miejsca z jakiego skacze oraz index miejsca na ktorym konczy");
        System.out.println("    -np. 'a6 a5', pionek z pola a6 zostanie przesuniety na pole a5");
        System.out.println("    -w poziomie pola indexowane sa literami, a ich zakres zalezy od wielkosci planszy.");
        System.out.println("    -w pionie pola indexowane sa liczbami OD ZERA, a ich zakres takze zalezy od wielkosci planszy.");
        System.out.println("        -np. w przypadku planszy 8x8 zakres liter jest od a do h, a liczb od 0 - 7");
        System.out.println("4. Aby wygrac gre musisz zbic wszystkie pionki przeciwnika lub dostac sie jedynm z pionkow na druga strone planszy");
        System.out.println(" ");

        IPlayer whitePlayer = PlayerFactory.createHumanPlayer(TeamName.White, HumanPlayerType.Local);
        //IPlayer blackPlayer = PlayerFactory.createHumanPlayer(TeamName.Black, HumanPlayerType.Local);

        //IPlayer whitePlayer = PlayerFactory.createAttackPlayer(TeamName.White);
        IPlayer blackPlayer = PlayerFactory.createAttackPlayer(TeamName.Black);

        //IPlayer whitePlayer = PlayerFactory.createRandomAiPlayer(TeamName.White);
        //IPlayer blackPlayer = PlayerFactory.createRandomAiPlayer(TeamName.Black);


        Board board = new Board(whitePlayer, blackPlayer, 8, 8);
        while(true) {
            board.update();
        }
    }
}
