package factoryMethod.product.nystyle;

import factoryMethod.product.Pizza;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "NY Style Sause and Cheese Veggie Pizza";
        dough = "This Crust Dough";
        sauce = "Marinara Sauce";
        
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Veggies");
    }
    
}
