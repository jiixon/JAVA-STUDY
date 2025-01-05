package poly.ex5;

public interface InterfaceAnimal {
    void sound(); //public abstract이 포함되어 있음
    void move();

    //인터페이스의 멤버 변수
    //public, static, final이 모두 포함되었다고 가정
    //인터페이스는 다중 구현 가능
    //추상메서드로만 있는 순수추상클래스 == 인터페이스
}
