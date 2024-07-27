package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        /**
         * 상품명: 두부, 가격: 2000, 수량: 2
         * 상품명: 김치, 가격: 5000, 수량: 1
         * 상품명: 콜라, 가격: 1500, 수량: 2
         * 총 결제 금액: 12000
         */
        ProductOrder[] products = new ProductOrder[3];

        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;
        products[0] = product1;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "김치";
        product2.price = 5000;
        product2.quantity = 1;
        products[1] = product2;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "콜라";
        product3.price = 1500;
        product3.quantity = 2;
        products[2] = product3;

        int sum = 0;
        for (ProductOrder p : products) {
            System.out.println("상품명: " + p.productName + ", 가격: " + p.price + ", 수량: " + p.quantity);
            sum += p.price * p.quantity;
        }
        System.out.println("총 결제 금액: " + sum);


    }
}
