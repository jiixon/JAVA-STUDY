package access.a;

public class AccessData {
    private int privateField;
    int defaultField;
    public int publicField;

    private void privateMethod(){
        System.out.println("privateMethod 호출 " + privateField);
    }

    void defaultMethod(){
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    public void publicMethod(){
        System.out.println("publicMethod 호출 " + publicField);
    }

    public void innerAccess(){
        System.out.println("내부 호출");
        privateField = 100;
        defaultField = 200;
        publicField = 300;
        privateMethod();
        defaultMethod();
        publicMethod();
    }

}
