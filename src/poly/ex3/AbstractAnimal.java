package poly.ex3;

public abstract class AbstractAnimal {
    //추상메서드가 하나라도 있는 클래스는 추상클래스로 선언해야함
    public abstract void sound();

    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
