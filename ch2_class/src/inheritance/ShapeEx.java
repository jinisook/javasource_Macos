package inheritance;

public class ShapeEx {
    public static void main(String[] args) {
        Point point = new Point();
        Point point2 = new Point(10, 10);
        System.out.println(point);

        // Point[] points = {new Point(10, 10), new Point(20, 20), new Point(30, 30)};

        Point[] points = new Point[3];

        // points[0] = new Point();
        // points[0].x = 10;
        // points[0].y = 10;

        // points[1] = new Point();
        // points[1].x = 20;
        // points[1].y = 20;

        // points[2] = new Point();
        // points[2].x = 30;
        // points[2].y = 30;

        points[0] = new Point(10, 10);
        points[1] = new Point(20, 20);
        points[2] = new Point(30, 30);

        Triangle triangle = new Triangle(points); // NullPointerException = 변수가 null 상태 (포함관계 때 자주 일어남)
        triangle.draw();
    }

}
