package array;

public class ArrayEx8 {
    public static void main(String[] args) {
        // 2차원 배열
        // int[][] score = new int[3][4]; // 3행 4열 -> 0이 전부 들어가 있는 상태(초기화)
        // score[0][0] = 78; // 0행 0열
        // score[1][1] = 68;

        // int[][] arr = {
        // { 1, 2, 3 },
        // { 4, 5, 6 }

        // };

        // System.out.println(score.length); // 행의 길이 - 3
        // System.out.println(score[0].length); // 열의 길이 - 4

        // for (int i = 0; i < score.length; i++) {
        // for (int j = 0; j < score[i].length; j++) {
        // System.out.print(score[i][j] + "\t");

        // }
        // System.out.println();
        // }
        // // 가변 배열
        // int[][] arr2 = new int[3][]; // 3행 고정, 열 다르게 설정 가능
        // arr2[0] = new int[2];
        // arr2[1] = new int[3];
        // arr2[2] = new int[2];

        int[][] jumsu = {
                { 100, 100, 100 },
                { 20, 50, 40 },
                { 30, 60, 50 },
                { 80, 70, 60 },
                { 60, 80, 70 },

        };

        int korTotal = 0, engTotal = 0, mathTotal = 0;
        System.out.println("번호   국어   영어   수학   총점   평균");
        System.out.println("=======================================");
        for (int i = 0; i < jumsu.length; i++) {
            // 개인별 총점
            int sum = 0;
            float avg = 0.0f;
            korTotal += jumsu[i][0];
            engTotal += jumsu[i][1];
            mathTotal += jumsu[i][2];

            System.out.printf("%3d", i + 1);
            for (int j = 0; j < jumsu[i].length; j++) {
                sum += jumsu[i][j];
                System.out.printf("%5d", jumsu[i][j]);
            }
            avg = sum / (float) jumsu[i].length;

            System.out.printf("%5d  %5.1f", sum, avg);

            System.out.println();
        }

        System.out.println("=======================================");
        System.out.printf("총점 : %3d %3d %3d", korTotal, engTotal, mathTotal);
    }

}
