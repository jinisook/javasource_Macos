package control;

import java.util.Scanner;

public class ExamEx1 {
    public static void main(String[] args) {
        // 년도를 입력받아 윤년, 평년 출력
        // 윤년 : 2012년, 2016년
        // 년도를 4로 나눈 나머지가 0이고, 년도를 100으로 나눈 나머지가 0이 아니거나
        // 년도를 400으로 나눈 나머지가 0이면

        // (year % 4 == 0 && year % 100 != 0) || year % 400 == 0

        // 내 코드
        System.out.print("연도를 입력하세요 ");

        Scanner sc = new Scanner(System.in);
        int year = Integer.parseInt(sc.nextLine());

        String result = " ";

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            result = "윤년";

        } else {
            result = "평년";

        }
        System.out.println(result);

        sc.close();

        // 정답
        // System.out.print("연도를 입력하세요 ");

        // Scanner sc = new Scanner(System.in);
        // int year = Integer.parseInt(sc.nextLine());

        // if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        // System.out.println("윤년");

        // } else {
        // System.out.println("평년");
        // }

        // sc.close();

    }

}
