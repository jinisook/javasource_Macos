package util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        // 추가 : add
        set1.add("사과");
        set1.add("귤");
        set1.add("수박");
        set1.add("멜론");
        set1.add("키위");
        set1.add("배");
        set1.add("감");
        set1.add("감"); // 중복요소 저장X

        System.out.println(set1);

        // 삭제 : remove
        set1.remove("수박");
        System.out.println(set1);

        // 수정, 중간삽입 : (X)
        // set1.set() (X)

        // 전제조회
        for (String str : set1) {
            System.out.println(str);
        }

        // 특정 조회
        // set1.get() X
        Iterator<String> iterator = set1.iterator();
        // hasNext() : 다음에 가져올 객체가 있으면 true, 없으면 false
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }
    }

}
