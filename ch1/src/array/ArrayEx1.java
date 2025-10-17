package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 배열(array)
        // 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
        // 타입 배열명 [] = new 타입[10]; 배열 선언과 생성
        // 타입[] 배열명 = new 타입[10]; 배열 선언과 생성 _ 모든 타입 가능
        // 나눠서 코드 작성
        // int [] arr; - 배열 선언
        // arr = new int [3]; - 배열 생성

        // 시험 점수 저장
        // 10명 -> 숫자가 커질수록 힘듦
        // int score1 = 0, score2 = 0, score3 = 0...;
        // int sum = score1 + score2 + score3...;
        // double avg = (double)sum / 10;

        int[] arr1 = new int[10]; // 연속적인 공간을 사용
        System.out.println(arr1[3]);

        double[] arr2 = new double[5];
        System.out.println(arr2[0]);

        boolean[] arr3 = new boolean[3];
        System.out.println(arr3[1]);

        char[] arr4 = new char[3];
        System.out.println(arr4[0] + "arr4");

        // 초기화
        // arr1[0] = 88, arr[1] = 90, arr1[2] = 87;

        // 배열 선언, 생성, 초기화
        int score[] = { 88, 90, 87, 77, 78, 79, 75, 72, 66 };
        // 평균 구하기_int sum = score[0] + score[1]+...+score[9];
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + sum / score.length);

    }

}
