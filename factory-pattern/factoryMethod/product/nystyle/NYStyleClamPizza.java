package factoryMethod.product.nystyle;

import factoryMethod.product.Pizza;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "NY Style Sause and Cheese Clam Pizza";
        dough = "This Crust Dough";
        sauce = "Marinara Sauce";
        
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Clam");
    }

    
}
