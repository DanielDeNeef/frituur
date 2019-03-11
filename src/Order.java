import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Random;

public class Order {

    private static int orderCount;
    public Orederable [] orederables=new Orederable[0];
    private int orderNumber;

    public Order() {
        orderCount++;
        orderNumber=orderCount;
    }

    public double calculatetotal(){
        double finalPrice=0;

        for (int x = 0;x<orederables.length;x++){
            finalPrice+=orederables[x].getPrice();
        }
        return finalPrice;
    }

    public void addToOrder(Orederable orderItem){
        orederables= Arrays.copyOf(orederables,orederables.length+1);
        orederables[orederables.length-1]=orderItem;
    }

    public void fryOrder(){
        for (Orederable x:orederables){
            if (x instanceof Fries){
                ((Fries) x).Fry();
            }
        }

    }

    public void getOrderItems(){
        System.out.println("Bestelling "+orderNumber+" bestaat uit:");
        for (Orederable x : orederables){
            System.out.println("- "+x);
        }
        System.out.println("totaal: "+calculatetotal()+"€");
        System.out.println("-----------------------------------");
        System.out.println("********************INFO********************");
        System.out.println("totaal bestellingen: "+orderCount);
        System.out.println("er zijn tot nu toe "+Fries.getPortioncount()+" vershillende pakjet frietjes verkocht");
        System.out.println("********************************************");
    }



}
