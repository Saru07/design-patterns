package factoryMethod.product;


public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        name = "Pepperoni Pizza";
        dough = "regular";
        sauce = "regular";
        toppings.add("Pepperoni");
    }
    
}
