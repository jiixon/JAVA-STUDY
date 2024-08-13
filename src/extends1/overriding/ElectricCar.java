package extends1.overriding;

public class ElectricCar extends Car {
    //자식 -> 부모 (즉, 부모는 누가 상속받았는지 모름)
    //자바 특징 : 다중 상속 불가 == extends는 하나만 선택가능
    public void charge() {
        System.out.println("충전합니다.");
    }

    @Override //메서드 오버라이딩: 부모의 기능을 자식이 재정의하는 것
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }
}
