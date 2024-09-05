package poly.overriding;

public class Child extends Parent {
    public String value = "child";

    //메서드 오버라이딩의 중요한점 -> 오버라이드된 메서드가 우선순위를 가진다
    @Override
    public void method(){
        System.out.println("Child.method");
    }

}
