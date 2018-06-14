package com.company;

public class Start_AuctionManagerState implements AuctionManagerState
{
    public void changeState(AuctionManager auction_manager)
    {
        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
        System.out.println(" ~ ROZPOCZĘCIE SYSTEMU AUKCYJNEGO ~ ");
        System.out.println(" ~      Zapraszamy ponownie!      ~ ");
        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ");
        System.out.println("");
        System.out.println("Ilość aukcji: " + auction_manager.getSize());
        System.out.println("");
        auction_manager.setState(this);
    }

    public String toString()
    {
        return "Auction Manager state = start";
    }
}
