package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 10개의 정수를 담는 배열 선언
        // 0~9의 숫자로 초기화

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;

        }
        System.out.println(Arrays.toString(arr));

        // int x = 10, y = 5;
        // // x => y, y => x 값 교환 => 서로 교환X, 값을 옮겨서 교환
        // int temp = x;
        // x = y;
        // y = temp;

        int n = 0;
        for (int i = 0; i < 100; i++) {
            // 0~9 사이의 임의의 수 추출
            n = (int) (Math.random() * 10);
            int temp = arr[0];
            arr[0] = arr[n];
            arr[n] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }

}
