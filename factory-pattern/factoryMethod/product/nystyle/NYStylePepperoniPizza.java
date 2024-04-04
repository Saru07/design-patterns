package factoryMethod.product.nystyle;

import factoryMethod.product.Pizza;

public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza() {
        name = "NY Style Sause and Cheese Pepperoni Pizza";
        dough = "This Crust Dough";
        sauce = "Marinara Sauce";
        
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Pepperoni");
    }
    
}
