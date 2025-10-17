package object;

public class SubscriberInfoEx {
    public static void main(String[] args) {
        SubscriberInfo info = new SubscriberInfo();
        // 속성 변경(초기화)
        // 1) 직접 접근 : private 사용하면 불가
        // info.name = "홍길동";
        // 2) 생성자
        // 3) 메서드 : set~~

        info.setId("tnwls");
        info.setName("수진");
        info.changePassword("abcdef12345");
        info.changePhone("010-1234-5678");

        // 가입자 정보 조회
        // 1) 간단 조회 : toString => 개발자 확인용
        System.out.println(info); // => System.out.println(info.toString);

        // 2. 개별 조회 : get~~~()
        System.out.println("이름 : " + info.getName());
        System.out.println("아이디 : " + info.getId());
        System.out.println("비밀번호 : " + info.getPassword());
        System.out.println("전화번호 : " + info.getPhone());

    }

}
