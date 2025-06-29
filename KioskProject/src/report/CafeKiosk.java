package report;


import java.util.Scanner;

public class CafeKiosk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu[] menus = {
                new Menu("아메리카노", 3000),
                new Menu("카페라떼", 3500),
                new Menu("바닐라라떼", 3800)
        };

        Cart cart = new Cart();

        System.out.println("=== " + Menu.CAFE_NAME + " 키오스크 ===");
        while (true) {
            System.out.println("\n[메뉴 선택]");
            for (int i = 0; i < menus.length; i++) {
                System.out.println((i + 1) + ". " + menus[i].name + " - " + menus[i].price + "원");
            }
            System.out.println("0. 결제하기");

            System.out.print("선택: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                break;
            } else if (choice >= 1 && choice <= menus.length) {
                cart.addItem(menus[choice - 1]);
                System.out.println(menus[choice - 1].name + " 담았습니다.");
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        cart.showCart();
        System.out.println("오늘 주문한 총 메뉴 수: " + Menu.count + "개");
        sc.close();
    }
}
