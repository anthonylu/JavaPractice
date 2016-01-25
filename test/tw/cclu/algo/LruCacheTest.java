package tw.cclu.algo;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class LruCacheTest {

	@Test
	public void test() {
		LruCache<Integer, String> cache = new LruCache<>(4);
		String[] expected = {"four", "two", "one", "five"};
		cache.put(1, "one");
		cache.put(2, "two");
		cache.put(3, "three");
		cache.put(4, "four");
		assertTrue(cache.get(2).equals("two"));
		assertTrue(cache.get(1).equals("one"));
		cache.put(5, "five");
		assertNull(cache.get(3));
		int i = 0;
		for (Map.Entry<Integer, String> entry : cache.entrySet()) {
			assertTrue(entry.getValue().equals(expected[i++]));
		}
	}

}
