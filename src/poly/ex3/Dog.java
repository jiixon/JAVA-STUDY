package poly.ex3;

public class Dog extends AbstractAnimal{
    //추상메서드는 상속받는 자식클래스가 반드시 오버라이딩 해야함
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
