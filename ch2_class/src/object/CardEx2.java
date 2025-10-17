package object;

public class CardEx2 {
    public static void main(String[] args) {
        // 기본형 배열
        int[] arr = new int[5]; // 0으로 초기화
        arr[0] = 17;
        // 값을 알아 직접 쓸 때
        int[] arr2 = { 17, 18, 19 };

        // 참조형 배열
        String[] arr3 = new String[2];
        System.out.println("String 배열 초기화 " + arr3[0]);
        Card[] cards = new Card[3];
        System.out.println(cards[0]); // null : 참조형에 특정 값 지정하지 않은 경우
        cards[0] = new Card();
        cards[0].kind = "heart";
        cards[0].number = 8;

        cards[1] = new Card();
        cards[1].kind = "spade";
        cards[1].number = 7;

        cards[2] = new Card();
        cards[2].kind = "heart";
        cards[2].number = 2;

        // for each - 차례대로 접근할 때만
        for (Card card : cards) {
            System.out.println("번호 : " + card.number);
            System.out.println("종류 : " + card.kind);
        }
        // for i - 원하는 요소 지정 가능
        for (int i = 0; i < cards.length; i++) {
            System.out.println("번호 : " + cards[i].number);
            System.out.println("종류 : " + cards[i].kind);
        }

    }

}
