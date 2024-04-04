package ingredientFactory;

import ingredientFactory.ingredients.cheese.Cheese;
import ingredientFactory.ingredients.cheese.Mozzarella;
import ingredientFactory.ingredients.clams.Clams;
import ingredientFactory.ingredients.clams.FrozenClams;
import ingredientFactory.ingredients.dough.Dough;
import ingredientFactory.ingredients.dough.ThickCrustDough;
import ingredientFactory.ingredients.pepperoni.Pepperoni;
import ingredientFactory.ingredients.pepperoni.SlicedPepperoni;
import ingredientFactory.ingredients.sauce.PlumTomatoSauce;
import ingredientFactory.ingredients.sauce.Sauce;
import ingredientFactory.ingredients.veggies.BlackOlives;
import ingredientFactory.ingredients.veggies.EggPlant;
import ingredientFactory.ingredients.veggies.Spinach;
import ingredientFactory.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new EggPlant(), new Spinach(), new BlackOlives() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
    
}
