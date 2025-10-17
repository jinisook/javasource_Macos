package shop;

public abstract class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void printDetail() {
        System.out.println("제품명 : " + name);
        System.out.println("가격 : " + price);
        printExtra();
    }

    // 상품마다 추가되는 속성을 출력(해상도, 통신사 출력)
    abstract void printExtra();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
