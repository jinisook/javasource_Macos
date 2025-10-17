package operator;

import java.util.Scanner;

public class OperatorEx7 {
    public static void main(String[] args) {
        // 키보드에서 숫자를 하나 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int input = Integer.parseInt(sc.nextLine());

        // 입력 받은 숫자가 양수, 음수인지 출력하기
        System.out.println(input > 0 ? "양수" : "음수");

    }

}
