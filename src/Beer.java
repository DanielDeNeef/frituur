public class Beer extends Drink {

    private String name;

    public Beer() {
        this(null);
    }

    public Beer(String name) {
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
        final double price=2.5;
        return price;
    }

    @Override
    public String toString() {
        return name+"("+getPrice()+"€)";
    }
}
