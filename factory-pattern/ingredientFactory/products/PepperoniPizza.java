package ingredientFactory.products;

import ingredientFactory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = this.ingredientFactory.createDough();
        sauce = this.ingredientFactory.createSauce();
        cheese = this.ingredientFactory.createCheese();
    }
    
}
