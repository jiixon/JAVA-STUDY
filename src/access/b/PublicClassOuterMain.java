package access.b;


import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        //public은 항상 접근 가능, 패키지 다르므로 default도 접근 블가능
        PublicClass publicClass = new PublicClass();

        //efaultClass1 class1 = new DefaultClass1();
        //DefaultClass2 class2 = new DefaultClass2();
    }
}
