package object;

public class TVEx {
    public static void main(String[] args) {
        // TV 클래스의 인스턴스 생성
        TV tv = new TV();
        System.out.println(tv); // new를 사용한 경우 변수명 찍을 시 주소가 뜸
        // TV@24d46ca6 에서 TV [size=0, channel=0, power=false, color=null]
        // 정수형 : 0, 실수형 : 0.0 논리형 : false, 문자형 : 빈문자
        // String ; null

        // tv.power = true; // 티비 전원을 키다
        tv.setPower(true); // => tv.power = true
        // tv.size = 48;
        tv.setSize(48);
        // tv.channel = 3;
        tv.setChannel(3);
        // tv.color = "black";
        tv.setColor("black");

        System.out.println(tv);

        TV tv2 = new TV();
        tv2.setPower(true);
        tv2.setChannel(7);
        tv2.setColor("white");
        tv2.setSize(40);

        // 채널 +
        tv2.channelUp(); // 채널 번호 - 8

        System.out.println(tv2);

    }

}
