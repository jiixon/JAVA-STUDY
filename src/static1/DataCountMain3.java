package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);
        //static변수는 메서드영역으로 접근 가능해서 Data3에 접근할수 있음

        //추가
        //클래스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println("D count = " + Data3.count);


        //인스턴스를 통한 접근
        System.out.println("D count = " + data4.count); //권장하지 않음 -> 클래스를 통한 접근이 명확하기 때문
    }
}
