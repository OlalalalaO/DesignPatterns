package factory_method;


public class Motor implements Car {
    public void drive() {
        System.out.println("Motor drive");
    }

    public void stop() {
        System.out.println("Motor stop");
    }
}
