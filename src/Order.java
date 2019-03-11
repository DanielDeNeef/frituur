import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Random;

public class Order {

    private static int orderCount;
    public Orederable [] orederables=new Orederable[0];
    private int orderNumber;
    private Sauce [] sauces=new Sauce[0];
    private Soda [] sodas=new Soda[0];
    private Water [] waters=new Water[0];
    private Beer [] beers=new Beer[0];


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
        System.out.println("\nBestelling "+orderNumber+" bestaat uit:");
        /*for (Orederable x : orederables){
            System.out.println("- "+x);
        }*/
        groupOrders();
        System.out.println("\ntotaal: "+calculatetotal()+"€");
        System.out.println("-----------------------------------");
        System.out.println("********************INFO********************");
        System.out.println("totaal bestellingen: "+orderCount);
        System.out.println("er zijn tot nu toe "+Fries.getPortioncount()+" vershillende pakjes friet verkocht");
        System.out.println("********************************************");
    }

    public void groupOrders() {
        int numberFries = 0, numberSoda = 0, numberwater = 0, numberBeer = 0, numberSauce = 0;

        for (int x = 0; x < orederables.length; x++) {
            if (orederables[x] instanceof Fries) {
                numberFries++;
            }
            if (orederables[x] instanceof Soda) {
                sodas = Arrays.copyOf(sodas, sodas.length + 1);
                sodas[sodas.length - 1] = (Soda) orederables[x];
                numberSoda++;
            }
            if (orederables[x] instanceof Water) {
                waters = Arrays.copyOf(waters, waters.length + 1);
                waters[waters.length - 1] = (Water) orederables[x];
                numberwater++;
            }
            if (orederables[x] instanceof Beer) {
                beers = Arrays.copyOf(beers, beers.length + 1);
                beers[beers.length - 1] = (Beer) orederables[x];
                numberBeer++;
            }
            if (orederables[x] instanceof Sauce) {
                sauces = Arrays.copyOf(sauces, sauces.length + 1);
                sauces[sauces.length - 1] = (Sauce) orederables[x];
                numberSauce++;
            }
        }
        printGroupedordres(numberBeer,numberSoda,numberwater,numberFries,numberSauce);
    }

    public void printGroupedordres(int beer,int soda, int water, int fries, int sauce){
        if (beer>0){

            if (beer>1) {
                System.out.println("\n" + beer + " pintjes :");
            }else {
                System.out.println("\n" + beer + " pintje :");
            }
            for (Beer x : beers){
                System.out.println("-"+x);
            }
        }
        if (fries>0){
            if (fries>1) {
                System.out.println("\n" + fries + " pakjes friet :");
            }else {
                System.out.println("\n" + fries + " pakje friet :");
            }
            for (Orederable x : orederables){
                if (x instanceof Fries){
                    System.out.println("- "+x);;
                }
            }
        }
        if (soda>0){
            if (soda>1) {
                System.out.println("\n" + soda + " sodas :");
            }else {
                System.out.println("\n" + soda + " soda :");
            }
            for (Soda x : sodas){
                System.out.println("- "+x);
            }
        }
        if (water>0){
            if (water>1) {
                System.out.println("\n" + water + " waters :");
            }else {
                System.out.println("\n"+water+" water :");
            }
            for (Water x : waters){
                System.out.println("- "+x);
            }
        }
        if (sauce>0){
            if (sauce>1) {
                System.out.println("\n" + sauce + " Sauzen :");
            }else {
                System.out.println("\n" + sauce + " Saus :");
            }
            for (Sauce x : sauces){
                System.out.println("- "+x);
            }
        }
    }



}
