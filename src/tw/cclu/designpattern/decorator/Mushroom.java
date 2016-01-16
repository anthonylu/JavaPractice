package tw.cclu.designpattern.decorator;

public class Mushroom extends ToppingDecorator {

    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + .50;
    }

    @Override
    public String getDescription() {
        return "Mushroom, " + pizza.getDescription();
    }
}
