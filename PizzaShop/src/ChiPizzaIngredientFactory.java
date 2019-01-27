public class ChiPizzaIngredientStore {

    public Dough createDough(){

        return new ThickCrustDough();

    }

    public Sauce createSauce(){

        return new PlumTomatoSauce();

    }

    public Cheese createCheese(){

        return new MozzarellaCheese();

    }

    public Eggplant createEggplant(){

        return new Eggplant();

    }

    public Pepperoni createPepperoni(){

        return new SlicedPepperoni();

    }

    public Clams createClams(){

        return new FrozenClams();

    }

    public Spinach createSpinach(){

        return new Spinach();

    }

    public BlackOlives createBlackOlives(){

        return new BlackOlives();

    }



}
