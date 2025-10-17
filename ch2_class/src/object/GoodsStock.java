package object;

public class GoodsStock {
    // 속성 : 상품명(p0001), 수량(10)
    String name;
    int amount;

    // 기본 생성자 -> 직접 명시 or 컴파일러 자동
    // GoodsStock() { : 직접 명시 -> 생성자가 아무것도 없을 때 가능

    // }

    public GoodsStock() {
    }

    public GoodsStock(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    // setter, getter 메서드

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override // 결과값 주소X 위해 toString
    public String toString() {
        return "GoodsStock [name=" + name + ", amount=" + amount + "]";
    }

}
