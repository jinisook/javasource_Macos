package array;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        // 배열 복사
        int[] tmp = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];

        }
        System.out.println(Arrays.toString(tmp));

        // System.arraycopy()
        int[] tmp2 = new int[arr.length * 2];
        System.arraycopy(arr, 0, tmp2, 0, arr.length);
        System.out.println(Arrays.toString(tmp2));

        // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5 = 범위 벗어났다
        // for (int i = 0; i < tmp.length; i++) {
        // System.out.println(arr[i]);

        // }

        char[] abc = { 'A', 'B', 'C', 'D' };
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        // 베열 abc와 num을 하나의 배열로 만들기
        // char[] result

        char[] result = new char[abc.length + num.length];

        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length); // 4번째부터 들어가니까 destPos : abc.length
        System.out.println(result);

    }

}
