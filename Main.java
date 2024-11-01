import java.util.List;
import java.util.Scanner;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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

            System.out.println("결과값을 출력");

            double result = calculator.calculate(number1, number2, operator);
            System.out.println(result);

            System.out.println("종료를 원하면 exit / 더 계산하시겠습니까");
            sc.nextLine();
            exit = sc.nextLine();
        }

        System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까");

        List<Double> result = calculator.getResult();
        for (int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
        calculator.remove();

    }























