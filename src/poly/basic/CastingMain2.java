package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); //x001 (부모는 자식을 담을 수 있지만, 자식은 부모를 담을 수 없음)
        //단 자식기능은 호출 할 수 없다. 컴파일 오류
        //poly.childMethod();

        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅 (poly의 타입이 바뀐 것은 아니다)
        ((Child) poly).childMethod(); //연산자 우산순위로 인해 () 해줘야함
    }
}