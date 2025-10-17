package operator;

public class OperatorEx4 {
    public static void main(String[] args) {
        // 논리연산자 : &&(and) ||(or) !(not)

        // x는 10보다 크고, 20보다 작다
        // x > 10 && x < 20

        // i는 2의 배수 또는 3의 배수지만, 6의 배수는 아니다
        // (i % 2 == 0 || i % 3 == 0) && i % 6 !=0

        // 문자 ch는 대문자 또는 소문자이다
        // 'a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z'

        int x = 15;
        System.out.println(x > 10 && x < 20);

        int i = 6;
        System.out.println((i % 2 == 0 || i % 3 == 0) && i % 6 != 0);

        char ch = 'A';
        System.out.println('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z');

        boolean result = 'a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z'; // 변수로 담아낼 때
        System.out.println(!result);

    }

}
