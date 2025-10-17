package object;

public class Card {
    // 변수
    // 1. 인스턴스(속성, 멤버, 필드) 변수 : 클래스 영역(내부)에 선언한 것 ( ex) private String kind;)
    // -> 인스턴스 생성 후 사용 가능
    // 2. 클래스 변수 : 클래스 영역(static)
    // -> 클래스가 메모리에 올라갈 때 / static이 붙은 클래스 변수는 클래스이름.클래스변수
    // static => 공유의 의미
    // 3. 지역 변수 : 메서드 영역, 생성자 매개변수, 생성자 내부에 선언한 것
    // -> 변수가 실행될 때

    // private String kind; // 인스턴스 변수
    // static String cv; // 클래스 변수

    // void print(int i) { // 지역변수
    // int j = 0; // 지역변수
    // }

    String kind;
    int number;
    // 카드 52장의 크기는 같으니 값을 공유(Static)하여 공간 줄임
    static int width = 100;
    static int height = 150;
}
