package basic;

public class Variable1 {
    public static void main(String[] args) {
        // 변수 선언 후 값 할당
        int num = 10;
        int sum = num + 20;
        System.out.println("num 변수 값 : " + num);
        System.out.println("num + 20 : " + sum);
        System.out.printf("num 변수 값 = %d", num);

        int age = 25, maxSpeed = 10;
        System.out.println("age=" + age + ", maxSpeed=" + maxSpeed);
        System.out.printf("age = %d, maxSpeed = %d\n", age, maxSpeed);
        System.out.printf("age = %10d, maxSpeed = %5d\n", age, maxSpeed);

        num = 35;

        // 상수 선언과 할당
        final int MAX_SPEED = 20;
        System.out.println(MAX_SPEED);
        // MAX_SPEED = 30; -> 한 번 저장된 값은 변경 안됨

    }
}
