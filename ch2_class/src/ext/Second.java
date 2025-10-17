package ext;

// import 구문 -> 다른 패키지 내 클래스 사용 중 명시
import exam.Parent;

public class Second extends Parent {
    Parent parent = new Parent();

    public void info() {
        // default 로 선언된 경우 다른 패키지에서 접근 불가
        // parent.name = "성이름";
        // protected : 상속 관계가 있으면 다른 패키지라도 허용
        // parent.grade = "A";
        // super.grade = "B";

        super.grade = "B";
        parent.getNum1();
    }

}
