package operator;

public class OperatorEx5 {
    public static void main(String[] args) {
        // 삼항연산자
        // 조건 ? 참일 때 : 거짓일 때
        // a > 10 ? "크다" : "작다"

        int x = 10, y = -5, z = 0;

        int result1 = x >= 0 ? x : -x;
        int result2 = y >= 0 ? y : -y;
        int result3 = z >= 0 ? z : -z;

        // 0 : 기호 없음, > 0 : +, < 0 : -
        char sign1, sign2, sign3;
        sign1 = x > 0 ? '+' : (x == 0 ? ' ' : '-');
        sign2 = y > 0 ? '+' : (y == 0 ? ' ' : '-');
        sign3 = z > 0 ? '+' : (z == 0 ? ' ' : '-');

        System.out.printf("x = %c%d\n", sign1, result1); // %c -> +,- 기호를 위해 / %d -> 숫자
        System.out.printf("y = %c%d\n", sign2, result2);
        System.out.printf("z = %c%d\n", sign3, result3);

    }

}
