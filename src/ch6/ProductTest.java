package ch6;

class Product {
    static int count = 0; //생성된 인스턴스의 수를 저장하기 위한 변수
    int serialNo; //인스턴스 고유번호
    {
        ++count; //Product인스턴스가 생성될 때마다 count의 값 1씩 증가
        serialNo = count;  //serialNo에 count 값 저장
    }
    public Product(){} //기본생성자, 생략가능
}
class ProductTest{
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 제품번호(serial no)는 "+p1.serialNo);
        System.out.println("p2의 제품번호(serial no)는 "+p2.serialNo);
        System.out.println("p3의 제품번호(serial no)는 "+p3.serialNo);

    }
}
