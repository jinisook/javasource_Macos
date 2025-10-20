package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyShop2 implements IShop {
    private String title;
    // Product[] products = new Product[5];
    // 리스트 - 숫자 지정 안하면 10개를 담을 수 잇는 공간 생성
    List<Product> products = new ArrayList<>();

    // 장바구니
    // Product[] carts = new Product[5];
    List<Product> carts = new ArrayList<>();

    // User
    // User[] users = new User[2];
    List<User> users = new ArrayList<>();

    // 선택된 사용자 index 보관
    private int selUser;

    public void setTitle(String title) {
        this.title = title;
    }

    // 메뉴
    @Override
    public void start() {
        System.out.println(title + " : 메인 화면 - 계정 선택");
        System.out.println("=================================");
        int i = 0;
        for (User user : users) {
            System.out.printf("[%d]%s(%s)\n", i++, user.getName(), user.getPayType());
        }

        System.out.println("[x]종 료");
        System.out.print("선택 : ");

        // 선택된 user 정보 처리
        Scanner sc = new Scanner(System.in);
        String sel = sc.nextLine();
        switch (sel) {
            case "x":
            case "X":
                System.out.println("** 프로그램 종료 **");
                System.exit(i);
                break;

            default:
                selUser = Integer.parseInt(sel);
                break;
        }

        System.out.printf("## %s 선택 ##\n", sel);
        // sc.close();

        // 상품 출력 (메소드 호출)
        productList();
    }

    // 상품 출력
    @Override
    public void productList() {
        System.out.println(title + " : 상품 목록 - 상품 선택");
        System.out.println("=================================");
        int i = 0;
        for (Product product : products) {
            System.out.printf("[%d]", i);
            product.printDetail();
            i++;
        }
        System.out.println("[h] 메인 화면");
        System.out.println("[c] 체크아웃");
        Scanner sc = new Scanner(System.in);
        System.out.print("선택 : ");
        // 사용자 입력 : 상품번호, h, c
        String sel = sc.nextLine();
        System.out.printf("## %s 선택 ##\n", sel);

        // 상품번호 0 선택 시 => cart에 담기 (1. 비어있는 위치 찾기 2. 담기)
        // 상품번호 1 선택 시 => cart에 담기
        // 상품 목록 보여주기 => c 선택 => 결제 처리 메소드 호출
        // 상품 목록 보여주기 => h 선택 => 계정선택 화면

        switch (sel) {
            case "h":
                start();
                break;
            case "c":
                checkOut();
                break;

            default:
                int no = Integer.parseInt(sel);

                // for (int j = 0; j < carts.length; j++) {
                // if (carts[j] == null) {
                // carts[j] = products[no];
                // break;
                // }
                // }

                // list는 배열과 달리 null확인 안해도 append 개념
                carts.add(products.get(no)); // 하나 가져올 땐, get 사용

                // 상품 목록 보여주기
                productList();
                break;
        }
        // sc.close();
    }

    // 결제 처리
    @Override
    public void checkOut() {
        System.out.println(title + " : 체크아웃");
        System.out.println("=================================");
        int i = 0;
        int sum = 0;
        for (Product product : carts) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getName(), product.getPrice());
                sum += product.getPrice();
            }
        }
        System.out.println("=================================");
        // System.out.println("결제 방법 : " + users[selUser].getPayType());
        System.out.println("결제 방법 : " + users.get(selUser).getPayType());

        System.out.println("합계 : " + sum + " 원 입니다");
        System.out.println("[p] 이전, [q] 결제 완료");

        System.out.print("선택 : ");

        Scanner sc = new Scanner(System.in);
        String sel = sc.nextLine();
        switch (sel) {
            case "q":
                System.out.println("## 결제가 완료되었습니다. 종료합니다. ##");
                System.exit(0);
                break;
            case "p":
                productList();
                break;
            default:
                checkOut();
                break;
        }
    }

    // 사용자 등록
    @Override
    public void genUser() {
        // 두 명의 사용자 등록 -> 배열
        // users[0] = new User("토쿠노", PayType.CASH);
        // users[1] = new User("마에다", PayType.CARD);

        // list
        users.add(new User("토쿠노", PayType.CASH));
        users.add(new User("마에다", PayType.CARD));
    }

    // 상품 등록
    @Override
    public void genProduct() {
        // products[1] = new TV("삼성TV", 230000, "4K");
        // products[1] = new TV("LGTV", 244000, "4K");
        // products[2] = new CellPhone("갤럭시Z폴드", 120000, "U+");
        // products[3] =new CellPhone("아이폰16", 100000, "KT");
        // products[4] = new CellPhone("아이폰17프로", 220000, "SKT");

        // list
        products.add(new TV("삼성TV", 230000, "4K"));
        products.add(new TV("LGTV", 244000, "4K"));
        products.add(new CellPhone("갤럭시Z폴드", 120000, "U+"));
        products.add(new CellPhone("아이폰16", 100000, "KT"));
        products.add(new CellPhone("아이폰17프로", 220000, "SKT"));
    }

}
