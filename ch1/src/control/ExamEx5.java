package control;

public class ExamEx5 {
    public static void main(String[] args) {
        // 주사위 2개를 던져서 나오는 눈의 합이 5가 아니면 주사위를 계속 던지고
        // 눈의 합이 5이면 주사위 실행 멈추기

        // while (true) {
        // // 눈의 숫자 표시 (1,3)
        // int dice1 = (int) (Math.random() * 6) + 1;
        // int dice2 = (int) (Math.random() * 6) + 1;
        // int sum = dice1 + dice2;

        // if (sum == 5) {
        // break;

        // } else if (sum != 5) {
        // System.out.printf("(%d,%d)\t", dice1, dice2);
        // continue;

        // }

        // }

        while (true) {
            // 눈의 숫자 표시 (1,3)
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            int sum = dice1 + dice2;
            System.out.printf("(%d,%d)\t", dice1, dice2);

            if (sum == 5)
                break;

        }
    }
}
