package tw.cclu.designpattern.decorator;

public class PlainPizza implements Pizza {

    @Override
    public double getPrice() {
        return 3.0;
    }

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

}
