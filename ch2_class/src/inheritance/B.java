package inheritance;

// 인터페이스 implements
public class B implements I {
    // 추상 메서드 -> 오버라이딩
    @Override
    public void methodB() {
        System.out.println("methodB()");
    }
}
