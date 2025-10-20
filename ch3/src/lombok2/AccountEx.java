package lombok2;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("유우시", "1020", 12000);

        // toString
        System.out.println(account);

        Account account2 = new Account();
        account2.setAccNo("1010");
        account2.setBalance(20000);
        account2.setName("토쿠노");
        // 위에를 간단하게 하는 방법 Builder 사용
        // builder 사용 시 set X -> 멤버변수명만 사용
        // lombok 을 사용해서, 어노테이션으로 builder()를 사용해야 함
        Account account3 = Account.builder()
                .accNo("1030")
                .balance(300000)
                .name("토쿠토쿠")
                .build();

        System.out.println(account3);

    }

}
