package factory_method;

public class AutoMobile implements Car{

    @Override
    public void drive() {
        System.out.println("AutoMobile drive");
    }

    @Override
    public void stop() {
        System.out.println("AutoMobile stop");
    }
}
