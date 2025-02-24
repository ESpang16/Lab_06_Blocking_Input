import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean done = false;
        String trash;
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                if (width > 0) {
                    done = true;
                } else {
                    System.out.println("Width must be a positive number.");
                }
            } else {
                trash = in.next();
                System.out.println("Invalid input. You entered: " + trash);
            }
            } while (!done);
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                if (height > 0) {
                    done = true; // Valid input
                } else {
                    System.out.println("Height must be a positive number.");
                    done = false;
                }
            } else {
                trash = in.next(); // Consume invalid input
                System.out.println("Invalid input. You entered: " + trash);
                done = false;
            }
        } while (!done);
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));
        System.out.printf("\nRectangle Dimensions: %.2f x %.2f%n", width, height);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Diagonal Length: %.2f%n", diagonal);

    }
}
