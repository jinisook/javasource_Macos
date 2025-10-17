package object;

public class TriangleEx {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(); // new 생성 시 생성자 자동 생성

        // 속성(멤버변수) 초기화 세가지
        // 1) 직접 접근(속성) - 속성 작성 때 private 사용 시 직접 접근X
        // triangle1.baseLine = 12;
        // triangle1.height = 6;

        // 2) 생성자 - 이 방법을 사용 시 생성자 생성

        Triangle triangle1 = new Triangle(12, 6);
        System.out.println("넓이 : " + triangle1.getArea()); // 메서드 호출

        // 3) setter 메서드

        Triangle triangle2 = new Triangle();
        triangle2.setBaseLine(10);
        triangle2.setHeight(5);
        System.out.println("넓이 : " + triangle2.getArea());
    }

}
