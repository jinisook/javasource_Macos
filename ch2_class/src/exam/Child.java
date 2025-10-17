package exam;

public class Child extends Parent {
    // num1 변수값 변경
    public void print() {
        super.setNum1(10);
        // num1 조회
        System.out.println(getNum1());
        System.out.println(super.name);
        System.out.println(super.grade);

    }
}
