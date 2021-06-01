import java.io.IOException;

public class Numbers {

    public static void main(String args[]) throws IOException {
        int i = 1;
        while (i++ <= 100) {
            if (i % 15 == 0)
                System.out.print("FizzBuzz");
            else if (i % 3 == 0)
                System.out.print("Buzz");
            else if (i % 5 == 0)
                System.out.print("Fizz");
            else
                System.out.print(i);
            System.out.flush();
        }
    }
}
