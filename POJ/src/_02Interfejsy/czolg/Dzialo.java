package _02Interfejsy.czolg;

public class Dzialo {
    private double kaliber;

    public Dzialo(double kaliber) {
        this.kaliber = kaliber;
    }

    public Dzialo(Dzialo dzialo) {
        this.kaliber = dzialo.kaliber;
    }

    public double getKaliber() {
        return kaliber;
    }

    public void setKaliber(double kaliber) {
        this.kaliber = kaliber;
    }

    @Override
    public String toString() {
        return "Dzialo{" +
                " kaliber=" + kaliber + 
                " hash=" + this.hashCode() +
                "}";
    }
}
