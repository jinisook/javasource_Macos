package lang;

import java.util.Scanner;
// java.lang 패키지는 자동 import

public class ObjectEx {
    public static void main(String[] args) {
        // String str = new String();
        // String str1 = new String();
        // 간략하게 사용
        // String str1 = "Hello";

        Scanner sc = new Scanner(System.in);

        // 모든 클래스의 부모 : Object <- 무조건
        // 1. equals
        Object object1 = new Object();
        Object object2 = new Object();

        if (object1.equals(object2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }
        System.out.println(object1 == object2 ? "두 객체는 같다" : "두 객체는 다르다");
        System.out.println("object1 " + object1);
        // java.lang.Object@5ca881b5
        // 패키지명.클래스명@16진수숫자

        String str1 = "Hello", str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1.equals(str2) ? "str1 == str2" : "str1 != str2");
        System.out.println(str1.equals(str3) ? "str1 == str3" : "str1 != str3"); // equals -> 오버라이딩으로 값비교

        System.out.println(str1 == str2 ? "str1 == str2" : "str1 != str2");
        System.out.println(str1 == str3 ? "str1 == str3" : "str1 != str3");

        System.out.println(str3);

        Value value1 = new Value(10);
        Value value2 = new Value(10);
        System.out.println(value1.equals(value2));
        // 이 코드 실행 Object obj = value2;

        System.out.println(value1);

    }

}
