package poly.ex4;

public abstract class AbstractAnimal {
    public abstract void sound();

    public abstract void move();

    //순수 추상클래스
    //실행 로직을 전혀 가지고 있지 않고, 다형성을 위한 부모 타입으로써 껍데기 역할만 제공
    //인스턴스를 생성할 수 없다
    //상속시 자식은 모든 메서드를 오버라이딩 해야한다
    //주로 다형성을 위해 사용된다
}
