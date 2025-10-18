package lang;

// 래퍼(Wrapper - 감싸다) 클래스
// 기본 타입 변수를 객체로 다루고자 할 때 사용
public class WrapperEx1 {
    public static void main(String[] args) {
        // 타입 첫자를 대문자로 할 경우 객체로 사용 가능
        // 객체화할 경우 클래스 내 .메소드 불러서 사용 가능
        // boolean => Boolean
        boolean b = true;
        // Boolean boolean1 = new Boolean(b); 이제 지원 안함
        Boolean boolean1 = Boolean.valueOf(b);
        Boolean boolean2 = false; // 값 바로 입력 가능(직접 명시 가능) // false Boolean.valueOf(b);으로 자동 변환

        // byte => Byte
        Byte byte1 = 1; // Byte.valueOf((byte) 1)로 자동변환
        // 상수 1 => 기본적으로 int 형으로 인식
        Byte byte2 = Byte.valueOf((byte) 1);

        // char => Character
        Character ch = 'a';
        Character ch2 = Character.valueOf('b');

        // short => Short
        // int => Int
        Integer.parseInt("15"); // Inteager(클래스)

        // long => Long
        Long long1 = 15L;
        Long long2 = Long.valueOf(16L);
        Long.parseLong("15.5"); // long 값으로

        // float => Float
        Float float1 = 16.5f;
        Float float2 = Float.valueOf(17.5f);
        Float.parseFloat("16.58");

        // double => Double
        Double double1 = 18.5d;
        Double double2 = Double.valueOf(19.5d);
        Double.parseDouble("172.56");

    }

}
