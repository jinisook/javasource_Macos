package object;

public class MethodTest {
    // 메서드
    // 메서드 생성 이유 => 재사용성이 높음 / 메서드 생성 해두면 새로운(여러) 클래스에 사용 가능
    // => 중복된 코드 제거할 수 있음
    // => 프로그램 구조화
    // 1. 인스턴스(멤버) 메서드 : 클래스 영역에 선언 -> 인스턴스 생성 후 가능 (클래스명 클래스 변수 = new 클래스명();)
    // 2. 클래스 메서드 : 클래스 영역에 선언 -> 클래스가 메모리에 올라갈 때 사용 가능

    // 괄호 안 범위 - 중괄호 안에서만 가능
    // return 연달아X, 여러 개 명시X
    // 두 개의 인자(== 매개변수)를 받아서 덧셈 후 덧셈 결과 리턴
    int sum(int num1, int num2) {
        // int result = num1 + num2;
        // return result;
        // 위에 두줄 한줄 표현(result 표현X)
        return num1 + num2;
    }

    // 두 개의 인자(== 매개변수)를 받아서 뺄셈 후 뺄셈 결과 리턴
    double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // 두 개의 인자(float 타입)을 받아서 나눗셈 후 나눗셈 결과 리턴
    float divide(float num1, float num2) {
        return num1 / num2;
    }

    // 두 개의 문자열 인자를 받아서 하나의 문자열로 리턴
    String concat(String str1, String str2) {
        return str1 + str2;
    }

    // 한 개의 int 타입의 배열을 받아서 배열을 리턴
    // 배열 선언 => int [] arr = new int[3]; / int[] = {3,4,5};
    int[] call(int[] arr) {
        return arr;

    }

    String print() {
        return "안녕하세요";
    }
}
