package factoryMethod.product.chicagostyle;

import factoryMethod.product.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Deep Dish Cheese Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Veggies");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
    
}
