package tw.cclu.designpattern.decorator;

public class Pork extends ToppingDecorator {

    public Pork(Pizza pizza) {
        super(pizza);
    }
    
    @Override
    public double getPrice() {
        return pizza.getPrice() + 1.35;
    }

    @Override
    public String getDescription() {
        return "Pork, " + pizza.getDescription();
    }

}
