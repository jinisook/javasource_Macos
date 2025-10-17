package inheritance;

public class Television implements RemoteControl {
    // 상위에 멤버 변수 선언
    private int volume;

    // 추상 메서드 강제화
    @Override
    public void turnOn() {
        System.out.println("Television 를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Television 를 끕니다");

    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Television 볼륨 : " + this.volume);
    }

}
