package com.company;

public abstract class Observer
{
    protected   Auction                         auction;

    public      abstract    void                updatePrice(double newPrice);
    public      abstract    double               getBudget();
    public      abstract    void                setBudget(double budget);
    public      abstract    int                 getTrustPoints();
    public      abstract    void                setTrustPoints(int trust_points);
    public      abstract    ObserverState       getObserver_state();
    public      abstract    void                setObserver_state(ObserverState observer_state);
    public      abstract    String              getName();
    public      abstract    void                setName(String name);
    public      abstract    String              getSurname();
    public      abstract    void                setSurname(String surname);
    public      abstract    String              getLogin();
    public      abstract    void                setLogin(String login);
    public      abstract    String              getEmail();
    public      abstract    void                setEmail(String email);
    public      abstract    void                Bid(double price);
}
