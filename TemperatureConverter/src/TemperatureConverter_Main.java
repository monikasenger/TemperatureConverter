import java.util.Scanner;

/**
 * starting point of  Temperature Converter application.
 * condition to allows users to perform multiple temperature conversions.
 */
public class TemperatureConverter_Main {
    public static void main(String[] args) {
        // initialize scanner for user input
        Scanner sc = new Scanner(System.in);

        // create an instance of the TemperatureConverter class
        TemperatureConverter temp = new TemperatureConverter();

        char ans; // to store user's response for contiue the loop

        System.out.println("\n*************** TEMPERATURE CONVERTER ***************");

        // loop to allow multiple conversions
        do {
            temp.temperatureConvert(); // call the temperature conversion method by object
            System.out.println("\nDo you want to convert another temperature? (Y/N): ");
            ans = sc.next().charAt(0); // prompt user's response
        } while (ans == 'y' || ans == 'Y'); // continue if user inputs 'Y' or 'y'

        System.out.println("\nThank you for using the Temperature Converter! :)");
    }
}
