package with;

import with.model.Car;
import with.model.LuxuryCar;
import with.model.NormalCar;
import with.model.SportsCar;

public class SimpleCarFactory implements CarFactory{
    public static final CarFactory INSTANCE= new SimpleCarFactory();

    public Car getCar(CarType carType){
        if(carType == CarType.Normal)
            return new NormalCar();
        else if(carType == CarType.Luxury)
            return new LuxuryCar();
        else if(carType == CarType.Sports)
            return new SportsCar();
        else
            return null;
    }
}