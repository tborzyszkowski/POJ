package com.ola.breakthrough.Player.Ai.Strategy;

import com.ola.breakthrough.Board.BoardMove;

import java.util.List;

public interface IMoveStrategy {
    BoardMove pickMove(List<BoardMove> moves);
}
