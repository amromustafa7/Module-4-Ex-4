import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the side length of the hexagon
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Calculate
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);

        // Show the result
        System.out.printf("The area of the hexagon is %.2f\n", area);

        // Close
        input.close();
    }
}
