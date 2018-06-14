package com.ola.breakthrough.Player;

import com.ola.breakthrough.Board.BoardMove;
import com.ola.breakthrough.Board.TeamName;

import java.util.List;

public interface IPlayer {

    BoardMove pickMove(List<BoardMove> moves);
    TeamName getTeam();

}
