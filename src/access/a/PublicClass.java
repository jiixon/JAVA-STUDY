package access.a;

public class PublicClass {
    //클래스의 접근제어자는 public, default(생략) 두 가지만 가능
    //public 클래스는 파일명과 이름 같아야 함.
    //하나의 자바 파일 -> 하나의 public 클래스 가능 (default는 무한)
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();

    }
}

class DefaultClass1 {

}

class DefaultClass2 {

}
