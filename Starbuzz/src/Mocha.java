public class Mocha extends CondimentDecorator {

    Beverage beverage;

    //Public Constructor
    public Mocha(Beverage beverage){

        this.beverage = beverage;

    }

    public String getDescription(){

        return beverage.getDescription() + ", Mocha";

    }

    public double cost(){

        return beverage.cost() + .20;

    }

}
