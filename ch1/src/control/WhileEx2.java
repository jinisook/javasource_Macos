package control;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        // 숫자를 입력 받아 각 자리의 합 구하기
        // 345 입력 : 3 + 4 + 5 = 12

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = Integer.parseInt(sc.nextLine());

        int sum = 0;
        // num 이 0 아닐 때가지 반복 -> 10으로 나눴을 때 몫이 X
        while (num != 0) {
            sum = sum + num % 10;
            System.out.printf("sum = %3d num = %d\n", sum, num);
            num = num / 10;

        }
        System.out.println("각 자릿 수 합 :" + sum);

    }

}
