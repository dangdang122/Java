package report;
public class Cart {
    Menu[] cartItems = new Menu[10]; // 최대 10개 담을 수 있음
    int index = 0;

    public void addItem(Menu item) {
        if (index < cartItems.length) {
            cartItems[index] = item;
            index++;
        } else {
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }
    public int getItemCount() {
        return index;
    }
    public void showCart() {
        System.out.println("=== 장바구니 목록 ===");
        if (index == 0) {
            System.out.println("장바구니가 비어 있습니다.");
            return;
        }

        int total = 0;
        for (int i = 0; i < index; i++) {
            if (cartItems[i] != null) {
                System.out.println(cartItems[i].name + " - " + cartItems[i].price + "원");
                total += cartItems[i].price;
            }
        }
        System.out.println("총 결제 금액: " + total + "원");
    }
}
