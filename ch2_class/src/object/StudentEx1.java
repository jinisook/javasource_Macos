package object;

import java.net.Socket;

// main O 형태
public class StudentEx1 {
    public static void main(String[] args) {
        // 객체 생성(new) == 인스턴스 생성
        Student obj = new Student(); // Student 기반으로 만들어진 obj -> 인스턴스

        // 인스턴스 초기화(값 넣는 것)
        obj.name = "홍길동";
        obj.tel = "010-1234-5678";
        obj.address = "서울시 종로구 15";

        // obj.changeName(); // 호출만
        System.out.println(obj);

        // 메서드 호출
        // 1) 결과값 반환 : 변수에 담거나 혹은 print 구문
        // 2) 결과 반환 불가 : 호출만 하기(실행만 되도록)
        System.out.println(obj.getAddress());
        // obj.getAddress();

        // set메서드 - 멤버변수 값 변경
        // get메서드 - 멤버변수 값 가져오기
        Student student = new Student();
        student.setName("성춘향");
        student.setTel("010-5678-8596");
        student.setAddress("경기도 수원시");
        // System.out.println(student);
        System.out.println(student.getName()); // 성춘향

        student.changeName("성천사"); // 바뀐 내용 기재, 괄호 맞춰주기
        System.out.println(student);

    }

}
