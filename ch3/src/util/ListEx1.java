package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        String[] str1 = { "" };
        List<String> list1 = new ArrayList<>();
        // 추가할 때는 add 메소드 사용 => append와 같은 개념 (원본변경O)
        list1.add("사과");
        list1.add("귤");
        list1.add("수박");
        list1.add("멜론");
        list1.add("키위");
        list1.add("배");
        list1.add("감");

        System.out.println(list1);
        System.out.println(list1.get(3)); // 순서(배열)가 있어서 index 지정 가능

        System.out.println("리스트 요소 개수 " + list1.size());

        // remove
        list1.remove(0); // index -> 위치
        System.out.println(list1);
        list1.remove("수박"); // String 자체 넣어도 가능
        System.out.println(list1);

        // 특정 위치의 요소값 변경
        list1.set(0, "포도"); // 0번자리를 포도로 '변경'
        System.out.println(list1);

        // 중간 삽입
        list1.add(2, "딸기"); // 2번 뒤에 딸기 '삽입' -> 중간 삽입
        System.out.println(list1);

        for (String string : list1) { // list1에 있는 것을 string에 하나씩 담아주는 작업
            System.out.println(string);
        }

        list1.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println(list1);

    }

}
