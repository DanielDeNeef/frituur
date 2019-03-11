public class Sauce implements Orederable {
    private String name;

    public Sauce() {
        this(null);
    }

    public Sauce(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        final double price = 0.8;
        return price;
    }

    @Override
    public String toString() {
        return name+"("+getPrice()+"€)";
    }
}
