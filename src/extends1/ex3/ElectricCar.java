package extends1.ex3;

public class ElectricCar extends Car {
    //자식 -> 부모 (즉, 부모는 누가 상속받았는지 모름)
    //자바 특징 : 다중 상속 불가 == extends는 하나만 선택가능
    public void charge() {
        System.out.println("충전합니다.");
    }
}
