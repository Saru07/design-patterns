package factoryMethod.store;

import factoryMethod.product.Pizza;
import factoryMethod.product.chicagostyle.ChicagoStyleCheesePizza;
import factoryMethod.product.chicagostyle.ChicagoStyleClamPizza;
import factoryMethod.product.chicagostyle.ChicagoStylePepperoniPizza;
import factoryMethod.product.chicagostyle.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String type) {
        if( type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if( type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if( type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if( type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }

    
}
