package without;

import without.model.LuxuryCar;
import without.model.NormalCar;
import without.model.SportsCar;

import java.util.Scanner;

public class Console {
    public static void main(String args[]){
        int choice =0;
        Scanner s = new Scanner(System.in);

        do{
            System.out.println("Please select the following cars");
            System.out.println("1. Normal Car");
            System.out.println("2. Luxury Car");
            System.out.println("3. Sports Car");
            System.out.println("Other choice.  Quit");
            System.out.print("Enter your choice :");

            choice = s.nextInt();

            if(choice==1){
                NormalCar normalCar = new NormalCar();
                normalCar.showInterior();
                normalCar.accelerate();
            } else if (choice ==2){
                LuxuryCar luxuryCar = new LuxuryCar();
                luxuryCar.showInterior();
                luxuryCar.accelerate();
            } else if (choice ==3){
                SportsCar sportsCar = new SportsCar();
                sportsCar.showInterior();
                sportsCar.accelerate();
            } else {
                choice=0;
                System.out.println("This was a demo without Factory Design Pattern");
            }
        }while(choice!=0);
    }
}
