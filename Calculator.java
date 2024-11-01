import java.util.ArrayList;
import java.util.List;


public class Calculator {
   private List<Double> results = new ArrayList<>();

    public double remove() {
        double x = results.remove(0);
        return x;
    }

    //계산을 수행하는 매서드
    public double calculate(int number1, int number2, char operator) {
        if (operator == '+') {
            results.add((double) (number1 + number2));
            return number1 + number2;
        } else if (operator == '-') {
            results.add((double) (number1 - number2));
            return number1 - number2;
        } else if (operator == '*') {
            results.add((double) (number1 * number2));
            return number1 * number2;
        } else if (operator == '/') {
            if (number2 == 0) {
                System.out.println("0으로는 나눌수 없습니다"); //나누기 예외처리
            } else {
                results.add((double) (number1 / number2));
                return (double) number1 / number2;
            }
        } else {
            System.out.println("잘못된 기호를 입력했습니다"); //연산오류처리
        }
        return 0.0;
    }

    public List<Double> getResult() {
        return results;
    }

    public void setResult(Double result) {
        this.results.add(result);
    }
}


