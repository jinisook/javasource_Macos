package object;

import java.net.Socket;

public class MethodCall {
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;

    static void staticMethod1() {
        MethodCall obj = new MethodCall();
        System.out.println(obj.iv); // new로 불러온 것 X, 결과값 X
        System.out.println(cv); // static은 메모리에 바로 올라가서 결과값 확인 가능
    }

    void instanceMethod1() {
        // static 변수 호출
        System.out.println(cv);
        // 인스턴스 변수 호출
        System.out.println(iv);
    }

    static void staticMethod2() {
        // 클래스 메소드 호출
        staticMethod1();
        MethodCall obj = new MethodCall();
        // 인스턴스 메소드 호출
        obj.instanceMethod1();
    }

    void instanceMethod2() {
        // 클래스 메소드 호출
        staticMethod1();
        // 인스턴스 메소드 호출
        instanceMethod1();
    }

}
