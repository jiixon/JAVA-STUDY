package poly.basic;

public class CastingMain5 {
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
        if(parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }else {
            System.out.println("Child 인스턴스 아님");
        }
    }
    //instanceof
    //오른쪽 대상의 타입에 왼쪽의 인스턴스의 타입이 들어갈 수 있으면 true, 아니면 false
}
