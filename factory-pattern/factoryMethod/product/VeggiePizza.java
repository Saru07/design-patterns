package factoryMethod.product;


public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "regular";
        sauce = "regular";
        toppings.add("Capsicum");
        toppings.add("Mushroom");
        toppings.add("Onion");
        toppings.add("Corn");
        toppings.add("Tomato");
        toppings.add("olives");
    }
}
