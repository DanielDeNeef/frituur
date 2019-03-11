import java.util.Arrays;

public class FryShack {
    private String name;
    public Order [] orders = new Order [0];

    public FryShack(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void placeOrder(){
        orders= Arrays.copyOf(orders,orders.length+1);
        orders[orders.length-1]=new Order();
    }




}
