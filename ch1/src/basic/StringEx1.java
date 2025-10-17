package basic;

public class StringEx1 {
    public static void main(String[] args) {
        // 문자열 : " "
        String str1 = "안녕하세요";
        String str2 = "안녕하세요";

        // 문자열이 같은가? == !=

        System.out.println(str1 == str2 ? "문자열이 같다" : "문자열이 다르다");

        String str3 = new String("안녕하세요"); // 위와 저장 공간이 다름
        System.out.println(str1 == str3 ? "문자열이 같다" : "문자열이 다르다");

        // equals
        System.out.println(str1.equals(str3)); // equals -> = , 결과값 true, false

        String str4 = "abc", str5 = "ABC";
        System.out.println(str4.equals(str5) ? "abc == ABC" : "abc != ABC"); // 대소문자 구별
        System.out.println(str4.equalsIgnoreCase(str5) ? "abc == ABC" : "abc != ABC"); // IgnoreCase -> 영어일 때만, 대소문자 구별
                                                                                       // 무시

    }

}
