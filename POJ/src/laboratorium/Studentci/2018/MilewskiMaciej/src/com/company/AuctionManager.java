package com.company;

import java.awt.font.TransformAttribute;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AuctionManager
{
    private ArrayList<Auction> auctions = new ArrayList<>();
    private AuctionManagerState state = null;


    public AuctionManagerState getState()
    {
        return state;
    }
    public void setState(AuctionManagerState state)
    {
        this.state = state;
    }
    public AuctionManager addAuction(Auction a)
    {
        if (!a.isNil())
            auctions.add(a);
        return this;
    }
    public ArrayList<Auction> getAuctions ()
    {
        return auctions;
    }
    public int getSize()
    {
        int size = 0;
        for(Auction a : auctions)
            size += 1;
        return size;
    }
    public void showAuctions()
    {
        for (int i = 0; i < this.getSize(); i++)
        {
            System.out.println(this.auctions.get(i).toString());
        }
    }
    public void finishedAuctions()
    {
        for(Auction a : auctions)
        {
            if (a.getAuction_state() == AuctionState.FINISHED)
                System.out.println(a.toString());
        }
    }

    public void unfinishedAuctions()
    {
        for(Auction a : auctions)
        {
            if (a.getAuction_state() == AuctionState.CONTINUES)
                System.out.println(a.toString());
        }
    }

    public void userAuctions(String l)
    {
        for(Auction a : auctions)
        {
            if (a.getAuctioneer().getLogin().equals(l))
                System.out.println(a.toString());
        }
    }


    public void nextRound(Auction a)
    {
        a.setRound(a.getRound()-1);
    }

    public void checkWinners(Auction a)
    {
        if (a.getAuction_state() == AuctionState.FINISHED && a.allBiddersPassed() == true)
        {
            a.getAuctioneer().setObserver_state(ObserverState.CAN_ADD_TRUST_POINTS);

            if(a.getTransaction_state() == TransactionState.NOT_PAID)
            {
                if (a.getWinner().getBudget() >= a.getPrice())
                {
                    a.setTransaction_state(TransactionState.PAID);
                    a.getWinner().setBudget(a.getWinner().getBudget()-a.getPrice());
                    a.getAuctioneer().setProfit(a.getPrice());
                    a.getWinner().setTrustPoints(a.getWinner().getTrustPoints()-2);
                }
                else
                {
                    a.setTransaction_state(TransactionState.LACK_OF_FUNDS);
                    a.getWinner().setTrustPoints(a.getWinner().getTrustPoints()+1);// użytkownik wygrał licytację, ale nie posiada już środków, ponieważ zużył je na inną aukcję
                }
            }
        }
    }

    public void runAuctions()
    {
        Start_AuctionManagerState startState = new Start_AuctionManagerState();
        startState.changeState(this);

        for (Auction a : auctions)
        {
            a.runAuction(this);
        }

        Stop_AuctionManagerState stopState = new Stop_AuctionManagerState();
        stopState.changeState(this);
    }

}
