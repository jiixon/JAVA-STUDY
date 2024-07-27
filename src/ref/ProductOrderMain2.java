package ref;


import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        /**
         * 상품명: 두부, 가격: 2000, 수량: 2
         * 상품명: 김치, 가격: 5000, 수량: 1
         * 상품명: 콜라, 가격: 1500, 수량: 2
         * 총 결제 금액: 12000
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);

    }

    static ProductOrder createOrder(String name, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = name;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static void printOrders(ProductOrder[] pArr) {
        for (ProductOrder p : pArr) {
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.price);
        }
    }

    static int getTotalAmount(ProductOrder[] pArr) {
        int sum = 0;
        for (ProductOrder p : pArr) {
            sum += p.price * p.quantity;
        }
        return sum;
    }
}
