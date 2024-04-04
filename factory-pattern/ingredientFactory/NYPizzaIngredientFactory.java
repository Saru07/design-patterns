package ingredientFactory;

import ingredientFactory.ingredients.cheese.Cheese;
import ingredientFactory.ingredients.cheese.ReggianoCheese;
import ingredientFactory.ingredients.clams.Clams;
import ingredientFactory.ingredients.clams.FreshClams;
import ingredientFactory.ingredients.dough.Dough;
import ingredientFactory.ingredients.dough.ThinCrustDough;
import ingredientFactory.ingredients.pepperoni.Pepperoni;
import ingredientFactory.ingredients.pepperoni.SlicedPepperoni;
import ingredientFactory.ingredients.sauce.MarinaraSauce;
import ingredientFactory.ingredients.sauce.Sauce;
import ingredientFactory.ingredients.veggies.Garlic;
import ingredientFactory.ingredients.veggies.Mushroom;
import ingredientFactory.ingredients.veggies.Onion;
import ingredientFactory.ingredients.veggies.RedPepper;
import ingredientFactory.ingredients.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
    
}
