import static org.junit.jupiter.api.Assertions.assertEquals;

import asia.bitbasket.app.FizzBuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

class FizzBuzzTests {

  private FizzBuzz fb = new FizzBuzz();

  @ParameterizedTest
  @ValueSource(ints = {3, 6, 9, 18})
  public void testFizz(int cand) {
    assertEquals("fizz", fb.fizzbuzz(cand));
  }

  @ParameterizedTest
  @ValueSource(ints = {5, 10, 25, 50})
  public void testBuzz(int cand) {
    assertEquals("buzz", fb.fizzbuzz(cand));
  }

  @ParameterizedTest
  @ValueSource(ints = {15, 30, 60, 45})
  public void testFizzBuzz(int cand) {
    assertEquals("fizzbuzz", fb.fizzbuzz(cand));
  }

  @ParameterizedTest
  @ValueSource(ints = {7, 14, 28})
  public void testWoof(int cand) {
    assertEquals("woof", fb.fizzbuzz(cand));
  }

  @ParameterizedTest
  @ValueSource(ints = {21, 42})
  public void testFizzWoof(int cand) {
    assertEquals("fizzwoof", fb.fizzbuzz(cand));
  }

  @ParameterizedTest
  @ValueSource(ints = {35, 70})
  public void testBuzzWoof(int cand) {
    assertEquals("buzzwoof", fb.fizzbuzz(cand));
  }

  @Test
  public void testZero() {
    assertEquals("fizzbuzzwoof", fb.fizzbuzz(0));
  }
}
