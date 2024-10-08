package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); //x001 (부모는 자식을 담을 수 있지만, 자식은 부모를 담을 수 없음)
        //단 자식기능은 호출 할 수 없다. 컴파일 오류
        //poly.childMethod();

        //다운캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly;
        child.childMethod();

        //캐스팅 순서
        //Child child = (Child) poly; //다운캐스팅을 통해 부모타입을 자식타입으로 변환 후 대입 시도
        //Child child = (Child) x001 //참조값을 읽은 다음 자식타입으로 지정
        //Child child = x001 //최종 결과
    }
}