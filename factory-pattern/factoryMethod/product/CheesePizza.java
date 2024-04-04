package factoryMethod.product;


public class CheesePizza extends Pizza {

    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "regular";
        sauce = "regular";
        toppings.add("Cheese");
    }
    
}
