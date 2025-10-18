package util;

import java.util.Arrays;

// java.util.Arrays : 배열을 조작하기 쉽게 다양항 메소드 제공
// public static <T> T[] copyOf(T[] original, int newLength)
// T, K, V, E : 객체 의미 -> 참조타입
public class ArraysEx1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };

        int[] newArr = new int[7];
        // 배열복사하고 싶을 때,
        // for i 문 사용,
        // for (int i = 0; i < newArr.length; i++) {
        // newArr[i] = arr[i];
        // }

        // System.arraycopy(arr, 0, newArr, 0, 0);

        int[] copyArr = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(copyArr));

        int[] copyArr2 = Arrays.copyOfRange(arr, 1, 3); // 1번째자리부터 3번째자리 copy (3번째자리는 포함X)
        System.out.println(Arrays.toString(copyArr2));
    }
}
