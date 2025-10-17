package inheritance;

public class CreditLineAccount extends Account {
    // 마이너스 한도 : 100000(예금액) + 5000000
    private int minus;

    public CreditLineAccount(String accontNo, String owner, long balance, int minus) {
        super(accontNo, owner, balance);
        this.minus = minus;
    }

    // 출금한다(마이너스 한도 포함) : 출금 = 잔액(잔액 + 마이너스한도) - 사용액

    @Override
    long withdraw(long amount) throws Exception {
        if (super.getBalance() + minus < amount) {
            throw new Exception("마이너스 한도 확인");
        }
        // 잔액(잔액 + 마이너스한도) - 사용액
        // balance = (balance+minus)-amount; 하기 위해서 setBalance
        setBalance(getBalance() - amount);
        return super.getBalance();

    }

}
