package with;

import with.model.Car;

enum CarType{
    Normal,
    Luxury,
    Sports
}

public interface CarFactory {
    public Car getCar(CarType carType);
}

