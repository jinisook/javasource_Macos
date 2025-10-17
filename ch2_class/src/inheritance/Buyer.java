package inheritance;
// 구매자 입장

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    // 물건을 구매하다 메소드
    void buy(Product p) { // 부모타입 사용 가능 -> Product p = new 자식
        if (money < p.price) {
            System.out.println("잔액부족");
            return;
        }
        money = money - p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "를 구매하셨습니다."); // p -> toString 호출, 오버라이딩 생성으로 자식 값 도출

    }
}
