package basic;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" 첫번째 숫자입력 : ");
        int num1 = sc.nextInt(); // ?? 엔터
        System.out.print(" 연산자 입력 : "); // +,-,*,/
        String op = sc.nextLine();
        System.out.print(" 두번째 숫자입력 : ");
        int num2 = sc.nextInt();
        System.out.println(op);
        System.out.println(num1 + num2);
        sc.close();

    }

}
