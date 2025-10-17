package basic;

public class Variable4 {
    public static void main(String[] args) {
        // 논리형 : true, false 표현
        boolean flag = true;
        System.out.println(flag ? "참" : "거짓");

        // 문자형
        char ch = 'a', ch2 = '가';
        // String ch3 = "ab";
        // 문자열 : ""
        System.out.println("ch = " + ch + ", ch2 = " + ch2);
        System.out.printf("ch = %c, ch2 = %c", ch, ch2);
        System.out.printf("ch = %10c, ch2 = %5c\n", ch, ch2);
        System.out.println("ch = " + (ch + 1));
        System.out.println("ch2 = " + (ch2 + 1));
        System.out.printf("ch2 = %c\n", (ch2 + 1));
        System.out.printf("ch2 = %d\n", (ch2 + 1));

    }

}
