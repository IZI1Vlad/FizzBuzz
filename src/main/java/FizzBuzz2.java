import java.io.IOException;
import java.util.stream.IntStream;

public class FizzBuzz2 {
    final static int value = 1;
    public static void main(String[] args) {

        IntStream.rangeClosed(1, 100)
                .peek(possibleMultipleOfThree -> {
                    if (possibleMultipleOfThree % 3 == 0) {
                        System.out.print("Fizz");
                    }
                })
                .peek(possibleMultipleOfFive -> {
                    if (possibleMultipleOfFive % 5 == 0) {
                        System.out.print("Buzz");
                    }
                })
                .peek(possibleMultipleOfNeither -> {
                    if (possibleMultipleOfNeither % 3 != 0 && possibleMultipleOfNeither % 5 != 0) {
                        System.out.print(value);
                    }
                })
                .forEach(intValue -> System.out.println());
    }
}