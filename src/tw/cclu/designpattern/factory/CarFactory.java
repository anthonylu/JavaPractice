package tw.cclu.designpattern.factory;

public class CarFactory {
	public enum Type { SPORTS, VAN, NULL }
	
	public static Vehicle getInstanceOf(Type type) {
		switch((type == null) ? Type.NULL : type) {
		case SPORTS:
			return new SportsCar(600, 2);
		case VAN:
			return new Van(300, 5);
		default:
			return new NullCar();
		}
	}
}
