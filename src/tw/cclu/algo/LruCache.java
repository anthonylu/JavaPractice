package tw.cclu.algo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache<K, V> extends LinkedHashMap<K, V> {
	private static final long serialVersionUID = 7753954318862437058L;
	private final int maxCapacity;
	
	public LruCache(int capacity) {
		super(capacity*4/3, 0.75f, true);
		maxCapacity = capacity;
	}
	
	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
		return size() > maxCapacity;
	}

}
