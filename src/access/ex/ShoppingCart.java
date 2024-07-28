package access.ex;


public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount ++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        //이렇게 안하면 items가 배열이기때문에 전부 차지 않을 경우 null에 접근하게 될수 있음.
        for(int i = 0 ; i<itemCount; i++){
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for(int i = 0; i<itemCount; i++){
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
