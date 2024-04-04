package ingredientFactory;

import ingredientFactory.ingredients.cheese.Cheese;
import ingredientFactory.ingredients.clams.Clams;
import ingredientFactory.ingredients.dough.Dough;
import ingredientFactory.ingredients.pepperoni.Pepperoni;
import ingredientFactory.ingredients.sauce.Sauce;
import ingredientFactory.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
    
} 