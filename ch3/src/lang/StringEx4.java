package lang;

public class StringEx4 {
    public static void main(String[] args) {
        String[] names = { "Queen", "Tod", "Kim", "Park", "Hong" };
        StringEx4 obj = new StringEx4(); // static(x) -> 메인에 생성

        String result = obj.findKim(names);

        System.out.println(result);

    }

    public String findKim(String[] names) {
        // return 값 : Kim은 ? 번째에 있다
        int pos = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Kim")) {
                // i 값 보관
                // 중지
                pos = i;
                break;
            }
        }
        return "Kim은 " + (pos + 1) + "번째에 있다.";
    }

}
