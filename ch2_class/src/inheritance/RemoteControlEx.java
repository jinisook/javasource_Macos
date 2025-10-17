package inheritance;

public class RemoteControlEx {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setVolume(15);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(7);
        RemoteControl.changeBattery();
        rc.setVolume(9);

        // 라디오를 클래스 없이
        // 익명 클래스 (이름 지정X) - 일회성
        rc = new RemoteControl() {
            private int volume;

            @Override
            public void turnOn() {
                System.out.println("Radio 를 켭니다");
            }

            @Override
            public void turnOff() {
                System.out.println("Radio 를 끕니다");
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
                System.out.println("현재 Radio 볼륨 : " + this.volume);
            }

        };

        rc.turnOn();
        rc.setVolume(8);
        rc.setMute(true);
        rc.turnOff();
    }

}
