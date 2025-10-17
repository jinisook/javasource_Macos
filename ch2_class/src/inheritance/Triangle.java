package inheritance;

public class Triangle extends Shape {
    // Point point1 = new Point();
    // Point point2 = new Point();
    // Point point3 = new Point();

    // 배열로 위 코드 간략화 가능
    Point[] points = new Point[3]; // null 초기화

    public Triangle(Point[] points) {
        this.points = points;
    }

    @Override
    void draw() {
        System.out.printf("p1[x = %d, y = %d], p2[x = %d, y = %d], p3[x = %d, y = %d], color = %s", points[0].x,
                points[0].y, points[1].x, points[1].y, points[2].x, points[2].y,
                color);
    }

}
