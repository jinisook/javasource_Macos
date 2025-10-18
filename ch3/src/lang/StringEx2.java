package lang;

import java.util.Arrays;

// String
// mutabel => immutable(변경불가)
// StringBuffer, StringBuilder (메소드가 같음) => mutable(원본 변경가능)
// 멀티쓰레드 / 단일쓰레드 (작업 단위 : 쓰레드) -> 멀티쓰레드 : 메인 + 서브로 같이 돌릴 수 있음(게임 시 채팅까지 같이 하는 개념)

public class StringEx2 {
    public static void main(String[] args) {

        // 1. concat() : 다른 문자열 뒤에 덧붙이기
        String str1 = "jinis";
        String str2 = " World";
        String str3 = str1 + str2; // 원본 바꾸는 것 X -> 새로운 생성
        System.out.println(str3);
        // 리턴 타입 존재 -> 1) 출력문에 넣기 : 확인만 할 때 or 2) 변수 처리 : 다음에도 써야할 때
        // str1.concat(str2);
        System.out.println("concat() " + str1.concat(str2));

        // 2. contains() : 문자열 포함 여부
        boolean result = str3.contains(str1);
        System.out.println(result);
        // 위 내용 if문으로,
        if (str3.contains(str1)) {
            System.out.println("str3 문자열에 str1 문자열이 포함됨");
        } else {
            System.out.println("str3 문자열에 str1 문자열이 포함되지 않음");
        }

        // 3. compareTo() : 문자열 사전순서로 비교 -> 문자열 정렬 시 사용
        str1 = "aaa";
        str2 = "kkk";
        System.out.println("str1.compareTo(aaa) = " + str1.compareTo("aaa")); // 0
        System.out.println("str1.compareTo(str2) = " + str1.compareTo(str2)); // -10 = 97(a) - 107(k)
        System.out.println("str1.compareTo(str1) = " + str2.compareTo(str1)); // 10

        // 4. endWith() : 지정된 문자열로 끝나는지 검사
        String fileName = "file1.txt";
        if (fileName.endsWith("txt")) {
            System.out.println("텍스트 파일");
        } else {
            System.out.println("텍스트 파일 아님");
        }

        // 5. equals() : 문자열 비교, equalsIgnoreCase() : 대소문자 구별 없이 비교
        System.out.println("aaa".equals("cccc"));
        System.out.println("aaa".equalsIgnoreCase("AAA"));

        // 6. indexOf('문자') : 문자열에서 문자의 위치값 리턴
        // indexOf('문자', 찾을 시작 위치) : 문자열에서 문자의 위치값 리턴
        str1 = "Jinis";
        System.out.println("str1.indexOf('s') " + str1.indexOf('s'));
        System.out.println("str1.indexOf('e') " + str1.indexOf('e')); // - 문자열에서 못 찾으면 : -1
        System.out.println("str1.indexOf('n', 2) " + str1.indexOf("n", 2));
        System.out.println("str1.indexOf(is) " + str1.indexOf("is"));

        // 7. lastIndexOf()
        str1 = "java.lang.Object";
        System.out.println("str1.lastIndexOf('.')" + str1.lastIndexOf('.')); // 9 -> 마지막 . 알려줌 -> 뒤에서부터 '.'을 찾음
        System.out.println("str1.IndexOf('.')" + str1.indexOf('.')); // 4 -> 앞부터

        // 8. length() : 문자열 길이 반환
        int arr[] = { 3, 4, 5, 6 };
        for (int i = 0; i < arr.length; i++) {
        }

        // 9. replace()
        str1 = "Hello";
        System.out.println(str1.replace('H', 'k')); // 원본 문자 훼손X, 출력값만
        System.out.println("Hellollo".replace("ll", "LL")); // 전체변경
        // regex : 정규식
        System.out.println("Hellollo".replaceAll("ll", "LL")); // 전체변경
        System.out.println("Hellollo".replaceFirst("ll", "LL")); // 첫번째만 변경
        // System.out.println(str1); -> 원본 그대로

        // 10. split()
        String animals = "dog,cat,bear";
        String[] arr2 = animals.split(",");
        System.out.println(arr2); // 주소 값
        System.out.println(Arrays.toString(arr2)); //
        for (String s : arr2) {
            System.out.println(s);
        }

        String[] arr3 = animals.split(",", 2); // limit 두개로 분리해 줘
        for (String s : arr3) {
            System.out.println(s);
        }

        // 11. startWith() : 주어진 문자열이 앞과 일치하는지, <=> endWith()
        str1 = "java.lang.Object";
        System.out.println("str1.startsWith(\"java\")" + str1.startsWith("java"));
        System.out.println("str1.startsWith(\"lang\")" + str1.startsWith("lang"));
        System.out.println("str1.startsWith(\"lang\")" + str1.startsWith("lang", 5)); // offset(간격)만큼 이후 뒤에 확인(공백,점도 포함)

        // 12. substring(beginIndex) : 시작위치부터 문자열 얻어내기
        // substring(beginIndex, endIndex) : 시작위치 ~ 끝위치까지 문자열 얻어내기(endIndex 미포함)
        System.out.println(str1.substring(10)); // Object
        System.out.println(str1.substring(5, 9)); // lang.(x) . = endIndex -> 출력값 lang(o)

        // 13. toLowerCase() / toUpperCase()
        System.out.println("abcdefg".toUpperCase()); // 소문자 >> 대문자
        System.out.println("AbcdEfg".toLowerCase()); // 대문자 >> 소문자

        // 14. trim() : 양 끝에 존재하는 공백 제거(중간 공백은 제거 안해줌)
        System.out.println("            JINIs World".trim());
        System.out.println("            JINIs                               World                         ".trim());
        System.out.println("            JINIs World                                             ".trim());

        // 15. valueOf(값) : 지정된 값을 문자열로 변환하여 반환
        String str4 = String.valueOf(5);
        // int i = 3; -> 문자열로 str4 = i + "";
        str4 = String.valueOf(10.3f);

    }

}
