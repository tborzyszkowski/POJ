package com.company;

public class Stop_AuctionManagerState implements AuctionManagerState
{
    public void changeState(AuctionManager auction_manager)
    {
        System.out.println("");
        System.out.println("Całkowita wartość transakcji = " + allAuctionPrice(auction_manager));
        System.out.println("");
        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
        System.out.println(" ~ ZAKOŃCZENIE SYSTEMU AUKCYJNEGO ~ ");
        System.out.println(" ~      Zapraszamy ponownie!      ~ ");
        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
        System.out.println("");
        auction_manager.setState(this);
    }

    public double allAuctionPrice(AuctionManager auction_manager)
    {
        double sum = 0;
        for (Auction a : auction_manager.getAuctions())
        {
            sum += a.getPrice();
        }
        return sum;
    }

    public String toString()
    {
        return "Auction Manager state = stop";
    }
}
