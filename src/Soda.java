public class Soda extends Drink {

    private String name;

    public Soda() {
        this(null);
    }

    public Soda(String name) {
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
        final double price=2;
        return price;
    }

    @Override
    public String toString() {
        return name+"("+getPrice()+"€)";
    }
}
