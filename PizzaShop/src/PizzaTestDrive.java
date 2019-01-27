public class PizzaTestDrive {

    public static void main(String[] args){

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chiStore = new ChicagoPizzaStore();


        Pizza myPizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a" + myPizza.getName() + "\n");

        Pizza somePizza = chiStore.orderPizza("cheese");
        System.out.println("Joel ordered a" + somePizza.getName() + "\n");



    }


}
