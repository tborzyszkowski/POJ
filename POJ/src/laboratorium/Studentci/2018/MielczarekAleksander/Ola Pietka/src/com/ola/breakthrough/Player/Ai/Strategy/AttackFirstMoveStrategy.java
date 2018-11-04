package com.ola.breakthrough.Player.Ai.Strategy;

import com.ola.breakthrough.Board.BoardMove;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AttackFirstMoveStrategy implements IMoveStrategy{

    @Override
    public BoardMove pickMove(List<BoardMove> moves) {

        List<BoardMove> attacks = new ArrayList<>();

        for (BoardMove move : moves) {
            if(move.getTo().getTeam() == null) //Jezeli miejsce na ktore pionek ma sie ruszyc jest puste - continue;
            {
                continue;
            }

            if(move.getFrom().getTeam() != move.getTo().getTeam()) //Jezeli miejsce na ktore pionek ma sie ruszyc jest zajete przez pionek przeciwnika, dodaje do listy atakow (ttacks)
            {
                attacks.add(new BoardMove(move.getFrom(), move.getTo()));
            }
        }

        if(attacks.isEmpty()) //Jezeli lista atakow jest pusta, wybiera losowy ruch z listy mozliwych ruchow
        {
            return moves.get(new Random().nextInt(moves.size()));
        }else { //Jezeli lista atakow nie jest pusta, wybiera randomowy ruch z listy atakujacych ruchow
            return attacks.get(new Random().nextInt((attacks.size())));
        }
    }
}