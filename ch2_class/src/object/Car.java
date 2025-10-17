package object;

public class Car {
    // 속성 : 제조사명(현대), 모델명(아반떼), 색상(red), 최대속도(200)

    String companyName;
    String model;
    String color;
    int maxSpeed;

    // 생성자
    // : 여러 개 작성 가능 (괄호 안 변화 - 타입 변화(+ 개수))
    // : 생성자는 클래스 이름과 동일
    // : 리턴 값이 없음(void 쓰지 않음)
    // 생성자 오버로딩 : 하나의 클래스에 여러 개의 생성자 존재
    // 메소드 오버로딩 : 하나의 클래스에 여러 개의 메소드 존재

    Car() { // default(기본) 생성자 (컴파일러가 자동으로 추가 : 단 클래스에 정의된 생성자가 하나도 없는 경우)
    }

    public Car(String companyName) {
        this.companyName = companyName;
    }

    public Car(String companyName, String model) {
        this.companyName = companyName;
        this.model = model;
    }

    // 괄호 안에 변수명의 변화를 줘도 타입이 같아서 안됨
    // public Car(String companyName, String color) {
    // this.companyName = companyName;
    // this.color = color;
    // }

    public Car(String companyName, String model, String color) {
        this.companyName = companyName;
        this.model = model;
        this.color = color;
    }

    public Car(String companyName, String model, String color, int maxSpeed) {
        this.companyName = companyName;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // 괄호 안에 순서가 위와 달라서 가능(오버로딩을 할 때 타입 순서도 중요)
    // public Car(String companyName, String model, int maxSpeed, String color) {
    // this.companyName = companyName;
    // this.model = model;
    // this.color = color;
    // this.maxSpeed = maxSpeed;
    // }

    void forward() {
        System.out.println(this.model + "전진한다");
    }

    void backward() {
        System.out.println(this.model + "후진한다");
    }

    void turn() {
        System.out.println(this.model + "회전한다");
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car [companyName=" + companyName + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
                + "]";
    }

}
