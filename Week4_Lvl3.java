import java.util.Scanner;

public class Week4_Lvl3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // === 1 & 2. Leap Year (Multiple if-else & Single Logical if) ===
        System.out.println("=== 1 & 2. Leap Year Checker ===");
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        if (year >= 1582) {
            // Part 1: Multiple if-else statements
            boolean isLeapMultiple = false;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeapMultiple = true;
                    } else {
                        isLeapMultiple = false;
                    }
                } else {
                    isLeapMultiple = true;
                }
            }

            // Part 2: Single if condition with logical operators (&&, ||)
            boolean isLeapSingle = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            System.out.println("Result using multiple if-else: " + (isLeapMultiple ? "Leap Year" : "Not a Leap Year"));
            System.out.println("Result using single condition: " + (isLeapSingle ? "Leap Year" : "Not a Leap Year"));
        } else {
            System.out.println("Year must be >= 1582 (Gregorian calendar).");
        }
        System.out.println();

        // === 3. Marks, Percentage, and Grade ===
        System.out.println("=== 3. Grade Calculator ===");
        System.out.print("Enter Physics marks: ");
        double physics = scanner.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double chemistry = scanner.nextDouble();
        System.out.print("Enter Maths marks: ");
        double maths = scanner.nextDouble();

        double totalMarks = physics + chemistry + maths;
        double percentage = totalMarks / 3.0;
        String grade;
        String remarks;

        // Standard grading logic
        if (percentage >= 90) { grade = "A"; remarks = "Excellent"; }
        else if (percentage >= 80) { grade = "B"; remarks = "Very Good"; }
        else if (percentage >= 70) { grade = "C"; remarks = "Good"; }
        else if (percentage >= 60) { grade = "D"; remarks = "Satisfactory"; }
        else { grade = "F"; remarks = "Needs Improvement"; }

        System.out.printf("Average Marks: %.2f%%\nGrade: %s\nRemarks: %s\n\n", percentage, grade, remarks);

        // === 4. Prime Number ===
        System.out.println("=== 4. Prime Number Checker ===");
        System.out.print("Enter a positive integer: ");
        int primeNum = scanner.nextInt();
        boolean isPrime = true;

        if (primeNum <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < primeNum; i++) {
                if (primeNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(primeNum + " is " + (isPrime ? "a Prime Number" : "not a Prime Number") + "\n");

        // === 5. Armstrong Number ===
        System.out.println("=== 5. Armstrong Number Checker ===");
        System.out.print("Enter a number to check for Armstrong: ");
        int armNum = scanner.nextInt();
        int originalArmNum = armNum;
        int sumArm = 0;

        while (originalArmNum != 0) {
            int digit = originalArmNum % 10;
            sumArm += (digit * digit * digit);
            originalArmNum /= 10;
        }

        if (sumArm == armNum) {
            System.out.println(armNum + " is an Armstrong Number.\n");
        } else {
            System.out.println(armNum + " is Not an Armstrong Number.\n");
        }

        // === 6. Count Digits ===
        System.out.println("=== 6. Count Digits in an Integer ===");
        System.out.print("Enter an integer: ");
        int digitNum = scanner.nextInt();
        int count = 0;
        int tempDigitNum = digitNum; // preserve original input

        // Handle the case where the user inputs 0 directly
        if (tempDigitNum == 0) {
            count = 1;
        } else {
            while (tempDigitNum != 0) {
                tempDigitNum /= 10; // Removes the last digit
                count++;
            }
        }
        System.out.println("The number of digits in " + digitNum + " is " + count + "\n");

        // === 7. BMI Calculator ===
        System.out.println("=== 7. BMI Calculator ===");
        System.out.print("Enter weight (in kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (in cm): ");
        double heightCm = scanner.nextDouble();

        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String bmiStatus;

        if (bmi < 18.5) bmiStatus = "Underweight";
        else if (bmi < 25.0) bmiStatus = "Normal weight";
        else if (bmi < 30.0) bmiStatus = "Overweight";
        else bmiStatus = "Obese";

        System.out.printf("Your BMI is %.2f. Status: %s\n\n", bmi, bmiStatus);

        // === 8. Harshad Number ===
        System.out.println("=== 8. Harshad Number Checker ===");
        System.out.print("Enter a number to check for Harshad: ");
        int harshadNum = scanner.nextInt();
        int sumH = 0;
        int tempHarshad = harshadNum;

        while (tempHarshad > 0) {
            sumH += tempHarshad % 10;
            tempHarshad /= 10;
        }

        if (harshadNum % sumH == 0) {
            System.out.println(harshadNum + " is a Harshad Number.\n");
        } else {
            System.out.println(harshadNum + " is Not a Harshad Number.\n");
        }

        // === 9. Abundant Number ===
        System.out.println("=== 9. Abundant Number Checker ===");
        System.out.print("Enter a number to check for Abundant: ");
        int abundantNum = scanner.nextInt();
        int sumA = 0;

        for (int i = 1; i < abundantNum; i++) {
            if (abundantNum % i == 0) {
                sumA += i;
            }
        }

        if (sumA > abundantNum) {
            System.out.println(abundantNum + " is an Abundant Number.\n");
        } else {
            System.out.println(abundantNum + " is Not an Abundant Number.\n");
        }

        // === 10. Switch...Case Calculator ===
        System.out.println("=== 10. Calculator (Switch Case) ===");
        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = scanner.next();

        double calcResult = 0;
        boolean validOp = true;

        switch (op) {
            case "+":
                calcResult = first + second;
                break;
            case "-":
                calcResult = first - second;
                break;
            case "*":
                calcResult = first * second;
                break;
            case "/":
                if (second != 0) {
                    calcResult = first / second;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    validOp = false;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                validOp = false;
        }

        if (validOp && (second != 0 || !op.equals("/"))) {
            System.out.printf("%.2f %s %.2f = %.2f\n\n", first, op, second, calcResult);
        }

        // === 11. Day of the Week ===
        System.out.println("=== 11. Day of the Week ===");
        System.out.println("Enter the date (Month Day Year as integers, e.g., 2 14 2024): ");
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int y = scanner.nextInt();

        // Standard Gregorian calendar math formula
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("The day of the week is: " + d0 + " (" + daysOfWeek[d0] + ")");

        scanner.close();
    }
}