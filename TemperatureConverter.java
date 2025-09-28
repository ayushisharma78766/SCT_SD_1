import java.util.Scanner;

public class TemperatureConverter {

    // Conversion methods
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature value: ");
        double value = sc.nextDouble();

        double result = 0;
        switch (choice) {
            case 1: result = celsiusToFahrenheit(value); break;
            case 2: result = celsiusToKelvin(value); break;
            case 3: result = fahrenheitToCelsius(value); break;
            case 4: result = fahrenheitToKelvin(value); break;
            case 5: result = kelvinToCelsius(value); break;
            case 6: result = kelvinToFahrenheit(value); break;
            default: System.out.println("Invalid choice!"); return;
        }

        System.out.println("Converted Value: " + result);
        sc.close();
    }
}
