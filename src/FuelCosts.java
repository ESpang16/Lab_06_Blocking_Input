import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double gallonsOfGas;
        double fuelEfficiency;
        double gasPrice;
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            while (!in.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    in.next();
            }
            gallonsOfGas = in.nextDouble();
        } while (gallonsOfGas <= 0);
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();
            }
            fuelEfficiency = in.nextDouble();
        } while (fuelEfficiency <= 0);
        do {
            System.out.print("Enter the price of gas per gallon: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();
            }
            gasPrice =in.nextDouble();
        } while (gasPrice <= 0);
        double costPer100Miles = (100 / fuelEfficiency) * gasPrice;
        double maxDistance = gallonsOfGas * fuelEfficiency;
        System.out.printf("The cost to drive 100 miles is: $%.2f%n", costPer100Miles);
        System.out.printf("The car can go %.2f miles with a full tank.%n", maxDistance);


    }
}
