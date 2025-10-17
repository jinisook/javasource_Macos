package control;

import java.util.Scanner;

public class ExamEx7 {
    public static void main(String[] args) {
        /*
         * -------------------------------------
         * 1. 예금 | 2. 출금 | 3. 잠금 | 4. 종료
         * -------------------------------------
         * 선택 >> 2
         * 출금액 >> 20000
         * -------------------------------------
         * 1. 예금 | 2. 출금 | 3. 잠금 | 4. 종료
         * -------------------------------------
         * 선택 >> 3
         * 잔고 >> 80000
         * -------------------------------------
         * 1. 예금 | 2. 출금 | 3. 잠금 | 4. 종료
         * -------------------------------------
         * 선택 >> 4
         * 프로그램 종료
         */

        // System.out.println("-------------------------------------");
        // System.out.println("1. 예금 | 2. 출금 | 3. 잠금 | 4. 종료");
        // System.out.println("-------------------------------------");
        // System.out.print("선택 >> ");
        // Scanner sc = new Scanner(System.in);
        // int menu = Integer.parseInt(sc.nextLine());

        // while (true) {
        // if (menu == 1) {
        // System.out.print("예금액 >> ");

        // } else if (menu == 2){
        // System.out.print("예금액 >> ");

        // }
        // }

        boolean run = true;
        Scanner sc = new Scanner(System.in);
        int balance = 0; // 잔액
        while (run) {
            System.out.println("-------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잠금 | 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    System.out.print("입금액 >> ");
                    // int money = Integer.parseInt(sc.nextLine());
                    balance += Integer.parseInt(sc.nextLine()); // => money 대신 대체 가능
                    break;
                case 2:
                    System.out.print("출금액 >> ");
                    // int money = Integer.parseInt(sc.nextLine());
                    balance -= Integer.parseInt(sc.nextLine());
                    break;
                case 3:
                    System.out.println("잔액 >> " + balance);
                    break;
                case 4:
                    run = false;
                    break;

                default:
                    break;
            }

        }

    }

}
