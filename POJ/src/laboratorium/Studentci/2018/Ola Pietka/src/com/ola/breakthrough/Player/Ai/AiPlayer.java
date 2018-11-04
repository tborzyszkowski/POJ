package com.ola.breakthrough.Player.Ai;

import com.ola.breakthrough.Board.BoardMove;
import com.ola.breakthrough.Player.Ai.Strategy.IMoveStrategy;
import com.ola.breakthrough.Player.IPlayer;
import com.ola.breakthrough.Board.TeamName;

import java.util.List;
import java.util.Random;

public class AiPlayer implements IPlayer {

    private TeamName team;
    private IMoveStrategy strategy;

    public AiPlayer(TeamName team, IMoveStrategy strategy)
    {
        this.team = team;
        this.strategy = strategy;
    }

    @Override
    public BoardMove pickMove(List<BoardMove> moves) {
        return strategy.pickMove(moves);
    }

    @Override
    public TeamName getTeam() {
        return team;
    }


}
