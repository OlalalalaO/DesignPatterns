package factory_method;

public class CarFactory {

    public Car getCar(String car){
        if(car.equals("AutoMobile")){
            return new AutoMobile();
        }else if(car.equals("Motor")){
            return new Motor();
        }else{
            return null;
        }
    }
}
