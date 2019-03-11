public class Fries implements Fryable,Orederable{

    private FrySizes size;
    private double price;
    public static int portioncount;

    public Fries() {
        this.size=FrySizes.SMALL;
        portioncount++;
    }

    public Fries(FrySizes size) {
        this.size = size;
        portioncount++;
        price=size.getPrice();
    }

    public FrySizes getSize() {
        return size;
    }

    public void setSize(FrySizes size) {
        this.size = size;
        price=size.getPrice();
    }

    public static int getPortioncount() {
        return portioncount;
    }

    @Override
    public void Fry() {
        System.out.println("smijt een "+size+" portie in de frietpot");
    }

    @Override
    public double getPrice() {

        return price;
    }

    @Override
    public String toString() {
        return size.name().toLowerCase()+"("+getPrice()+"€)";
    }
}
