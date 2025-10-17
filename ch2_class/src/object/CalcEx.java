package object;

public class CalcEx {
    public static void main(String[] args) {
        // 외부에서 Calc 클래스를 사용하고 싶을 때 인스턴스 생성
        Calc calc = new Calc();
        // calc.avg(15, 7); // 외부 호출
        calc.excute(); // 외부 호출 -> Calc 클래스 내 실행 (1)-(6) 순서

    }

}
