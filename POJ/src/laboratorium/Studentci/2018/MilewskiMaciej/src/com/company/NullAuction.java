package com.company;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;

public class NullAuction implements Auction
{
    private ArrayList<Observer> bidders = new ArrayList<Observer>();
    private AuctionState        auction_state = AuctionState.FINISHED;
    private TransactionState    transaction_state = TransactionState.NOT_PAID;
    private Auctioneer          auctioneer;
    private Bidder              winner;
    private String              name;
    private String              description;
    private double              price;
    private int                 round;
    private int                 minimal_trust;


    public NullAuction() { }

    @Override
    public void notifyAllBidders(double newPrice) { }
    @Override
    public void attach(Observer observer) { }
    @Override
    public boolean allBiddersPassed() { return true;}
    @Override
    public ArrayList<Observer> getBidders() { return null; }
    @Override
    public void setBidders(ArrayList<Observer> bidders) { this.bidders = null; }
    @Override
    public TransactionState getTransaction_state() { return null; }
    @Override
    public void setTransaction_state(TransactionState transaction_state) { this.transaction_state = null; }
    @Override
    public AuctionState getAuction_state() { return null; }
    @Override
    public void setAuction_state(AuctionState auction_state) { this.auction_state = null; }
    @Override
    public String getDescription() { return null; }
    @Override
    public void setDescription(String description) { this.description = null; }
    @Override
    public double getPrice() { return 0; }
    @Override
    public void setPrice(double price)
    {
        this.price = 0;
        notifyAllBidders(price);
    }
    @Override
    public int getMinimal_trust() { return 0; }
    @Override
    public void setMinimal_trust(int minimal_trust) { this.minimal_trust = 0; }
    @Override
    public int getRound() { return 0; }
    @Override
    public void setRound(int round) { this.round = 0; }
    @Override
    public String getName() { return "Aukcja pusta"; }
    @Override
    public void setName(String name) { this.name = null; }
    @Override
    public Auctioneer getAuctioneer() { return null; }
    @Override
    public void setAuctioneer(Auctioneer auctioneer) { this.auctioneer = null; }
    @Override
    public Bidder getWinner() { return null; }
    @Override
    public void setWinner(Bidder winner) { this.winner = null; }
    @Override
    public void runAuction(AuctionManager auctionManager) { System.out.println("Aukcja pusta - nie można obsłużyć"); }
    @Override
    public String toString() { return "Aukcja pusta"; }
    @Override
    public boolean isNil() { return true; }
}
