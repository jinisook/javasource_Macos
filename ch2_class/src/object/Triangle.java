package object;

public class Triangle {
    // 속성 : 밑변(baseLine), 높이(height)
    double baseLine;
    double height;

    public Triangle() { // 소스 액션 - construtor 선택 X
    }

    public Triangle(double baseLine, double height) { // 소스 액션 - construtor 두 개 선택
        this.baseLine = baseLine;
        this.height = height;
    }

    // 기능 : 삼각형 너비(getArea())
    // 메서드
    double getArea() {
        return baseLine * height / 2;
    }

    public void setBaseLine(double baseLine) {
        this.baseLine = baseLine;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
