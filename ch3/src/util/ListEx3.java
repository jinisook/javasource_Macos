package util;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
    public static void main(String[] args) {
        // Member 객체를 List에 담기
        List<Member> list1 = new ArrayList<>();
        list1.add(new Member("tokuno12", "tokuno12", "토쿠노"));
        list1.add(new Member("tokuno13", "tokuno13", "토쿠노"));
        list1.add(new Member("tokuno14", "tokuno14", "토쿠노"));
        list1.add(new Member("tokuno15", "tokuno15", "토쿠노"));

        // 2번째 Member 조회
        Member member = list1.get(0);
        System.out.println("이름 " + member.getName());
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("아이디\t\t비밀번호\t이름");
        System.out.println("--------------------------------------");
        // 전체 Member 조회
        for (Member mem : list1) {
            System.out.printf("%s\t%s\t%s\n", mem.getId(), mem.getPassword(), mem.getName());

        }

        System.out.println();

        for (int i = 0; i < list1.size(); i++) {
            Member mem = list1.get(i);
            System.out.printf("%s\t%s\t%s\n", mem.getId(), mem.getPassword(), mem.getName());
        }
    }

}
