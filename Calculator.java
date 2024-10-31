public class Calculator {

   private final List<Double> result = new ArrayList<>();

    public double calculate(int number1, int number2, char operator) {
        if (operator == '+') {
            return number1 + number2;
        } else if (operator == '-') {
            return number1 - number2;
        } else if (operator == '*') {
            return number1 * number2;
        } else if (operator == '/') {
            if (number2 == 0) {
                System.out.println("0으로는 나눌수 없습니다"); //나누기 예외처리
            } else {
                return (double) number1 / number2;
            }
        } else {
            System.out.println("잘못된 기호를 입력했습니다"); //연산오류처리
        }
        return 0.0;
    }
}
    public List<Double>


