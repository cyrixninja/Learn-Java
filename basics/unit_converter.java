/*
 * Unit Converter in Java
 */
package basics;
import java.util.Scanner;

public class unit_converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Full Unit Converter!");
        System.out.println("1. Inches to Centimeters");
        System.out.println("2. Centimeters to Inches");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Miles to Kilometers");
        System.out.println("6. Kilometers to Miles");
        System.out.println("7. Pounds to Kilograms");
        System.out.println("8. Kilograms to Pounds");
        System.out.println("9. Ounces to Grams");
        System.out.println("10. Grams to Ounces");
        System.out.println("11. Gallons to Liters");
        System.out.println("12. Liters to Gallons");
        System.out.println("13. Fahrenheit to Celsius");
        System.out.println("14. Celsius to Fahrenheit");
        System.out.println("15. Square Inches to Square Centimeters");
        System.out.println("16. Square Centimeters to Square Inches");
        System.out.println("17. Square Feet to Square Meters");
        System.out.println("18. Square Meters to Square Feet");
        System.out.println("19. Acres to Square Meters");
        System.out.println("20. Square Meters to Acres");
        System.out.println("21. Miles per Hour to Kilometers per Hour");
        System.out.println("22. Kilometers per Hour to Miles per Hour");
        System.out.println("23. Days to Hours");
        System.out.println("24. Hours to Minutes");
        System.out.println("25. Minutes to Seconds");
        System.out.println("26. Bytes to Kilobytes");
        System.out.println("27. Kilobytes to Megabytes");
        System.out.println("28. Megabytes to Gigabytes");
        System.out.println("29. Gigabytes to Terabytes");
        System.out.println("30. Exit");

        int choice;
        do {
            System.out.print("Enter your choice (1-30): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertInchesToCentimeters();
                    break;
                case 2:
                    convertCentimetersToInches();
                    break;
                case 3:
                    convertFeetToMeters();
                    break;
                case 4:
                    convertMetersToFeet();
                    break;
                case 5:
                    convertMilesToKilometers();
                    break;
                case 6:
                    convertKilometersToMiles();
                    break;
                case 7:
                    convertPoundsToKilograms();
                    break;
                case 8:
                    convertKilogramsToPounds();
                    break;
                case 9:
                    convertOuncesToGrams();
                    break;
                case 10:
                    convertGramsToOunces();
                    break;
                case 11:
                    convertGallonsToLiters();
                    break;
                case 12:
                    convertLitersToGallons();
                    break;
                case 13:
                    convertFahrenheitToCelsius();
                    break;
                case 14:
                    convertCelsiusToFahrenheit();
                    break;
                case 15:
                    convertSquareInchesToSquareCentimeters();
                    break;
                case 16:
                    convertSquareCentimetersToSquareInches();
                    break;
                case 17:
                    convertSquareFeetToSquareMeters();
                    break;
                case 18:
                    convertSquareMetersToSquareFeet();
                    break;
                case 19:
                    convertAcresToSquareMeters();
                    break;
                case 20:
                    convertSquareMetersToAcres();
                    break;
                case 21:
                    convertMilesPerHourToKilometersPerHour();
                    break;
                case 22:
                    convertKilometersPerHourToMilesPerHour();
                    break;
                case 23:
                    convertDaysToHours();
                    break;
                case 24:
                    convertHoursToMinutes();
                    break;
                case 25:
                    convertMinutesToSeconds();
                    break;
                case 26:
                    convertBytesToKilobytes();
                    break;
                case 27:
                    convertKilobytesToMegabytes();
                    break;
                case 28:
                    convertMegabytesToGigabytes();
                    break;
                case 29:
                    convertGigabytesToTerabytes();
                    break;
                case 30:
                    System.out.println("Exiting the Full Unit Converter. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 30.");
            }
        } while (choice != 30);

        scanner.close();
    }


    private static void convertInchesToCentimeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in inches: ");
        double inches = scanner.nextDouble();
        double centimeters = inches * 2.54;
        System.out.println(inches + " inches is equal to " + centimeters + " centimeters.\n");
    }

    private static void convertCentimetersToInches() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in centimeters: ");
        double centimeters = scanner.nextDouble();
        double inches = centimeters / 2.54;
        System.out.println(centimeters + " centimeters is equal to " + inches + " inches.\n");
    }

    private static void convertFeetToMeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in feet: ");
        double feet = scanner.nextDouble();
        double meters = feet * 0.3048;
        System.out.println(feet + " feet is equal to " + meters + " meters.\n");
    }

    private static void convertMetersToFeet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in meters: ");
        double meters = scanner.nextDouble();
        double feet = meters / 0.3048;
        System.out.println(meters + " meters is equal to " + feet + " feet.\n");
    }

    private static void convertMilesToKilometers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();
        double kilometers = miles * 1.60934;
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.\n");
    }

    private static void convertKilometersToMiles() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        double miles = kilometers / 1.60934;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.\n");
    }

    private static void convertPoundsToKilograms() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();
        double kilograms = pounds * 0.453592;
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.\n");
    }

    private static void convertKilogramsToPounds() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        double kilograms = scanner.nextDouble();
        double pounds = kilograms / 0.453592;
        System.out.println(kilograms + " kilograms is equal to " + pounds + " pounds.\n");
    }

    private static void convertOuncesToGrams() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in ounces: ");
        double ounces = scanner.nextDouble();
        double grams = ounces * 28.3495;
        System.out.println(ounces + " ounces is equal to " + grams + " grams.\n");
    }

    private static void convertGramsToOunces() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in grams: ");
        double grams = scanner.nextDouble();
        double ounces = grams / 28.3495;
        System.out.println(grams + " grams is equal to " + ounces + " ounces.\n");
    }

    private static void convertGallonsToLiters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter volume in gallons: ");
        double gallons = scanner.nextDouble();
        double liters = gallons * 3.78541;
        System.out.println(gallons + " gallons is equal to " + liters + " liters.\n");
    }

    private static void convertLitersToGallons() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter volume in liters: ");
        double liters = scanner.nextDouble();
        double gallons = liters / 3.78541;
        System.out.println(liters + " liters is equal to " + gallons + " gallons.\n");
    }

    private static void convertFahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.\n");
    }

    private static void convertCelsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.\n");
    }

private static void convertSquareInchesToSquareCentimeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area in square inches: ");
        double squareInches = scanner.nextDouble();
        double squareCentimeters = squareInches * 6.4516;
        System.out.println(squareInches + " square inches is equal to " + squareCentimeters + " square centimeters.\n");
    }

    private static void convertSquareCentimetersToSquareInches() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area in square centimeters: ");
        double squareCentimeters = scanner.nextDouble();
        double squareInches = squareCentimeters / 6.4516;
        System.out.println(squareCentimeters + " square centimeters is equal to " + squareInches + " square inches.\n");
    }

    private static void convertSquareFeetToSquareMeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area in square feet: ");
        double squareFeet = scanner.nextDouble();
        double squareMeters = squareFeet / 10.764;
        System.out.println(squareFeet + " square feet is equal to " + squareMeters + " square meters.\n");
    }

    private static void convertSquareMetersToSquareFeet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area in square meters: ");
        double squareMeters = scanner.nextDouble();
        double squareFeet = squareMeters * 10.764;
        System.out.println(squareMeters + " square meters is equal to " + squareFeet + " square feet.\n");
    }

    private static void convertAcresToSquareMeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area in acres: ");
        double acres = scanner.nextDouble();
        double squareMeters = acres * 4046.86;
        System.out.println(acres + " acres is equal to " + squareMeters + " square meters.\n");
    }

    private static void convertSquareMetersToAcres() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter area in square meters: ");
        double squareMeters = scanner.nextDouble();
        double acres = squareMeters / 4046.86;
        System.out.println(squareMeters + " square meters is equal to " + acres + " acres.\n");
    }

    private static void convertMilesPerHourToKilometersPerHour() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed in miles per hour: ");
        double milesPerHour = scanner.nextDouble();
        double kilometersPerHour = milesPerHour * 1.60934;
        System.out.println(milesPerHour + " miles per hour is equal to " + kilometersPerHour + " kilometers per hour.\n");
    }

    private static void convertKilometersPerHourToMilesPerHour() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed in kilometers per hour: ");
        double kilometersPerHour = scanner.nextDouble();
        double milesPerHour = kilometersPerHour / 1.60934;
        System.out.println(kilometersPerHour + " kilometers per hour is equal to " + milesPerHour + " miles per hour.\n");
    }

    private static void convertDaysToHours() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in days: ");
        double days = scanner.nextDouble();
        double hours = days * 24;
        System.out.println(days + " days is equal to " + hours + " hours.\n");
    }

    private static void convertHoursToMinutes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in hours: ");
        double hours = scanner.nextDouble();
        double minutes = hours * 60;
        System.out.println(hours + " hours is equal to " + minutes + " minutes.\n");
    }

    private static void convertMinutesToSeconds() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in minutes: ");
        double minutes = scanner.nextDouble();
        double seconds = minutes * 60;
        System.out.println(minutes + " minutes is equal to " + seconds + " seconds.\n");
    }

    private static void convertBytesToKilobytes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data size in bytes: ");
        double bytes = scanner.nextDouble();
        double kilobytes = bytes / 1024;
        System.out.println(bytes + " bytes is equal to " + kilobytes + " kilobytes.\n");
    }

    private static void convertKilobytesToMegabytes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data size in kilobytes: ");
        double kilobytes = scanner.nextDouble();
        double megabytes = kilobytes / 1024;
        System.out.println(kilobytes + " kilobytes is equal to " + megabytes + " megabytes.\n");
    }

    private static void convertMegabytesToGigabytes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data size in megabytes: ");
        double megabytes = scanner.nextDouble();
        double gigabytes = megabytes / 1024;
        System.out.println(megabytes + " megabytes is equal to " + gigabytes + " gigabytes.\n");
    }

    private static void convertGigabytesToTerabytes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter data size in gigabytes: ");
        double gigabytes = scanner.nextDouble();
        double terabytes = gigabytes / 1024;
        System.out.println(gigabytes + " gigabytes is equal to " + terabytes + " terabytes.\n");
    }
}