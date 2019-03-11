public class Water extends Drink {

    private String name;

    public Water() {
        this(null);
    }

    public Water(String name) {
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
        final double price=1.5;
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}
