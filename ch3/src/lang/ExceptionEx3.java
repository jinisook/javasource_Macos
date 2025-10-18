package lang;

import java.net.InterfaceAddress;

public class ExceptionEx3 {
    public static void main(String[] args) {
        // public - 접근제한자(전부 접근 가능) / static - new를 부르지 않아도 .main() 가능 / String[] args -
        // String 배열을 받아야 함

        // 1. NullPointerException
        String str = null; // 초기화 -> null (아직 값이 없음, 할당하지 않았음)
        // null은 참조타입에만(기본타입X) 넣을 수 있음(대문자, 배열) -> int i = null;(X)
        // Value v = null;
        // System.out.println(str); // null
        // System.out.println(str.length()); // NullPointerException / 변수 자체에 null은
        // 가능하지만 그상태(null)에서 접근X

        // NullPointerException 사전방지 하는 방법 if문
        // if (str != null) {
        // System.out.println(str.length());
        // }

        // 2. ArrayIndexOutOfBoundException
        // 배열 인데스가 바운드에 벗어남 [10] -> 11번 접근 (X)
        // String data1 = args[0]; // main(String[] args)에서 가져옴 -> 아직 값 초기화X
        // System.out.println(data1); // ArrayIndexOutOfBoundException

        // ArrayIndexOutOfBoundException을 사전방지 하는 방법 if문 사용
        if (args.length == 1) {
            String data1 = args[0];
            System.out.println(data1);
        }

        // 3. NumberFormatException
        // String data1 = "a100";
        // int value1 = Integer.parseInt(data1);
        // System.out.println(value1); // NumberFormatException - Integer.parseInt 사용할 때
        // 뜨는 Exception

        // NumberFormatException 사전방지 try-catch
        try {
            // exception 발생할 가능성이 있는 코드
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);
        } catch (Exception e) {
            // exception 발생하면, 해야 하는 작업
            // e.printStackTrace(); // -> 예외 사항 추적하는 코드
            // System.out.println(e.getMessage()); // For input string: "a100"
            // System.out.println("입력값 확인");
            // 세 가지 실행 방법
        } // catch 여러 개 작성후, 각각 Exception 확이 가능

        // 4. ClassCastException
        // Dog dog = new Dog();
        // changDog(dog);
        // Cat cat = new Cat();
        // changDog(cat);

    }

    // ClassCastException 막는 방법 -> if문으로 확인
    // public static void changDog(Animal animal) {
    // if (animal instanceof Dog) {
    // Dog dog = (Dog) animal;
    // }
    // }
}
