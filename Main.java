import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        char operator = sc.nextInt().charAt(0);

        if (operator == '+') {
            number1 + number2
        } else if (operator == '-') {
            number1 - number2
        } else if (operator == '*') {
            number1 * number2
        } else if (operator == '/') {
            number1 / number2

        }
    }
}
