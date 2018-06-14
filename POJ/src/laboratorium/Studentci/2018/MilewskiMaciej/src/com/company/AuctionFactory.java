package com.company;

public class AuctionFactory
{
    public Auction getAuction (String auctionType, Auctioneer auctioneer, String name, String description, double price, int round, int minimal_trust)
    {
        if (auctionType == null)
        {
            return new NullAuction();
        }

        else if (auctionType.equalsIgnoreCase("SIMPLE"))
        {
            return new SimpleAuction(auctioneer, name, description, price, round, minimal_trust);
        }
        else if (auctionType.equalsIgnoreCase("PROLONGED"))
        {
            return new ProlongedAuction(auctioneer, name, description, price, round, minimal_trust);
        }
        else if (auctionType.equalsIgnoreCase("REVERSE"))
        {
            return new ReverseAuction(auctioneer, name, description, price, round, minimal_trust);
        }
        return new NullAuction();
    }
}
