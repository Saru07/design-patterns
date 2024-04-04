package factoryMethod.store;

import factoryMethod.product.Pizza;
import factoryMethod.product.nystyle.NYStyleCheesePizza;
import factoryMethod.product.nystyle.NYStyleClamPizza;
import factoryMethod.product.nystyle.NYStylePepperoniPizza;
import factoryMethod.product.nystyle.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    Pizza createPizza(String type) {
        if( type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if( type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if( type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if( type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }

    
}
