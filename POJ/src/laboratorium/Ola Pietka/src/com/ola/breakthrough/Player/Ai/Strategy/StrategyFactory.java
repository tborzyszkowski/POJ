package com.ola.breakthrough.Player.Ai.Strategy;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StrategyFactory { //Fabryka strategii

    public static IMoveStrategy createStrategy(StrategyType type) {
        if(type == StrategyType.Random)
        {
            return new RandomMoveStrategy();
        }else if(type == StrategyType.Attack)
        {
            return new AttackFirstMoveStrategy();
        }else
        {
            throw new NotImplementedException(); //Jezeli nie zostal spelniony zaden warunek, wyrzuca wyjatek
        }
    }

}
