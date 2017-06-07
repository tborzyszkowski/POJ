/**
 * Created by Kuba on 10.05.2017.
 */
public abstract  class Pizza {
    public String name;
    private String components;
    private int levelOfHot;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }

    public int getLevelOfHot() {
        return levelOfHot;
    }

    public void setLevelOfHot(int levelOfHot) {
        this.levelOfHot = levelOfHot;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name:" + this.getName() + "\n"+
                "Components:" + this.getComponents()+ "\n"+
                "LevelOfHot:" + this.getLevelOfHot()+"\n"+
                "Price:" + this.getPrice();
    }
}
