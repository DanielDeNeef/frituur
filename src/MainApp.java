public class MainApp {
    public static void main(String []args){

        FryShack daniel = new FryShack("Daniel");
        System.out.println();

        /*
        In de eerste order werk je aan de hand van de objecten en hun setMethodes om hun properties te gaan invullen
		Groot pak, middel pak, maynaise saus, Ketchup saus, water, soda
         */
        daniel.placeOrder();
        Fries big = new Fries();
        big.setSize(FrySizes.BIG);
        Fries small = new Fries();
        small.setSize(FrySizes.SMALL);
        Sauce ketchup = new Sauce();
        ketchup.setName("Ketchup");
        Water water  = new Water();
        water.setName("Evian");
        Soda soda = new Soda();
        soda.setName("Cola");

        daniel.orders[0].addToOrder(big);
        daniel.orders[0].addToOrder(small);
        daniel.orders[0].addToOrder(ketchup);
        daniel.orders[0].addToOrder(water);
        daniel.orders[0].addToOrder(soda);

        daniel.orders[0].fryOrder();
        daniel.orders[0].getOrderItems();

        /*
        in de  2de order maak je de objecten aan via hun Constructors.
		Family pak, maynaise saus, maynaise saus, ketchup saus, water, soda, soda, soda
         */
        daniel.placeOrder();
        Fries family = new Fries(FrySizes.FAMILY);
        Sauce mayo = new Sauce("maynaise");
        Sauce ketchup2 = new Sauce("Ketchup");
        Water evian = new Water("evian");
        Water spa = new Water("Spa");
        Water vitelle = new Water("Vitelle");
        Water bru = new Water("Bru");

        daniel.orders[1].addToOrder(family);
        daniel.orders[1].addToOrder(mayo);
        daniel.orders[1].addToOrder(ketchup2);
        daniel.orders[1].addToOrder(evian);
        daniel.orders[1].addToOrder(spa);
        daniel.orders[1].addToOrder(vitelle);
        daniel.orders[1].addToOrder(bru);

        daniel.orders[1].fryOrder();
        daniel.orders[1].getOrderItems();

        /*
        in de derde  order werk je met een Array van Orderables om in een keer uw bestellign aan te	 	maken.
		Groot pak, mayonaise saus, bier
         */
        daniel.placeOrder();
        daniel.orders[2].addToOrder(new Fries(FrySizes.BIG));
        daniel.orders[2].addToOrder(new Sauce("maynaise"));
        daniel.orders[2].addToOrder(new Beer("Jupiler"));

        daniel.orders[2].fryOrder();
        daniel.orders[2].getOrderItems();

        /*
        in de vierde order mag je zelf gaan bestellen tot je minimum 10 euro hebt.
        Dit mag je doen op	de voor jouw makkelijkste manier
         */
        daniel.placeOrder();
        daniel.orders[3].addToOrder(new Fries(FrySizes.FAMILY));
        daniel.orders[3].addToOrder(new Sauce("maynaise"));
        daniel.orders[3].addToOrder(new Sauce("ketchup"));
        daniel.orders[3].addToOrder(new Water("Spa"));
        daniel.orders[3].addToOrder(new Beer("Jupiler"));
        daniel.orders[3].addToOrder(new Beer("Jupiler"));
        daniel.orders[3].addToOrder(new Beer("Hapkin"));

        daniel.orders[3].fryOrder();
        daniel.orders[3].getOrderItems();

    }
}
