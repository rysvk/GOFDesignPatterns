package with.model;

public class NormalCar implements Car{
    @Override
    public void showInterior(){
        System.out.println("-- A normal car with 4 seats\n");
    }

    @Override
    public void accelerate(){
        System.out.println("-- A normal car accelerates and makes some noise\n");
    }
}
