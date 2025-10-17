package object;

import java.util.Scanner;

public class AccountEx3 {
    // 클래스 시작 - 멤버변수 / static 선언
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 사용자 입력

        // 배열 선언과 생성
        Account[] accounts = new Account[100];

        // 배열 생성 new int[3], new Account[3]...
        accounts = new Account[100];
        boolean run = true;
        while (run) {
            System.out.println("--------------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.print("선택 >> ");
            int no = Integer.parseInt(sc.nextLine());

            switch (no) {
                case 1:
                    creatAccount(accounts);
                    break;
                case 2:
                    accountList(accounts);
                    break;
                case 3:
                    deposit(accounts);
                    break;
                case 4:
                    withdraw(accounts);
                    break;
                case 5:
                    run = false;
                    System.out.println("프로그램을 종료합니다");
                    break;

                default:
                    System.out.println("메뉴 번호를 확인해주세요");
                    break;
            }
        }

    }

    static void creatAccount(Account[] accounts) {

        // 계좌생성
        System.out.print("계좌번호 입력 : ");
        String accountNo = sc.nextLine();
        System.out.print("계좌주 입력 : ");
        String owner = sc.nextLine();
        System.out.print("잔액 입력 : ");
        int balance = Integer.parseInt(sc.nextLine());

        for (int j = 0; j < accounts.length; j++) {
            if (accounts[j] == null) {
                accounts[j] = new Account(accountNo, owner, balance);
                break;
            }
        }
    }

    static void withdraw(Account[] accounts) {
        // 출금 담당
        Account account = findAccount(accounts);
        if (account == null) {
            System.out.println("계좌번호 확인");
        } else {
            System.out.print("출금액을 입력해주세요 >> ");
            int amount = Integer.parseInt(sc.nextLine());
            long balance = account.withdraw(amount); // Account 클래스에 return 있어서 long balance =
        }
    }

    static void deposit(Account[] accounts) {
        // 입금 담당
        Account account = findAccount(accounts);
        if (account == null) {
            System.out.println("계좌번호 확인");
        } else {
            // 입금액 입력 받아 계좌 잔액에 추가 -> Account 클래스에서 메소드 호출
            System.out.print("입금액을 입력해주세요 >> ");
            int amount = Integer.parseInt(sc.nextLine());
            account.deposit(amount);
        }

    }

    static Account findAccount(Account[] accounts) {
        // 입력 받은 계좌번호와 일치하는 계좌 찾기
        System.out.print("계좌번호 입력 >> ");
        String accountNo = sc.nextLine();

        // 일치하는 계좌 찾으면,
        for (Account account : accounts) {
            if (account != null) {
                if (account.getAccountNo().equals(accountNo)) {
                    return account;
                }
            }
        }

        return null;
    }

    static void accountList(Account[] accounts) {
        for (Account account : accounts) {
            if (account != null) {
                System.out.println("=========================");
                System.out.println("1. 계좌번호 : " + account.getAccountNo());
                System.out.println("2. 계좌번호 : " + account.getOwner());
                System.out.println("3. 잔액 : " + account.getBalance());
                System.out.println("=========================");

            }
        }

    }
}
