package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {
    public static void main(String[] args) {
        // 시스템 날짜와 시간 가져오기
        Date date = new Date();
        System.out.println(date); // Thu Oct 16 15:49:08 KST 2025

        // yyyy : year => 년도
        // MM : month => 월
        // mm : minute => 분
        // y,M,d,h,m,s 형식만 맞추면 됨
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); // 2025년 10월 16일 03시 53분 55초
        System.out.println(sdf.format(date));

    }

}
