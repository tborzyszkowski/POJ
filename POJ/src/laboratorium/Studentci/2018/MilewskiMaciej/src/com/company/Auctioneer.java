package com.company;

public class Auctioneer extends Observer
{
    private ObserverState observer_state = ObserverState.WAITING;
    private String name;
    private String surname;
    private String login;
    private String email;
    private int trust_points;
    private double minimal_bid;
    private double profit;


    public Auctioneer(String name, String surname, String login, String email, int trust_points)
    {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.email = email;
        this.trust_points = trust_points;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    @Override
    public double getBudget(){return 0;}

    @Override
    public void setBudget(double budget) { }

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
    public String getSurname()
    {
        return surname;
    }

    @Override
    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    @Override
    public String getLogin()
    {
        return login;
    }

    @Override
    public void setLogin(String login)
    {
        this.login = login;
    }

    @Override
    public String getEmail()
    {
        return email;
    }

    @Override
    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public int getTrustPoints()
    {
        return trust_points;
    }

    @Override
    public void setTrustPoints(int trust_ponints)
    {
        this.trust_points = trust_ponints;
    }

    public double getMinimal_bid()
    {
        return minimal_bid;
    }

    public void setMinimal_bid(double minimal_bid)
    {
        this.minimal_bid = minimal_bid;
    }

    @Override
    public ObserverState getObserver_state()
    {
        return observer_state;
    }

    @Override
    public void setObserver_state(ObserverState observer_state)
    {
        this.observer_state = observer_state;
    }

    @Override
    public void updatePrice(double newPrice)
    {
        this.minimal_bid = newPrice;
    }

    @Override
    public void Bid(double price)
    {
        System.out.println("TEST");
    }

    public Auction createAuction(String auctionType, String name, String description, double price, int round, int minimal_trust)
    {
        AuctionFactory auctionFactory = new AuctionFactory();
        Auction result = auctionFactory.getAuction(auctionType, this, name, description, price, round, minimal_trust);
        return  result;
    }
}
