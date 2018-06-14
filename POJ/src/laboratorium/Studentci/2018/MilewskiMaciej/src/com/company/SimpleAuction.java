package com.company;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;

public class SimpleAuction implements Auction
{

    private ArrayList<Observer> bidders = new ArrayList<Observer>();
    private AuctionState        auction_state = AuctionState.CONTINUES;
    private TransactionState    transaction_state = TransactionState.NOT_PAID;
    private Auctioneer          auctioneer;
    private Bidder              winner;
    private String              name;
    private String              description;
    private double              price;
    private int                 round;
    private int                 minimal_trust;


    public SimpleAuction(String name, String description, double price, int round, int minimal_trust)
    {
        this.name = name;
        this.description = description;
        this.price = price;
        this.round = round;
        this.minimal_trust = minimal_trust;
    }

    public SimpleAuction(Auctioneer auctioneer, String name, String description, double price, int round, int minimal_trust)
    {
        this.auctioneer = auctioneer;
        this.name = name;
        this.description = description;
        this.price = price;
        this.round = round;
        this.minimal_trust = minimal_trust;
    }

    @Override
    public void notifyAllBidders(double newPrice)
    {
        for (Observer observer : bidders)
        {
            observer.updatePrice(newPrice);
        }
    }

    @Override
    public void attach(Observer observer)
    {
        if (observer.getTrustPoints() >= minimal_trust)
        {
            bidders.add(observer);
        }
        else
        {
            System.out.println("Licytator posiada za mało punktów zaufania.");
        }
    }

    @Override
    public boolean allBiddersPassed()
    {
        for(Observer o : bidders)
        {
            if (o.getObserver_state() != ObserverState.PASS)
                return false;
        }
        return  true;
    }

    @Override
    public ArrayList<Observer> getBidders()
    {
        return bidders;
    }

    @Override
    public void setBidders(ArrayList<Observer> bidders)
    {
        this.bidders = bidders;
    }

    @Override
    public TransactionState getTransaction_state()
    {
        return transaction_state;
    }

    @Override
    public void setTransaction_state(TransactionState transaction_state)
    {
        this.transaction_state = transaction_state;
    }

    @Override
    public AuctionState getAuction_state()
    {
        return auction_state;
    }

    @Override
    public void setAuction_state(AuctionState auction_state)
    {
        this.auction_state = auction_state;
    }

    @Override
    public String getDescription()
    {
        return description;
    }

    @Override
    public void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public double getPrice()
    {
        return price;
    }

    @Override
    public void setPrice(double price)
    {
        this.price = price;
        notifyAllBidders(price);
    }

    @Override
    public int getMinimal_trust()
    {
        return minimal_trust;
    }

    @Override
    public void setMinimal_trust(int minimal_trust)
    {
        this.minimal_trust = minimal_trust;
    }

    public void ReadyToBid()
    {
        for (Observer observer : bidders)
        {
            observer.setObserver_state(ObserverState.READY_TO_BID);
        }
    }

    @Override
    public int getRound()
    {
        return round;
    }

    @Override
    public void setRound(int round)
    {
        if (auction_state == AuctionState.CONTINUES)
        {
            if (round == 0)
            {
                auction_state = AuctionState.FINISHED;
                this.round = round;
                ReadyToBid();
            }
            else
            {
                this.round = round;
                ReadyToBid();
            }
        }
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public Auctioneer getAuctioneer()
    {
        return auctioneer;
    }

    @Override
    public void setAuctioneer(Auctioneer auctioneer)
    {
        this.auctioneer = auctioneer;
    }

    @Override
    public Bidder getWinner()
    {
        return winner;
    }

    @Override
    public void setWinner(Bidder winner)
    {
        this.winner = winner;
    }

    public void auctionResult()
    {
        System.out.println("");
        System.out.println("Koniec aukcji: " + this.getName());
        System.out.println("     Kupujący: " + this.getWinner().getName());
        System.out.println("  Sprzedający: " + this.getAuctioneer().getName());
        System.out.println("      Wartość: " + this.getPrice() + " PLN");
        System.out.println("");
    }

    @Override
    public void runAuction(AuctionManager auctionManager)
    {
        Scanner nextRoundToken = new Scanner(System.in);
        String command = "next";
        String login = "";

        System.out.println("Aukcja " + this.getName());
        do
        {
            if (command.equals("next")) {
                auctionManager.nextRound(this);
                for (Observer b : this.getBidders())
                {
                    System.out.println("    Licytator: " + b.getName() + " " + b.getSurname());
                    System.out.print("    ");
                    Scanner input = new Scanner(System.in);
                    int bid = input.nextInt();
                    if (bid == 0) {
                        b.setObserver_state(ObserverState.PASS);
                        System.out.println("    uczestnik pasuje");
                    } else
                        b.Bid(bid);
                    auctionManager.checkWinners(this);
                }
                if (this.getAuction_state() == AuctionState.FINISHED)
                {
                    auctionResult();
                    break;
                }
            }
            else if(command.equals("unfinished")){
                auctionManager.unfinishedAuctions();
            }
            else if(command.equals("finished")){
                auctionManager.finishedAuctions();
            }
            else if(command.equals("search")){
                System.out.print("Login: ");
                login = nextRoundToken.next();
                auctionManager.userAuctions(login);
            }
            System.out.println("command => ");
            command = nextRoundToken.next();
        }
        while(!command.equals("stop"));
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean isNil()
    {
        return false;
    }
}
