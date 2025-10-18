package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        // 리스트 생성
        List<String> list1 = new ArrayList<>(30); // 부모 = 자식, 더 많이 사용 / 처음에 괄호안에 기본값 넣기 가능(공간)
        ArrayList<String> list2 = new ArrayList<>(30); // 자식 = 자식
        List<String> list3 = List.of("사과", "포도", "딸기", "수박"); // add/remove 수정 불가
        // 배열로 리스트 생성
        String[] fruits = { "사과", "포도", "딸기", "수박" }; // 뒤에 추가 불가(배열) -> add/remove 수정 불가
        List<String> list4 = Arrays.asList(fruits);

        list1.add("사과");
        list2.add("사과");
        // list3.add("바나나"); // UnsupportedOperationException : 뒤에 추가 불가
        // list4.add("바나나"); // UnsupportedOperationException : 뒤에 추가 불가
        // list4.remove(0); // UnsupportedOperationException : 삭제 불가 -> 변경 불가
        // List.of / Arrays.asList() 수정 불가
        // -> new를 작성해야 수정 가능

        String[] fruits2 = { "사과", "포도", "딸기", "수박" }; // 뒤에 추가 불가(배열) -> add/remove 수정 불가
        List<String> list5 = new ArrayList<>(Arrays.asList(fruits2));
        list5.add("바나나");

        List<String> list6 = new ArrayList<>(List.of("사과", "포도", "딸기", "수박"));
        list6.add("바나나");

    }

}
