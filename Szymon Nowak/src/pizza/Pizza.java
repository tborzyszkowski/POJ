package pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    private String opis;
    private String nazwa;
    private String ciasto;
    private String sos;
    private int ostrosc;
    private List<String> skladniki;
    private int cena;
    public double wielkosc;
    public Pizza() {
        skladniki = new ArrayList<>();
    }

    public String pobierzOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getCiasto() {
        return ciasto;
    }

    public void setCiasto(String ciasto) {
        this.ciasto = ciasto;
    }
    public void setWielkosc(double wielkosc) {
        this.wielkosc = wielkosc;
    }
    public void setOstrosc(int ostrosc) {
        this.ostrosc = ostrosc;
    }
    public String getSos() {
        return sos;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public List<String> getSkladniki() {
        return skladniki;
    }

    public void setSkladniki(List<String> skladniki) {
        this.skladniki = skladniki;
    }

    public void addSkladnik(String skladnik) {
        skladniki.add(skladnik);
    }

    public String pokazPizze() {
        return nazwa + ciasto + sos + skladniki;
    }

    public abstract double koszt();

}
