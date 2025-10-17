package inheritance;
// point와는 포함관계, Shape과는 상속관계

public class Circle extends Shape {
    // int x; // 원점의 x 좌표
    // int y; // 원점의 y 좌표

    Point point; // 포함관계
    int r; // 반지름

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }

    // x, y 좌표와 color 출력 -> 부모 draw 다시 정의(기능 추가)해서 사용 -> override
    @Override
    void draw() {
        System.out.printf("[x = %d, y = %d, color = %s]", point.x, point.y, color);
        // color는 private X 그냥 사용 가능, x, y -> point.

    }

}
