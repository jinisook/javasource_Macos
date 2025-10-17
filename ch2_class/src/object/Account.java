package object;

import java.util.Scanner;

public class Account {
    // 은행계좌
    // 계좌번호(120-12-111), 계좌주(홍길동), 잔액(100000)

    // private : 해당 클래스 내에서만 접근 가능 -> 해당 클래스에서 벗어난 모든 곳에선 private : 접근X
    private String accountNo;
    private String owner;
    private long balance;
    Scanner sc = new Scanner(System.in);

    public Account(String accontNo, String owner, long balance) {
        this.accountNo = accontNo;
        this.owner = owner;
        this.balance = balance;
    }

    // 입금한다(잔액 = 잔액 + 입금액) => 입금액을 인자로 받아서 처리, 리턴 타입 없음, deposit
    void deposit(long amount) { // return X
        balance += amount;

    }

    // 출금액(잔액 = 잔액 - 출금액) => 출금액을 인자로 받아서 처리, 잔액 리턴, withdraw
    long withdraw(long amount) {
        balance -= amount;
        return balance;
    }

    // 속성 값 조회 : get~~ 붙여서 사용
    // 잔액 조회
    public long getBalance() {
        return balance;
    }

    // 계좌주 조회
    public String getOwner() {
        return owner;
    }

    public String getAccountNo() {
        return accountNo;
    }

}
