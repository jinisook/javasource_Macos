package inheritance;

public class TV {
    // 속성 : 크기(52), 채널(7), 파워(true/false), 색상(black)
    int size;
    int channel;
    boolean power;
    String color;

    // 생성자 - 클래스 이름과 같으나 괄호를 가지고 있음

    // 생성자 4개 생성
    public TV(int size, int channel, boolean power, String color) {
        this.size = size;
        this.channel = channel;
        this.power = power;
        this.color = color;
    }

    @Override
    public String toString() {
        return "TV [size=" + size + ", channel=" + channel + ", power=" + power + ", color=" + color + "]"; // 문자열 반환하는
        // 메서드
        // 기능 : 채널변경, 전원 여부, 볼륨 조절
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setPower(boolean power) { // 타입 변수
        this.power = power; // this - 현재 클래스의 멤버 변수이거나 멤버 메서드 (위에), 괄호 안은 일반 변수 선언 - > 오른쪽 power
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void channelUp() {
        ++this.channel;
    }

    public void channelDown() {
        --this.channel;
    }

    public int getSize() {
        return size;
    }

    public int getChannel() {
        return channel;
    }

    public boolean isPower() { // boolean만 -> get X, is-
        return power;
    }

    public String getColor() {
        return color;
    }

}
