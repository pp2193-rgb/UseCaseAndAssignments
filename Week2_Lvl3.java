import java.util.Scanner;

public class Week2_Lvl3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // === 1. Celsius to Fahrenheit ===
        System.out.println("=== 1. Celsius to Fahrenheit ===");
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheitResult = (celsius * 9 / 5) + 32;
        System.out.printf("O/P => The %.2f celsius is %.2f fahrenheit\n\n", celsius, fahrenheitResult);

        // === 2. Fahrenheit to Celsius ===
        System.out.println("=== 2. Fahrenheit to Celsius ===");
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        System.out.printf("O/P => The %.2f fahrenheit is %.2f celsius\n\n", fahrenheit, celsiusResult);

        // === 3. Total Income ===
        System.out.println("=== 3. Total Income ===");
        System.out.print("Enter salary (INR): ");
        double salary = scanner.nextDouble();
        System.out.print("Enter bonus (INR): ");
        double bonus = scanner.nextDouble();
        double income = salary + bonus;
        System.out.printf("O/P => The salary is INR %.2f and bonus is INR %.2f. Hence Total Income is INR %.2f\n\n", salary, bonus, income);

        // Clear the scanner buffer before reading strings
        scanner.nextLine();

        // === 4. Travel Distance and Time ===
        System.out.println("=== 4. Travel Distance and Time ===");
        System.out.print("Enter traveler's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter starting city (fromCity): ");
        String fromCity = scanner.nextLine();
        System.out.print("Enter via city (viaCity): ");
        String viaCity = scanner.nextLine();
        System.out.print("Enter destination city (toCity): ");
        String toCity = scanner.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = scanner.nextDouble();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = scanner.nextDouble();

        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " (in minutes): ");
        double timeFromToVia = scanner.nextDouble();
        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " (in minutes): ");
        double timeViaToFinalCity = scanner.nextDouble();

        double totalDistanceMiles = fromToVia + viaToFinalCity;
        double totalDistanceKm = totalDistanceMiles * 1.60934; // Converting miles to km
        double totalTimeMinutes = timeFromToVia + timeViaToFinalCity;

        System.out.printf("O/P => The Total Distance travelled by %s from %s to %s via %s is %.2f km and the Total Time taken is %.2f minutes\n\n",
                name, fromCity, toCity, viaCity, totalDistanceKm, totalTimeMinutes);

        // === 5. Swap Two Numbers ===
        System.out.println("=== 5. Swap Two Numbers ===");
        System.out.print("Enter number1: ");
        double swapNum1 = scanner.nextDouble();
        System.out.print("Enter number2: ");
        double swapNum2 = scanner.nextDouble();

        double temp = swapNum1;
        swapNum1 = swapNum2;
        swapNum2 = temp;

        System.out.printf("O/P => The swapped numbers are %.2f and %.2f\n\n", swapNum1, swapNum2);

        // === 6. Athlete Triangle Park ===
        System.out.println("=== 6. Athlete Triangle Park ===");
        System.out.print("Enter side1 (in meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2 (in meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side3 (in meters): ");
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;
        // 5 km is 5000 meters. Number of rounds is total distance / perimeter
        double rounds = 5000.0 / perimeter;

        System.out.printf("O/P => The total number of rounds the athlete will run is %.2f to complete 5 km\n\n", rounds);

        // === 7. Divide Chocolates ===
        System.out.println("=== 7. Divide Chocolates ===");
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = scanner.nextInt();

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        System.out.printf("O/P => The number of chocolates each child gets is %d and the number of remaining chocolates are %d\n\n", chocolatesPerChild, remainingChocolates);

        // === 8. Simple Interest ===
        System.out.println("=== 8. Simple Interest ===");
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.printf("O/P => The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f\n\n", simpleInterest, principal, rate, time);

        // === 9. Pounds to Kilograms ===
        System.out.println("=== 9. Pounds to Kilograms ===");
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        // Correct conversion: 1 kg = 2.20462 pounds -> 1 pound = 1 / 2.20462 kg
        double weightInKg = weightInPounds / 2.20462;

        System.out.printf("O/P => The weight of the person in pounds is %.2f and in kg is %.2f\n\n", weightInPounds, weightInKg);

        // === 10. Handshakes ===
        System.out.println("=== 10. Maximum Handshakes ===");
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Using the formula n * (n - 1) / 2
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.printf("O/P => The maximum number of possible handshakes is %d\n\n", maxHandshakes);

        scanner.close();
    }
}