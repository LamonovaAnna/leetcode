package _0_999._400_499;

import java.util.ArrayList;
import java.util.List;

//412. Fizz Buzz
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> num = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                num.add("FizzBuzz");
            } else if (i % 3 == 0) {
                num.add("Fizz");
            } else if (i % 5 == 0) {
                num.add("Buzz");
            } else {
                num.add(String.valueOf(i));
            }
        }
        return num;
    }

    public void solution() {
        System.out.println(fizzBuzz(3));
        System.out.println(fizzBuzz(5));
        System.out.println(fizzBuzz(15));
    }
}
