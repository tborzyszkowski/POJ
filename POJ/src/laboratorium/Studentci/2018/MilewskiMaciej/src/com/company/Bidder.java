package com.company;

public class Bidder extends Observer
{

    private ObserverState observer_state = ObserverState.READY_TO_BID;
    private String name;
    private String surname;
    private String login;
    private String email;
    private int trust_points;
    private double minimal_bid;
    private double budget;

    public Bidder(Auction auction, String name, String surname, String login, String email, double budget, int trust_points)
    {
        this.auction = auction;
        this.name          = name;
        this.surname       = surname;
        this.login         = login;
        this.email         = email;
        this.trust_points  = trust_points;
        this.budget        = budget;
        this.auction.attach(this);
    }

    @Override
    public void Bid(double price)
    {
        if (observer_state != ObserverState.PASS)
        {
            if (auction.getPrice() < price && budget >= price)
            {
                auction.setPrice(price);
                auction.setWinner(this);
                observer_state = ObserverState.PASS;
            }
            else
            {
                observer_state = ObserverState.PASS;
            }
        }
    }

    @Override
    public double getBudget()
    {
        return budget;
    }

    @Override
    public void setBudget(double budget)
    {
        this.budget = budget;
    }

    public double getMinimal_bid()
    {
        return minimal_bid;
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
    public ObserverState getObserver_state()
    {
        return observer_state;
    }

    @Override
    public void setObserver_state(ObserverState observer_state)
    {
        this.observer_state = observer_state;
    }

    public void passRound()
    {
        this.observer_state = ObserverState.PASS;
    }

    @Override
    public int getTrustPoints()
    {
        return trust_points;
    }

    @Override
    public void setTrustPoints(int trust_points)
    {
        this.trust_points = trust_points;
    }

    @Override
    public void updatePrice(double newPrice)
    {
        this.minimal_bid = newPrice;
    }

    @Override
    public String toString()
    {
        return "Nazwa: " + name + " " + surname + " Login: " + login + " Adres e-mail: " + email + " Punkty zaufania: " + trust_points;
    }
}
