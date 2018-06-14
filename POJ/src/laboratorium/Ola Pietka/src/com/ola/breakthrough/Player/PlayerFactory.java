package com.ola.breakthrough.Player;

import com.ola.breakthrough.Player.Ai.AiPlayer;
import com.ola.breakthrough.Player.Ai.Strategy.*;
import com.ola.breakthrough.Player.Human.LocalHumanPlayer;
import com.ola.breakthrough.Player.Human.HumanPlayerType;
import com.ola.breakthrough.Board.TeamName;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class PlayerFactory { //Fabryka graczy


    public static IPlayer createHumanPlayer(TeamName name, HumanPlayerType player) {
        if (player == HumanPlayerType.Local)
        {
            return new LocalHumanPlayer(name);
        }else
        {
            throw new NotImplementedException();
        }
    }

    public static IPlayer createRandomAiPlayer(TeamName name) {
        return new AiPlayer(name, StrategyFactory.createStrategy(StrategyType.Random));
    }

    public static IPlayer createAttackPlayer(TeamName name) {
        return new AiPlayer(name, StrategyFactory.createStrategy(StrategyType.Attack));
    }
}
