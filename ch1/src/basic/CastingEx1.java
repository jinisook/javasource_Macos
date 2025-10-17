package basic;

public class CastingEx1 {
    public static void main(String[] args) {
        double d = 85.4;
        int score = (int) d;
        System.out.printf("d = %f, score = %d\n", d, score);
        // 강제로 변환하는 것을 '캐스팅' -> 손실O
    }

}
