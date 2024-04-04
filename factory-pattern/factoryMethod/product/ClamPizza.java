package factoryMethod.product;


public class ClamPizza extends Pizza {

    public ClamPizza() {
        name = "Clam Pizza";
        dough = "regular";
        sauce = "regular";
        toppings.add("Clam");
    }
    
}
