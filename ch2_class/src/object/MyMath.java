package object;

// 이름은 동일해도 되지만, 괄호 안은 다르게
public class MyMath {

    // 메소드 오버로딩
    // 이름이 같아야 한다
    // 매개 변수의 개수 또는 타입이 달라야 한다.

    // 타입명 변화
    // long add(int a, int b) {
    // return a + b;
    // }
    // int add(int a, int b) {
    // return a + b;
    // }
    // 개수 추가
    // long add(long a, long b, int c) {
    // return a + b;
    // }

    long add(long a, long b) {
        return a + b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiplay(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}
