package ingredientFactory.store;

import ingredientFactory.NYPizzaIngredientFactory;
import ingredientFactory.PizzaIngredientFactory;
import ingredientFactory.products.CheesePizza;
import ingredientFactory.products.ClamPizza;
import ingredientFactory.products.PepperoniPizza;
import ingredientFactory.products.Pizza;
import ingredientFactory.products.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if( type.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if( type.equals("veggie")) {
            
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        } else if( type.equals("clam")) {
            
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        } else if( type.equals("pepperoni")) {
            
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");

        } 

        return pizza;
    }

    
}
