import java.util.Scanner;

public class Week2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 1. Basic Calculator ===");
        System.out.print("Enter number1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter number2: ");
        double num2 = scanner.nextDouble();
        double add = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;
        System.out.printf("O/P => The addition, subtraction, multiplication, and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n\n",
                num1, num2, add, sub, mul, div);

        System.out.println("=== 2. Area of a Triangle ===");
        System.out.print("Enter base (in cm): ");
        double base = scanner.nextDouble();
        System.out.print("Enter height (in cm): ");
        double height = scanner.nextDouble();
        double areaCm = 0.5 * base * height;
        // Since 1 inch = 2.54 cm, 1 square inch = 2.54 * 2.54 square cm
        double areaIn = areaCm / (2.54 * 2.54);
        System.out.printf("O/P => The Area of the triangle in sq in is %.4f and sq cm is %.2f\n\n", areaIn, areaCm);

        System.out.println("=== 3. Side of a Square ===");
        System.out.print("Enter the perimeter: ");
        double perimeter = scanner.nextDouble();
        double side = perimeter / 4;
        System.out.printf("O/P => The length of the side is %.2f whose perimeter is %.2f\n\n", side, perimeter);

        System.out.println("=== 4. Distance Conversion ===");
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        double yards = distanceInFeet / 3.0;
        double miles = yards / 1760.0;
        System.out.printf("O/P => The distance in yards is %.4f while the distance in miles is %.6f\n\n", yards, miles);

        System.out.println("=== 5. Total Price Calculator ===");
        System.out.print("Enter unit price (INR): ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.printf("O/P => The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f\n\n",
                totalPrice, quantity, unitPrice);

        System.out.println("=== 6. Quotient and Remainder ===");
        System.out.print("Enter number1 (integer): ");
        int intNum1 = scanner.nextInt();
        System.out.print("Enter number2 (integer): ");
        int intNum2 = scanner.nextInt();
        int quotient = intNum1 / intNum2;
        int remainder = intNum1 % intNum2;
        System.out.printf("O/P => The Quotient is %d and Reminder is %d of two number %d and %d\n\n",
                quotient, remainder, intNum1, intNum2);

        System.out.println("=== 7. IntOperation ===");
        System.out.print("Enter integer a: ");
        int a = scanner.nextInt();
        System.out.print("Enter integer b: ");
        int b = scanner.nextInt();
        System.out.print("Enter integer c: ");
        int c = scanner.nextInt();
        int intOp1 = a + b * c;
        int intOp2 = a * b + c;
        int intOp3 = c + a / b;
        int intOp4 = a % b + c;
        // Note: The prompt asks for 3 operations in the hint but lists 4. I am printing all 4.
        System.out.printf("O/P => The results of Int Operations are %d, %d, %d, and %d\n\n",
                intOp1, intOp2, intOp3, intOp4);

        System.out.println("=== 8. DoubleOpt ===");
        System.out.print("Enter double a: ");
        double da = scanner.nextDouble();
        System.out.print("Enter double b: ");
        double db = scanner.nextDouble();
        System.out.print("Enter double c: ");
        double dc = scanner.nextDouble();
        double dOp1 = da + db * dc;
        double dOp2 = da * db + dc;
        double dOp3 = dc + da / db;
        double dOp4 = da % db + dc;
        System.out.printf("O/P => The results of Double Operations are %.2f, %.2f, %.2f, and %.2f\n\n",
                dOp1, dOp2, dOp3, dOp4);

        scanner.close();
    }
}