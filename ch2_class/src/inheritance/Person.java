package inheritance;

public /* final */ class Person {
    // final : 마지막의, 변경될 수 없는,
    // class : 상속불가
    // method : 오버라이딩 금지
    //
    static final int Max = 15; // 상수의 경우 변수명 대문자
    String name;

    public Person(String name) {
        this.name = name;
    }

    final void test() {

    }

}
