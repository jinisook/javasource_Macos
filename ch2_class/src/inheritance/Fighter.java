package inheritance;

// 인터페이스를 부모로 쓸 때 extends가 아닌 'implements' 사용
public class Fighter implements Fightable {

    @Override
    public void move(int x, int y) {
        System.out.println("move");
    }

    @Override
    public void attack(Unit unit) {
        System.out.println("attack");
    }

}
