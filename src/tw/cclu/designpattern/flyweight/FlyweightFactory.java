package tw.cclu.designpattern.flyweight;

import java.util.EnumMap;

import tw.cclu.designpattern.factory.CarFactory;
import tw.cclu.designpattern.factory.NullCar;
import tw.cclu.designpattern.factory.SportsCar;
import tw.cclu.designpattern.factory.Van;
import tw.cclu.designpattern.factory.Vehicle;

public class FlyweightFactory extends CarFactory {
	private static final EnumMap<Type, Vehicle> carMap = new EnumMap<>(Type.class);
	
	public static Vehicle getInstanceOf(Type type) {
		type = (type == null) ? Type.NULL : type;
		Vehicle v = carMap.get(type);
		if (v == null) {
			synchronized(FlyweightFactory.class) {
				v = carMap.get(type);
				if (v == null) {
					switch(type) {
					case SPORTS:
						v = new SportsCar(600, 2);
						break;
					case VAN:
						v = new Van(300, 5);
						break;
					default:
						v = new NullCar();
					}
					carMap.put(type, v);
				}
			}
		}
		return v;
	}

}
