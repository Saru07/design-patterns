
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.15 + this.beverage.cost();
    }

    public String getDescription() {
        return this.beverage.getDescription() + " , Soy"; 
    }

}
