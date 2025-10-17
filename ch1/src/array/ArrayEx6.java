package array;

import java.util.Arrays;

public class ArrayEx6 {
    public static void main(String[] args) {

        // 45개의 정수값을 저장하기 위한 배열 생성
        int[] arr = new int[45];
        // 각 요소에 1~45 값 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

        }
        System.out.println(Arrays.toString(arr));

        // 배열의 0번째에서 5번째 요소까지
        // 모두 6개만 교환
        int n = 0;
        for (int i = 0; i < 6; i++) {
            // 교환위치 : 0~44 무작위 수
            n = (int) (Math.random() * 45);
            // i, 교환위치
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;

        }
        for (int i = 0; i < 6; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }

    }

}
