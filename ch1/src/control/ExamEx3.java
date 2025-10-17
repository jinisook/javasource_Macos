package control;

import java.util.Scanner;

public class ExamEx3 {
    public static void main(String[] args) {
        // 하루 일당 산출
        // 8시간까지는 10030
        // 8시간 이후에는 원래 받던 금액의 1.5배
        // 8 * 10030 + ((time - 8) * 10030 * 1.5)
        // 오늘 근무시간을 입력 받은 후 하루 일당 산출
        // 일당은 정수형

        // 내 코드
        // System.out.print("오늘 하루 근무 시간을 입력하세요 : ");

        // Scanner sc = new Scanner(System.in);
        // int time = Integer.parseInt(sc.nextLine());

        // if (time <= 8) {
        // System.out.println("하루 일당 : " + time * 10300 + "원");
        // } else {
        // System.out.println("하루 일당 : " + (8 * 10030 + ((time - 8) * 10030 * 1.5)) +
        // "원");

        // }

        // sc.close();

        // 정답
        Scanner sc = new Scanner(System.in);
        System.out.print("오늘 하루 근무 시간을 입력하세요 : ");
        int hours = Integer.parseInt(sc.nextLine());

        int rate = 10030, pay = 0;
        if (hours > 8) {
            pay = rate * 8 + (int) ((hours - 8) * rate * 1.5);
        } else {
            pay = rate * hours;
        }
        System.out.printf("근무시간 %d, 임금 : %d", hours, pay);

    }

}
