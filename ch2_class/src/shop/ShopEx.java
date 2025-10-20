package shop;

public class ShopEx {
    public static void main(String[] args) {

        // TV tv = new TV("삼성TV", 230000, "4K"); // 상품 등록
        // 속성 초기화 1. 생성자 2. setter 메소드
        // tv.name = ""; -> private 때문에 X

        // TV[] tvs = new TV[3];
        // tvs[0] = new TV("삼성TV", 230000, "4K");

        // Product, 자식객체
        // Product[] products = new Product[5];
        // products[0] = new TV("삼성TV", 230000, "4K");
        // products[1] = new TV("LGTV", 244000, "4K");
        // products[2] = new CellPhone("갤럭시Z폴드", 120000, "U+");
        // products[3] = new CellPhone("아이폰16", 100000, "KT");
        // products[4] = new CellPhone("아이폰17프로", 220000, "SKT");

        // for (Product product : products) {
        // product.printDetail();
        // }

        // User user = new User("이름이", PayType.CARD);

        // MyShop myShop = new MyShop(); // MyShop - 배열
        MyShop2 myShop = new MyShop2();
        // 이름 지정
        myShop.setTitle("wish shop");
        // 사용자 등록
        myShop.genUser();
        // 상품 등록
        myShop.genProduct();
        myShop.start();

    }

}
