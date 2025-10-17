package control;

import java.util.Scanner;

public class ExamEx4 {
    public static void main(String[] args) {
        // 사칙연산(+ - * /) 계산기
        // 사용자로부터 2개의 숫자와 연산자를 입력받기
        // ex. 15, 25 +
        // 화면 출력 : 15 + 25 =40

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력 : ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.print("두번째 숫자 입력 : ");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.print("연산자 입력 : ");
        String op = sc.nextLine();

        // System.out.print(num1 + op + num2 + " = ");

        // switch (op) {
        // case "+":
        // System.out.println(num1 + num2);
        // break;
        // case "-":
        // System.out.println(num1 - num2);
        // break;
        // case "*":
        // System.out.println(num1 * num2);
        // break;
        // case "/":
        // System.out.println(num1 / num2);
        // break;

        // }

        // 정답
        // op == "+" or op == "-" or op == "*" or op == "/"
        // if (op.equals("+"))

        int result = 0;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                break;
        }
        System.out.printf("%d %s %d = %d", num1, op, num2, result);

    }

}
