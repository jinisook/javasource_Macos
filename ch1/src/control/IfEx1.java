package control;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {
        int x = 0;

        // x가 0과 동일하면 x == 0 출력

        if (x == 0) {
            System.out.println("x == 0");

            // x가 0과 동일하지 않으면 x != 0 출력
            if (x != 0) {
                System.out.println("x != 0");

            }

            // 사용자로부터 점수를 입력 받아 60 이상이면 합격입니다 메세지 출력
            Scanner sc = new Scanner(System.in);
            int jumsu = Integer.parseInt(sc.nextLine());

            if (jumsu >= 60) {
                System.out.println("합격입니다");

            } else {
                System.out.println("불합격입니다");
            }

            System.out.println(jumsu >= 60 ? "합격입니다" : "불합격입니다"); // 삼항연산자

        }

    }

}
