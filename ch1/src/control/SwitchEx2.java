package control;

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 ");
        Scanner sc = new Scanner(System.in);
        int user = Integer.parseInt(sc.nextLine());

        // double com = Math.random(); -> 원래 형태
        int com = (int) (Math.random() * 3) + 1;
        // System.out.println(com);

        switch (user - com) {
            case 2:
            case -1:
                System.out.println("당신이 졌습니다.");
                break;
            case 1:
            case -2:
                System.out.println("당신이 이겼습니다.");
                break;
            case 0:
                System.out.println("비겼습니다.");
                break;

        }

    }

}
