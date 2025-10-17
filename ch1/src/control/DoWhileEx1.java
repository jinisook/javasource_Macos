package control;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {

        // while 변형구조
        // int i = 10;
        // do {
        // System.out.println(i);
        // } while (i < 10);

        // 1 ~ 100 사이의 정수를 입력받기
        // 컴퓨터 임의의 수 : 1 ~ 100 사이의 정수
        // 컴퓨터가 생성한 임의의 수 맞추기

        Scanner sc = new Scanner(System.in);
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;

        do {
            System.out.println("1~100 사이 정수 입력 : ");
            // 사용자 입력
            input = Integer.parseInt(sc.nextLine());

            // 사용자 입력과 컴퓨터가 생성한 임의의 수 비교
            // 더 작은 수로 시도해 보세요 or 더 큰 수로 시도해 보세요

            if (input < answer) {
                System.out.println("더 큰 수로 시도해 보세요");

            } else if (input > answer) {
                System.out.println("더 작은 수로 시도해 보세요");

            }

        } while (answer != input);

        System.out.println("정답입니다");

    }

}
