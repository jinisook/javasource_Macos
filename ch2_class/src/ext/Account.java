package ext;

public class Account {
    // 은행계좌
    // 계좌번호(120-12-111), 계좌주(홍길동), 잔액(100000)

    // private : 해당 클래스 내에서만 접근 가능 -> 해당 클래스에서 벗어난 모든 곳에선 private : 접근X
    private String accountNo;
    private String owner;
    private long balance;

    public Account(String accountNo) {
        this.accountNo = accountNo;
    }

    public Account(String accountNo, String owner) {
        this.accountNo = accountNo;
        this.owner = owner;
    }

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
    long withdraw(long amount) throws Exception {
        // 잔액 안에서 출금 허용
        if (amount > balance) {
            throw new Exception("잔액부족");

        }

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

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
