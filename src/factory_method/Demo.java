package factory_method;

public class Demo {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar("AutoMobile");
        car.drive();
        car.stop();
        Car motor = carFactory.getCar("Motor");
        motor.drive();
        motor.stop();
    }
}
