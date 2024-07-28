package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        //public은 항상 접근 가능, 패키지 같으므로 default도 접근 가능
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}
