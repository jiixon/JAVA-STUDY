package poly.basic;

//다운 캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1; //다운캐스팅
        child1.childMethod(); //문제없음

        Parent parent2 = new Parent(); //부모타입으로 객체 생성 == 자식 인스턴스가 메모리에 존재하지 않음
        Child child2 = (Child) parent2; //그렇기 때문에 Child를 찾으려고 해도 없기 때문에 캐스팅오류발생(런타임 오류)
        child2.childMethod(); //불가능

        //다운캐스팅이 위험하고, 업캐스팅이 안전하다!
        //업캐스팅은 객체 생성시, 부모 타입이 함께 생성되기 때문에 안전
    }
}
