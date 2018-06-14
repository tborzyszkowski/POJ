package com.company;
import java.util.ArrayList;

public interface Auction
{
    public abstract void                runAuction(AuctionManager auctionManager);
    public abstract void                notifyAllBidders(double newPrice);
    public abstract void                attach(Observer observer);
    public abstract double              getPrice();
    public abstract void                setPrice(double price);
    public abstract AuctionState        getAuction_state();
    public abstract void                setAuction_state(AuctionState auction_state);
    public abstract String              getDescription();
    public abstract void                setDescription(String description);
    public abstract int                 getMinimal_trust();
    public abstract void                setMinimal_trust(int minimal_trust);
    public abstract int                 getRound();
    public abstract void                setRound(int round);
    public abstract String              getName();
    public abstract void                setName(String name);
    public abstract Auctioneer          getAuctioneer();
    public abstract void                setAuctioneer(Auctioneer auctioneer);
    public abstract Bidder              getWinner();
    public abstract void                setWinner(Bidder winner);
    public abstract boolean             allBiddersPassed();
    public abstract TransactionState    getTransaction_state();
    public abstract void                setTransaction_state(TransactionState transaction_state);
    public abstract ArrayList<Observer> getBidders();
    public abstract void                setBidders(ArrayList<Observer> bidders);
    public abstract String              toString();
    public abstract boolean             isNil();
}