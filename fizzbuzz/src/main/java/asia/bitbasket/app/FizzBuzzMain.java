package asia.bitbasket.app;

import java.util.Random;

public class FizzBuzzMain {

  public static void main(String[] args) {
    FizzBuzz fb = new FizzBuzz();
    Random random = new Random();
    int fizzbuzzwoofs = 0;
    for (int i = 0; i <= 1000; i++) {
      int rn = random.nextInt();
      if (fb.fizzbuzz(rn).equals("fizzbuzzwoof")) {
        fizzbuzzwoofs++;
      }
    }
    System.out.println(fizzbuzzwoofs);
  }
}
