package object;

public class TimeEx {
    public static void main(String[] args) {
        Time time = new Time();

        // 시, 분, 초 지정 (멤버 변수를 초기화)
        // 1) 직접 지정 -> Time 클래스에 private 붙어서 X
        // 2) 생성자 - defalut 밖에 없어서 X

        // 3) 메서드
        time.setHour(25);
        time.setMinute(58);
        time.setSecond(59);

        System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());

    }

}
