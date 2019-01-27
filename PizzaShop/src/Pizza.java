import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    ArrayList toppings = new ArrayList();


    abstract void prepare();


    void bake(){

        System.out.println("Baking for 25 minutes at 350F!");

    }

    void cut(){

        System.out.println("Cutting the pizza into slices.");

    }

    void box(){

        System.out.println("Placing the pizza in an official pizza box!");

    }


    public String getName(){

        return name;

    }

}
