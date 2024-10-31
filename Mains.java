import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int number1;
        int number2;
        char operator;

        String exit = "";
        while (!exit.equals("exit")){

            System.out.println("첫번째 숫자를 입력하세요");
            number1 = sc.nextInt();
            System.out.println("두번째 숫자를 입력하세요");
            number2 = sc.nextInt();

            //사칙연산 기호
            System.out.println("사칙연산 기호를 입력하세요");
            operator = sc.next().charAt(0);

            double result = calculator.calculate(number1: 1, number2: 2, operator: );




            System.out.println("종료를 원하면 exit / 더 계산하시겠습니까");
            sc.nextLine();
            exit = sc.nextLine();
        }
            calculator.deleteList();

    }       List<Double> result = new calculator.result;
            for (Double result : resultList) {
                System.out.println(result);

                System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제)");



        }

    }


    }
}

    //양의정수 2개받기
    public void lv1() {
        Scanner sc = new Scanner(System.in);
        String exit = "";
        //exit 문자열을 입력하기전
        int number1;
        int number2;
        char operator;
        double result = 0.0;
        //반복문을  통해 반복되게 만드는 과정
        while (!exit.equals("exit")) {
            System.out.println("첫번째 숫자를 입력하세요");
            number1 = sc.nextInt();
            System.out.println("두번째 숫자를 입력하세요");
            number2 = sc.nextInt();

            //사칙연산 기호
            System.out.println("사칙연산 기호를 입력하세요");
            operator = sc.next().charAt(0);

            //조건문을 통해서 기호에 따른 사칙연산으로 구분
            if (operator == '+') {
                result = number1 + number2;
            } else if (operator == '-') {
                result = number1 - number2;
            } else if (operator == '*') {
                result = number1 * number2;
            } else if (operator == '/') {
                if (number2 == 0) {
                    System.out.println("0으로는 나눌수 없습니다"); //나누기 예외처리
                } else {
                    result = (double) number1 / number2;
                }
            } else {
                System.out.println("잘못된 기호를 입력했습니다"); //연산오류처리
            }
            System.out.println(result);
            System.out.println("종료를 원하면 exit / 더 계산하시겠습니까");
            sc.nextLine();
            exit = sc.nextLine();
        }
    }

public void main() {
}



























