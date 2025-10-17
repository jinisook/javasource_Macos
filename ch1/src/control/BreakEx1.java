package control;

public class BreakEx1 {
    public static void main(String[] args) {
        // break : switch 구문
        // 자신이 포함된 가장 가까운 반복문 벗어나기

        // 1부터 합
        int sum = 0, i = 0;
        while (true) {
            // sum이 100초과 시 반복문 중지
            if (sum > 100)
                break;
            ++i;
            sum += i; // sum = sum + i

        }
        System.out.println("i = " + i);
        System.out.println("sum = " + sum);

    }

}
