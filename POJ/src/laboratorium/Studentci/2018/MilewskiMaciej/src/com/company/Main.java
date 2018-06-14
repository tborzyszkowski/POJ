package com.company;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // Inicjalizuję system aukcyjny oraz fabrykę aukcji
        AuctionFactory auctionFactory = new AuctionFactory();
        AuctionManager auctionManager = new AuctionManager();

        // Tworzę aukcje oraz sprzedawcę
        Auctioneer auctioneer = new Auctioneer("Maciej", "Milewski", "Go", "maciek6606@wp.pl", 100);
        Auction auction1 = auctioneer.createAuction("SIMPLE","parasol","niesamowity księżycowy parasol",1000.00,3,3);
        Auction auction2 = auctioneer.createAuction("PROLONGED","fiat panda","2007, 227432 km",3000.00,2,2);
        Auction auction3 = auctioneer.createAuction("REVERSE","piec gazowy","Junkers 3 letni",750,3,2);

        // Dodaje aukcję do systemu
        auctionManager.addAuction(auction1);
        //auctionManager.addAuction(auction2);
        auctionManager.addAuction(auction3);

        // Tworzę licytatorów i przypisuje do konkretnych aukcji
        Bidder bidder1 = new Bidder(auction1,"Jan","Kupiec","QPR32","jK@o2.pl",2000.00,4);
        Bidder bidder2 = new Bidder(auction1,"Matt","Damon","PZZ34","Md@o2.pl",2200.00,6);
        Bidder bidder3 = new Bidder(auction2,"Marek","Dynarczyk","IIKLQJ91","marcus@gmail.com",7000.00,3);
        Bidder bidder4 = new Bidder(auction2,"Zygmunt","Krasicki","ZHBHZ","zyg@gmail.com",8000.00,3);
        Bidder bidder5 = new Bidder(auction3,"Janusz","Kowalski","KSBKA","j.kow@wp.pl",1500.00,2);
        Bidder bidder6 = new Bidder(auction3,"Stanisław","Rydz","KJWBMJA","stasRydz@onet.pl",1000.00,6);

        // Start systemu aukcyjnego
        auctionManager.runAuctions();
    }
}
