package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1); //parent instanceof Child => false

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2); //parent instanceof Child => true
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        //instanceof를 사용함과 동시에 변수선언 -> 인스턴스가 맞으면 직접 다운캐스팅코드 생략 가능
        if(parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            //Child child = (Child) parent;
            child.childMethod();
        }else {
            System.out.println("Child 인스턴스 아님");
        }
    }
    //instanceof
    //오른쪽 대상의 타입에 왼쪽의 인스턴스의 타입이 들어갈 수 있으면 true, 아니면 false
}
