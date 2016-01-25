package tw.cclu.designpattern.decorator;

import org.junit.Test;

public class DecoratorTest {

    @Test
    public void test() {
    	Device computer = new Computer();
    	Device device = new CardReader(new Webcam(computer));
    	device.execute();
    	device = new CardReader(computer);
    }

}
