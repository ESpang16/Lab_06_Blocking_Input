import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        boolean done = false;
        String trash;
        do {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("The equivalent temperature in Fahrenheit is: " + fahrenheit + "°F");
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nYou said your temperature was: " + trash);
                System.out.println("Invalid input! Please enter a valid numeric value for temperature.");
            }
        }while (!done) ;
    }
}
