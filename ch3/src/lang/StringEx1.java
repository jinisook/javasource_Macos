package lang;

public class StringEx1 {
    public static void main(String[] args) {
        // 다른 클래스 사용 하기 위해서는,
        // 1. 인스터스 생성
        // String str = new String("tokuno"); -> 기본 방식이지만, String(많이 사용하는 클래스)은 new 생략해도
        // 가능
        String str1 = "tokuno";

        // 문자열을 낱개로 처리 : "tokuno" => "t", "o", "k", "u"... : charAt(인덱스번호(0번부터 시작, 자바는
        // 0번부터 시작))
        // System.out.println(str1.charAt(0));
        // System.out.println(str1.charAt(1));
        // System.out.println(str1.charAt(2));
        // 반복되는 과정
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

        // String str = new String(" "); 를 써야할 때,
        char[] ch = { 'J', 'I', 'N' };
        // char 배열 -> 문자열로 변경 (기본 : String str2 = "JIN")
        String str2 = new String(ch);
        System.out.println(str2);

    }

}
