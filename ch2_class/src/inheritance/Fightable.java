package inheritance;

// 일반적인 클래스는 하나만 상속 가능(단일 상속)
// 인터페이스가 인터페이스 상속 가능(여러 개 가능)
// 인터페이스도 부모로 사용
public interface Fightable extends Movable, Attackable {

}
