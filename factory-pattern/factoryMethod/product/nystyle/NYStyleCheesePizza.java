package factoryMethod.product.nystyle;

import factoryMethod.product.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sause and Cheese Pizza";
        dough = "This Crust Dough";
        sauce = "Marinara Sauce";
        
        toppings.add("Grated Reggiano Cheese");
    }

}
