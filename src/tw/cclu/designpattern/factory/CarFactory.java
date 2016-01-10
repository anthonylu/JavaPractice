package tw.cclu.designpattern.factory;

public class CarFactory {
	public enum Type { SPORTS, VAN }
	
	public static Vehicle getInstanceOf(Type type) {
		if (type == null) {
			return new NullCar();
		}
		
		switch(type) {
		case SPORTS:
			return new SportsCar(600, 2);
		case VAN:
			return new Van(300, 5);
		default:
			return new NullCar();
		}
	}
}
