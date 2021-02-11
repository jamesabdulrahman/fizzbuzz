import java.util.HashMap;

public class FizzBuzz {

	private static HashMap<Integer, String> fizzes;

	public static void count(int start, int end) {
	/*
	 * Print integers between a start and end integer, inclusive,
	 * FizzBuzz style.
	 *
	 * @param start	integer to start counting from
	 * @param end	integer to count up to
	 */

	 for (int i = start; i <= end; i++) {
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
		 System.out.println(output);
	 }
	}

	public static void main(String[] args) {
		fizzes = new HashMap<Integer, String>();
		fizzes.put(3, "fizz");
		fizzes.put(5, "buzz");
		fizzes.put(7, "woof");
		FizzBuzz.count(1, 100);
	}
}
