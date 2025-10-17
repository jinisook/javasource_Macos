package inheritance;

public class AccountEx {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("111", "성이름", 1000000,
                "111-12");

        // 입금
        checkingAccount.deposit(200000);
        // 입금 후 잔액
        System.out.println("잔액 : " + checkingAccount.getBalance());
        // 직불카드 사용
        try {
            System.out.println("체크카드 지불 후 잔액 : " + checkingAccount.pay("111-12",
                    350000));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 마이너스 한도

        CreditLineAccount craditLineAccount = new CreditLineAccount("121", "이름성",
                100000, 5000000);
        try {
            System.out.println("잔액 : " + craditLineAccount.withdraw(5000000));
            // System.out.println("잔액 : " + craditLineAccount.withdraw(5000000));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 보너스 포인트
        BonusPointAccount bonusPointAccount = new BonusPointAccount("131", "이름이", 0, 0);
        bonusPointAccount.deposit(100000);
        System.out.println("현재 보너스 포인트 : " + bonusPointAccount.getBonusPoint());
        bonusPointAccount.deposit(200000);
        System.out.println("현재 보너스 포인트 : " + bonusPointAccount.getBonusPoint());

        CheckingTrafficCardAccount checkingTrafficCardAccount = new CheckingTrafficCardAccount("141", "성이", 100000,
                "414",
                false);
        CheckingTrafficCardAccount checkingTrafficCardAccount2 = new CheckingTrafficCardAccount("151", "름이", 100000,
                "515", true);

        // 예금
        checkingTrafficCardAccount2.deposit(10000);

        try {
            // 출금
            System.out.println("출금 후 잔액 " + checkingTrafficCardAccount2.withdraw(50000));

            // 교통카드 기능 있는 경우
            System.out.println("교통비 지급 후 잔액 " + checkingTrafficCardAccount2.payTrafficCard("515", 2100));
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
