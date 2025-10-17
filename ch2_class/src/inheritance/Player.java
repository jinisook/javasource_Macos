package inheritance;

// 추상클래스 - 멤버변수, 일반 메소드({})도 가능
// 부모의 역할로만 사용
public abstract class Player {
    boolean pause;
    int currentPos;

    final int num = 0;

    public Player() {
    }

    public Player(boolean pause, int currentPos) {
        this.pause = pause;
        this.currentPos = currentPos;
    }

    abstract void play(int pos);

    abstract void stop();

    void pause() {
        if (pause) {
            pause = false;
            play(currentPos);
        } else {
            pause = true;
            stop();
        }
    }

}
