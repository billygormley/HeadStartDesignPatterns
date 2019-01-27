public class SteamedMilk extends CondimentDecorator {

    Beverage beverage;

    //Public Constructor
    public SteamedMilk(Beverage beverage){

        this.beverage = beverage;

    }

    public String getDescription(){

        return beverage.getDescription() + ", SteamedMilk";

    }

    public double cost(){

        return beverage.cost() + .10;

    }

}
