package control;

public class ForEx3 {
    public static void main(String[] args) {
        // *문자 10개를 5번 찍기

        // (1)
        for (int i = 0; i < 5; i++) {
            System.out.println("**********");
        }

        // (2) 중첩 for, 행과 열 개념
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // (3) 열이 하나씩 증가
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        // 구구단
        // 2 * 1 = 2
        // ...
        // 3 * 1 = 3
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();

        }

    }

}
