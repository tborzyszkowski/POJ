public abstract class Pizza {

    private String opis;
    private int ostrosc;
    private int cena;

    public Pizza(){};

    public Pizza(String opis, int ostrosc, int cena){
        this.opis = opis;
        this.ostrosc = ostrosc;
        this.cena = cena;
    }

    public void setOpis(String opis){
        this.opis = opis;
   }

    public String getOpis() {
        return opis;
    }

    public int getOstrosc() {
        return ostrosc;
    }

    public double getCena(){ return cena; }

    @Override
    public String toString() {
        return "Pizza <{ " + getOpis() +
                " <|> Stopien ostrosci=" + getOstrosc() +
                " <|> Cena=" + getCena() +
                " }>";
    }
}
