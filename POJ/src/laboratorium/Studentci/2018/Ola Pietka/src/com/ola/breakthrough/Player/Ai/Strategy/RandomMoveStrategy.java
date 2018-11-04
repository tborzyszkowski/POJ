package com.ola.breakthrough.Player.Ai.Strategy;

import com.ola.breakthrough.Board.BoardMove;

import java.util.List;
import java.util.Random;

public class RandomMoveStrategy implements IMoveStrategy{

    @Override
    public BoardMove pickMove(List<BoardMove> moves) {
        return moves.get(new Random().nextInt(moves.size())); //Wybiera randomowy ruch z listy mozliwych ruchow
    }
}
