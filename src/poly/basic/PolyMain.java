package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); //부모는 자식을 담을 수 있음
        poly.parentMethod();

        //Child child1 = new Parent(); // 자식은 부모를 담을 수 없음
        //poly.childMethod(); //자식의 기능을 호출 할 수 없음. 컴파일 오류 발생 -> 다형적 참조의 한계(자식 방향으로 내려갈 수 없기 때문에 찾을 수 없음)
        //-> 해결 방법: 캐스팅
    }
}
