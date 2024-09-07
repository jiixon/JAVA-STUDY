package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        //부모 변수가 부모 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); //parent
        poly.method(); //child.method
        //변수는 오버라이딩 X, 메서드는 오버라이딩

        //poly -> 타입은 Parent로 먼저 찾음
        //value는 Parent에서 찾음
        //method도 Parent에서 찾는데, Child가 오버라이딩 되어있기에 먼저 우선권을 가짐
        //부모-자식-손자 오버라이딩하면 더 하위자식인 손자의 메서드가 우선권을 가

        //정리
        //다형적 참조: 하나의 변수 타입으로 다양한 자식 인스턴스를 참조할 수 있는 기능
        //메서드 오버라이딩: 기존 기능을 하위 타입에서 새로운 기능으로 재정의
    }
}
