public class FizzBuzz {

	public static void count(int start, int end) {
	/*
	 * Print integers between a start and end integer, inclusive,
	 * FizzBuzz style.
	 *
	 * @param start	integer to start counting from
	 * @param end	integer to count up to
	 */

	 for (int i = start; i <= end; i++) {
		 boolean fizz = i % 3 == 0;
		 boolean buzz = i % 5 == 0;

		 if (fizz && buzz) {
			 System.out.println("fizzbuzz");
		 }
		 else if (fizz) {
			 System.out.println("fizz");
		 }
		 else if (buzz) {
			 System.out.println("buzz");
		 }
		 else {
			 System.out.println(i);
		 }
	 }
	}

	public static void main(String[] args) {
		FizzBuzz.count(1, 100);
	}
}
