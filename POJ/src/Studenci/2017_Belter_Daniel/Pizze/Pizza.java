package Pizze;

public abstract class Pizza {
    private String nazwa;
    private String skladniki;
    private int ostosc;
    private double cena;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getSkladniki() {
        return skladniki;
    }

    public void setSkladniki(String skladniki) {
        this.skladniki = skladniki;
    }

    public int getOstosc() {
        return ostosc;
    }

    public void setOstosc(int ostosc) {
        this.ostosc = ostosc;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Pizze.Pizza{" +
                "nazwa='" + this.getNazwa() + '\'' +
                ", skladniki='" + this.getSkladniki() + '\'' +
                ", ostosc=" + this.getOstosc() +
                ", cena=" + this.getCena() +
                '}';
    }
}
