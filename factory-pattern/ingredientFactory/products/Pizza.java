package ingredientFactory.products;

import ingredientFactory.ingredients.cheese.Cheese;
import ingredientFactory.ingredients.clams.Clams;
import ingredientFactory.ingredients.dough.Dough;
import ingredientFactory.ingredients.pepperoni.Pepperoni;
import ingredientFactory.ingredients.sauce.Sauce;
import ingredientFactory.ingredients.veggies.Veggies;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "" ;
    }

}
