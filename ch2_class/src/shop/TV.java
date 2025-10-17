package shop;

public class TV extends Product {

    private String resolution;

    public TV(String name, int price, String resolution) {
        super(name, price);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    void printExtra() {
        System.out.println("해상도 : " + resolution);

    }

}
