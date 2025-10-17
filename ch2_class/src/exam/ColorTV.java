package exam;

public class ColorTV extends TV {

    private int color;

    public ColorTV(int size) { // 생성자
        super(size);
    }

    public ColorTV(int size, int color) { // 생성자
        super(size);
        this.color = color;
    }

    public void printProperty() { // 메소드

        System.out.println(super.getSize() + "인치 " + this.color + "컬러");

    }
}
