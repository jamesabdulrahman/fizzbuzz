import java.util.HashMap;

public class FizzBuzz {

	private static HashMap<Integer, String> fizzes;
	private static HashMap<Integer, String> cache;

	public static String fizzbuzz(int i) {
	/**
	 * Print an integer according to FizzBuzz rules, checking the cache first.
	 * If the integer is not cached, calculate it and cache.
	 *
	 * @param x	integer to be FizzBuzzed
	 *
	 * @return	input formatted according to FizzBuzz rules
	 */
	 // Check the cache first...
	 if (cache.containsKey(i)) {
		 return cache.get(i);
	 }
	 // If no cache hit, calculate as normal and store.
	 StringBuilder output = new StringBuilder();
	 // Divide by each key in the fizzes map, and append the substitution.
	 for (int k : fizzes.keySet()) {
		 if (i % k == 0) {
			 output.append(fizzes.get(k));
		 }
	 }
	 // If the stringbuilder is empty, we know nothing divided evenly.
	 if (output.length() == 0) {
		 output.append(i);
	 }
	 // Store it in the cache and return it.
	 cache.put(i, output.toString());
	 return output.toString();
	}

	public static void count(int start, int end) {
	/**
	 * Print integers between a start and end integer, inclusive,
	 * FizzBuzz style.
	 *
	 * @param start	integer to start counting from
	 * @param end	integer to count up to
	 */
	 for (int i = start; i <= end; i++) {
		 System.out.println(fizzbuzz(i));
	 }
	}

	public FizzBuzz() {
		cache = new HashMap<Integer, String>();
		fizzes = new HashMap<Integer, String>();
		fizzes.put(3, "fizz");
		fizzes.put(5, "buzz");
		fizzes.put(7, "woof");
	}
}
