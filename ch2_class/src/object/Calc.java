package object;

public class Calc {
    // 메소드 만

    int plus(int x, int y) { // (2)
        return x + y;
    }

    double avg(int x, int y) {
        // x,y 값을 이용해 평균
        // x + y / 2
        int result = plus(x, y); // (3)
        return result / 2; // (4)
    }

    void excute() {
        double result = avg(15, 8); // 내부 호출 (1)
        println("실행결과 : " + result); // 내부 호출 (5)
    }

    void println(String message) {
        System.out.println(message); // (6)
    }
}
