package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); //상속받았기 때문에 move() 사용가능
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move(); //상속받았기 때문에 move() 사용가능
        gasCar.fillUp();
    }
}
