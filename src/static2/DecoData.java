package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;
    //클래스 내부 기능 사용시 -> 정적 메서드는 'static'만 사용할 수 있고, 인스턴스 변수/인스턴스 메서드 사용 불가
    //반대로 모든 곳에서 'static' 호출 가능 (공용 기능 이니까)

    public static void staticCall() {
        //instanceValue++; //인스턴스 변수 접근, compile error
        //instanceMethod(); //인스턴스 메서드 접근, compile error

        staticValue++; //정적변수 접근
        staticMethod(); //정적메서드 접근
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적변수 접근
        staticMethod(); //정적메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
