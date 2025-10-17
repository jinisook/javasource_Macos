package exam;

public abstract class Calc {
    protected int a;
    protected int b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract int calculate();

}
