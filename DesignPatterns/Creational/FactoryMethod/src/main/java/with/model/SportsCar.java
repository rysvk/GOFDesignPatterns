package with.model;

public class SportsCar implements Car{
    @Override
    public void showInterior(){
        System.out.println("-- A sports car with 2 seats and automatic controls\n");
    }

    @Override
    public void accelerate(){
        System.out.println("-- A sports car accelerates fast and makes a loud noise\n");
    }
}
