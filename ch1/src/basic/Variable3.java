package basic;

public class Variable3 {
    public static void main(String[] args) {
        // 실수형 : float, double(기본타입)
        // float score1 = 50;
        float score1 = 50.15f;
        double score2 = 45.125d;

        System.out.println("score1 = " + score1);
        System.out.println("score2 = " + score2);
        System.out.printf("score1 = %10.2f, score2 = %f\n", score1, score2);
        System.out.printf("score1 = %.2f, score2 = %f\n", score1, score2);

        // %10.2f : %전체자릿수.소수점자릿수
    }
}
