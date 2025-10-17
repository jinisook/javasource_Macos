package array;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        String[] strArr = { "kim", "Park", "Yi" };
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr[0].length());

        // char 배열과 String 배열
        // String : char배열과 기능(메서드)

        String[] strArr2 = new String[3];
        strArr2[0] = "Kim";
        strArr2[1] = "Park";
        strArr2[2] = "Yi";

        System.out.println(strArr2[0]);
        System.out.println("strArr2[0].charAt(0)" + strArr2[0].charAt(0));
        // => char은 String의 개별문자

        String src = "ABCDE";
        for (int i = 0; i < src.length(); i++) { // length 뒤에 () 필수 / String -> char
            System.out.println(src.charAt(i));

        }
        char[] chArr2 = src.toCharArray(); // 위에 for문 없이 String을 char 배열로 변환

        // char 배열 => String
        char[] chArr = { 'A', 'B', 'C', 'D' };
        String str2 = new String(chArr);
        System.out.println(str2);

    }

}
