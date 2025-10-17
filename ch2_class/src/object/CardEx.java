package object;

public class CardEx {
    public static void main(String[] args) {
        // kind 인스턴스 변수 사용
        // 인스턴스 생성 후 사용 가능
        // Card card = new Card();

        // 클래스 변수 : 클래스이름.클래스변수
        // Card.cv = "";

        Card card1 = new Card();
        card1.kind = "spade";
        card1.number = 2;
        // System.out.printf("card1 %d, %s, %d, %d\n", card1.number, card1.kind,
        // Card.width, Card.height);
        System.out.println("번호 : " + card1.number);
        System.out.println("종류 : " + card1.kind);

        Card card2 = new Card();
        card2.kind = "spade";
        card2.number = 3;
        // System.out.printf("card2 %d, %s, %d, %d\n", card2.number, card2.kind,
        // Card.width, Card.height);
        // System.out.println("번호 : " + card2.number);
        // System.out.println("종류 : " + card2.kind);
        info(card2);

        // 카드 크기가 바뀔 때
        Card.width = 80;
        Card.height = 60;

    }

    // 메소드 생성 -> 중복된(반복된) 코드를 제거
    static void info(Card card) { // static 없이 사용 하고 싶을 때 -> 앞에 CardEx obj = new CardEx(); + obj.info 생성
        System.out.println("번호 : " + card.number);
        System.out.println("종류 : " + card.kind);
        System.out.println("가로 : " + Card.width);
        System.out.println("세로 : " + Card.height);
    }

}
