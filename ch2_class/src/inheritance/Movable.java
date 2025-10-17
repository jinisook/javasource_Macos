package inheritance;

// 멤버변수에 final 을 붙이면 변수가 아닌 상수 개념 => 반드시 초기화 필요

public interface Movable {
    // 상수 선언만 가능 (변수 선언 안됨)
    // final 이 없어도 상수로 인식
    int pos = 0;

    // abstract 이 없어도 추상 메서드로 자동 인식
    void move(int x, int y);

    // 일반 메서드를 생성하고 싶으면, static / default 를 앞에 사용
    static void print() {
    }

    default void print2() {
    }

}
