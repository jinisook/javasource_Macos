package lang;

import static java.lang.Math.*; // import문을 가져오는 것 * : Math 안에 전부

// Math : 기본적인 수학계산에 사용할 수 있는 메서드로 구성
//        모든 메소드가 Static -> new 메소드 안함

public class MathEx {
    public static void main(String[] args) {
        // Math.random(); //클래스명.메소드명() -> random() 메소드는 Static메소드 / 생성자 없이 그냥 부를 수 있음
        double val = 90.7552;
        // System.out.println("반올림 " + Math.round(val));
        // System.out.println("올림 " + Math.ceil(val));
        // System.out.println("버림 " + Math.floor(val));
        // System.out.println("PI " + Math.PI);

        // Math. 을 떼서 사용 가능 (맨 위 import문 명시 시)
        System.out.println("반올림 " + round(val));
        System.out.println("올림 " + ceil(val));
        System.out.println("버림 " + floor(val));
        System.out.println("PI " + PI);
        System.out.println("0 <= x < 1 " + Math.random());

    }

}
