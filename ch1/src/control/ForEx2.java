package control;

public class ForEx2 {
    public static void main(String[] args) {
        // 1~10 숫자 중에서 짝수 출력
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // 밑에 출력 엔터용
        for (int i = 2; i < 11; i += 2) {
            System.out.print(i + " ");

        }

        System.out.println();
        for (int i = 1; i < 11; i += 2) {
            System.out.print(i + " ");

        }

        System.out.println();
        // 구구단 출력
        // 3단
        for (int i = 1; i < 10; i++) {
            System.out.printf("3 * %2d = %2d\n", i, (3 * i));

        }

    }

}
