package tw.cclu.designpattern;

public class Singleton {
	private static volatile Singleton instance;
	private static class LazyHolder {
		private static final Singleton instance = new Singleton();
	}
	
	private Singleton() {}
	
	// double check locking
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized(Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	// lazy initialization holder
	public static Singleton getInstanceFromHolder() {
		return LazyHolder.instance;
	}
}
