package factoryMethod.product.chicagostyle;

import factoryMethod.product.Pizza;

public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Deep Dish Cheese Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Clam");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
    
}
