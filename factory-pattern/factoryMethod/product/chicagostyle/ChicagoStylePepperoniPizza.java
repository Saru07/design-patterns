package factoryMethod.product.chicagostyle;

import factoryMethod.product.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Deep Dish Cheese Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Pepperoni");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
    
}
