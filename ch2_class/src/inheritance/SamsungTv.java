package inheritance;

public class SamsungTv extends Product {

    public SamsungTv(int price) {
        super(price);

    }

    @Override
    public String toString() {
        return "SamsungTv";
    }
}
