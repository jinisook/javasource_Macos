package ext;

public class AccountEx {
    public static void main(String[] args) {
        // Account 계좌 3개 생성
        Account account1 = new Account("111", "성이름", 10000);
        Account account2 = new Account("222", "이름성", 10000);
        Account account3 = new Account("333", "이름이", 10000);

        // 배열
        // 배열 생성
        int[] arr = new int[3];
        // 초기화
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 6;

        // 생성 + 초기화
        int[] arr2 = { 4, 5, 6 };

        // Account 배열
        Account[] accounts = new Account[3];
        accounts[0] = new Account(null, null, 0);
        accounts[1] = new Account(null, null, 0);
        accounts[2] = new Account(null, null, 0);

        // 생성 + 초기화
        Account[] accounts2 = { new Account(null, null, 0), new Account(null, null, 0), new Account(null, null, 0) };

    }

}
