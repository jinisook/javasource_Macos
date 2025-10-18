package util;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add(new Member("tokuno12", "tokuno12", "토쿠노"));
        set.add(new Member("tokuno13", "tokuno13", "토쿠노"));
        set.add(new Member("tokuno14", "tokuno14", "토쿠노"));
        set.add(new Member("tokuno12", "tokuno12", "토쿠노"));

        for (Member member : set) {
            System.out.println(member);
        }
    }

}
