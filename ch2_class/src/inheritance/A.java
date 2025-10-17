package inheritance;

// 인터페이스(I) 사용 시 서로(A, B) 관계가 없는 클래스들에게 관계를 맺어줌
public class A {
    public void methodA(I i) {
        i.methodB();
    }
}
