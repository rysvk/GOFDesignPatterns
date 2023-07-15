package with.model;

public class LuxuryCar implements Car{
    @Override
    public void showInterior(){
        System.out.println("-- A luxury car with 4 seats,\narm rests and entertainment units\n");
    }

    @Override
    public void accelerate(){
        System.out.println("-- A luxury car accelerates without making much noise\n");
    }
}
