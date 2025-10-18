package lang;

public class StringBuilderEx {
    public static void main(String[] args) {
        // 다른 클래스 사용 -> 1. 인스턴스 생성
        StringBuilder builder = new StringBuilder();
        // StringBuilder builder2 = "new StringBuilder()"; -> String이랑 달리 직접 X

        String str1 = "abc";
        String str2 = "abc";

        // concat(원본 변경X, 새로운 문자열 생성)
        // append : 원본 변경
        builder.append("abc").append("bcd").append("def");
        System.out.println(builder);

        // 원본 유지하고 싶을 땐 Spring 사용
        // 원본도 변경하고 싶을 땐 StringBuffer, StringBuilder 사용

        // 원본 변경/ 끝 위치 포함 안함
        builder.delete(0, 2);
        System.out.println(builder);
        builder.deleteCharAt(0);
        System.out.println(builder);
        builder.insert(1, "유우시");
        System.out.println(builder);
        builder.replace(1, 3, "토쿠노"); // -> end는 포함되지않고, "토쿠노시"로 변경됨
        System.out.println(builder);

        builder = new StringBuilder("tokuno");
        StringBuilder builder2 = new StringBuilder("tokuno");

        System.out.println(builder.equals(builder2) ? "같은" : "다름");
        // "다름" -> Object 그대로 사용 (주소값)
        // StringBuilder => String
        // str1 = builder; (X) -> builder => 주소
        str1 = builder.toString(); // .toString(); 으로 문자열로 변환 후 str1에 담기 -> 결과값 볼때와 달리 대입은 명시해줘야 함
        str2 = new String(builder2); // String에 값 담기 -> 문자열 가져오기

        System.out.println(str1.equals(str2));

        String str3 = "steady";
        str3 += "color";
        str3 += "surf";
        System.out.println(str3); // steadycolorsurf
        // 양이 많아지면, 위에 과정(String)은 기존을 파괴하고 새로 생성이기 때문에,
        // StringBuffer, StringBuilder로 append로 붙이기를 하는 편이 나음
    }

}
