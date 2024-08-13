package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); //재정의한 기능으로 호출

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}
