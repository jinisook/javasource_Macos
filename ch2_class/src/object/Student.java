package object;

// main X 형태
public class Student {
    // 멤버변수, 멤버메소드, 생성자

    // 멤버변수
    // 이름(홍길동), 전화번호(010-1234-5678), 주소(서울시 종로구 25)

    // 멤버 변수 선언
    String name;
    String tel;
    String address;

    // 생성자(constructor)
    public Student() {
    }

    // 메서드
    // get메서드
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    // 결관 반환 X 메서드 작성 시 'void'
    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    // 이름 변경 메소드 생성
    // 리턴 타입, 메소드명(매개변수1, 매개변수2,....여러 개 가능){}
    // void + 기본타입, 참조타입-String,[](배열)

    // void changeName(String name) {
    // this.name = name;

    // }

    String changeName(String name) {
        this.name = name;

        return this.name;

    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", tel=" + tel + ", address=" + address + "]";
    }

}