package tw.cclu.designpattern.decorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecoratorTest {

    @Test
    public void test() {
        Pizza pizza = new PlainPizza();
        Pizza pork = new Pork(pizza);
        Pizza mushroom = new Mushroom(pork);
        pizza = mushroom;
        System.out.println(pizza.getDescription());
        assertTrue(pizza.getDescription().equalsIgnoreCase("Mushroom, Pork, Plain Pizza"));
    }

}
