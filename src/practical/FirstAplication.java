package practical;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/**
 * Created by prots on 03.05.2017.
 */
public class FirstAplication {
    public static void main(String[] args) {
        int a = 3, b = 4;
        System.out.println("Sum " + (a + b));
        System.out.println("Subtraction " + (a - b));
        System.out.println("Product " + (a * b));
        System.out.println("Division " + ((double) a / (double) b));

        String question = "How are you?", answer, answer2 = "You are ";
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        answer = scanner.nextLine();
        System.out.println(answer2 + answer);
    }
}
