import java.util.Scanner;

/**
 * class to handles temperature conversion logic between Celsius and Fahrenheit.
 */
public class TemperatureConverter {

    static Scanner sc = new Scanner(System.in); //  scanner instance for input
    static double temp, converttemp; // temperature and converted temperature variables
    static char unit; // Variable to hold the unit of the input temperature

    /**
     *method to converts temperature based on user input and displays the result.
     */
    public static void temperatureConvert() {
        // prompt user for temperature  value
        System.out.println("\nEnter the temperature value: ");
        temp = sc.nextDouble(); // Get temperature input

        // prompt user for unit  value
        System.out.println("\nEnter the unit (C for Celsius, F for Fahrenheit): ");
        unit = sc.next().charAt(0); // Get unit input

        // condition apply based on user input
        if (unit == 'C' || unit == 'c') {
            // condition to convert Celsius to Fahrenheit
            converttemp = (temp * 9 / 5) + 32;
            System.out.printf("\n%.2f Celsius = %.2f Fahrenheit.%n", temp, converttemp);
        } else if (unit == 'F' || unit == 'f') {
            // condition to convert Fahrenheit to Celsius
            converttemp = (temp - 32) * 5 / 9;
            System.out.printf("\n%.2f Fahrenheit = %.2f Celsius.%n", temp, converttemp);
        } else {
            //  invalid input unit condition
            System.out.println("\nInvalid unit of measurement. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }
    }
}
