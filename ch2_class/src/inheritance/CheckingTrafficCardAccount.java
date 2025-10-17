package inheritance;

public class CheckingTrafficCardAccount extends CheckingAccount {
    // 은행 + 체크카드 + 교통카드

    private boolean hasTrafficCard;

    public CheckingTrafficCardAccount(String accontNo, String owner, long balance, String cardNo,
            boolean hasTrafficCard) {
        super(accontNo, owner, balance, cardNo);
        this.hasTrafficCard = hasTrafficCard;
    }

    // 교통비 지급 메소드
    // 기능 - 카드번호, 교통비 사용액을 인자로 받아서 카드번호가 일치하고 교통카드 기능이 존재하면 지급
    // 교통카드 기능이 없으면, 메세지로 알려주기
    // -> CheckingAccount에 카드번호 일치 코드가 있으니, 교통카드 기능 여부 확인

    long payTrafficCard(String cardNo, long amount) throws Exception {
        // 교통카드 기능 여부
        // 출금 여부

        if (!hasTrafficCard) {
            throw new Exception("교통카드 기능이 없습니다.");
        }

        // 부모의 pay() 호출
        return pay(cardNo, amount);

    }

}
