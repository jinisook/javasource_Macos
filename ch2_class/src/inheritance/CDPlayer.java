package inheritance;

// 자식 - abstract 메소드 무조건
public class CDPlayer extends Player {
    // Override - 상속에서 자식 클래스가 부모 클래스 메서드 재정의
    int currentTrack;

    @Override
    void play(int pos) {
        System.out.println("CD Play");
    }

    @Override
    void stop() {
        System.out.println("CD Stop");
    }

    void nextTrack() {
        currentTrack++;
    }

    void prevTrack() {
        if (currentTrack > 1) {
            currentTrack--;
        }
    }

}
