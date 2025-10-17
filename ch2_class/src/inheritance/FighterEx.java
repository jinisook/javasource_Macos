package inheritance;

public class FighterEx {
    public static void main(String[] args) {
        // 추상 클래스, 인터페이스는 인스턴스 생성 불가
        Fightable fightable = new Fighter(); // 부모 = new 자식
        Fighter fighter = new Fighter(); // 자식 = new 자식

    }

}
