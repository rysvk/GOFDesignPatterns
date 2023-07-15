package with;

import with.model.Car;

import java.util.Scanner;

public class Console {
    public static void main(String args[]) {
        int choice = 0;
        Scanner s = new Scanner(System.in);

        do{
            System.out.println("Please select the following cars");
            System.out.println("1. Normal Car");
            System.out.println("2. Luxury Car");
            System.out.println("3. Sports Car");
            System.out.println("Other choice.  Quit");
            System.out.print("Enter your choice :");

            choice = s.nextInt();
            Car car=null;

            if(choice<1 || choice>3){
                choice=0;
                System.out.println("This was a demo of Factory Design Pattern");
                break;
            }

            if(choice==1){
                car = SimpleCarFactory.INSTANCE.getCar(CarType.Normal);
            } else if (choice ==2){
                car = SimpleCarFactory.INSTANCE.getCar(CarType.Luxury);
            } else if (choice ==3){
                car = SimpleCarFactory.INSTANCE.getCar(CarType.Sports);
            }

            car.showInterior();
            car.accelerate();

        }while(choice!=0);
    }
}
