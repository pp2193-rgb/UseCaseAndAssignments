import java.util.Scanner;

public class Week3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // === 1. Divisible by 5 ===
        System.out.println("=== 1. Check Divisibility by 5 ===");
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        boolean isDivBy5 = (num1 % 5 == 0);
        System.out.printf("O/P => Is the number %d divisible by 5? %b\n\n", num1, isDivBy5);

        // === 2. First is Smallest of 3 ===
        System.out.println("=== 2. Check if First is Smallest ===");
        System.out.print("Enter number 1: ");
        int s1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int s2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int s3 = scanner.nextInt();
        boolean isFirstSmallest = (s1 < s2 && s1 < s3);
        System.out.printf("O/P => Is the first number the smallest? %b\n\n", isFirstSmallest);

        // === 3. Largest of 3 ===
        System.out.println("=== 3. Check Largest of Three ===");
        System.out.print("Enter number 1: ");
        int l1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int l2 = scanner.nextInt();
        System.out.print("Enter number 3: ");
        int l3 = scanner.nextInt();
        System.out.println("O/P => ");
        System.out.printf("Is the first number the largest? %b\n", (l1 > l2 && l1 > l3));
        System.out.printf("Is the second number the largest? %b\n", (l2 > l1 && l2 > l3));
        System.out.printf("Is the third number the largest? %b\n\n", (l3 > l1 && l3 > l2));

        // === 4. Sum of N Natural Numbers (Formula) ===
        System.out.println("=== 4. Sum of N Natural Numbers ===");
        System.out.print("Enter a number: ");
        int nNumber = scanner.nextInt();
        if (nNumber > 0) {
            int sumN = nNumber * (nNumber + 1) / 2;
            System.out.printf("O/P => The sum of %d natural numbers is %d\n\n", nNumber, sumN);
        } else {
            System.out.printf("O/P => The number %d is not a natural number\n\n", nNumber);
        }

        // === 5. Voting Eligibility ===
        System.out.println("=== 5. Voting Eligibility ===");
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.printf("O/P => The person's age is %d and can vote.\n\n", age);
        } else {
            System.out.printf("O/P => The person's age is %d and cannot vote.\n\n", age);
        }

        // === 6. Positive, Negative, or Zero ===
        System.out.println("=== 6. Positive, Negative, or Zero ===");
        System.out.print("Enter a number: ");
        int pnzNumber = scanner.nextInt();
        System.out.print("O/P => ");
        if (pnzNumber > 0) System.out.println("positive\n");
        else if (pnzNumber < 0) System.out.println("negative\n");
        else System.out.println("zero\n");

        // === 7. Spring Season ===
        System.out.println("=== 7. Spring Season ===");
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        boolean isSpring = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
        if (isSpring) {
            System.out.println("O/P => Its a Spring Season\n");
        } else {
            System.out.println("O/P => Not a Spring Season\n");
        }

        // === 8. Countdown Rocket Launch (while loop) ===
        System.out.println("=== 8. Rocket Launch Countdown (while loop) ===");
        System.out.print("Enter countdown start value: ");
        int counter = scanner.nextInt();
        System.out.println("O/P =>");
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!\n");

        // === 9. Countdown Rocket Launch (for loop) ===
        System.out.println("=== 9. Rocket Launch Countdown (for loop) ===");
        System.out.print("Enter countdown start value: ");
        int forCounter = scanner.nextInt();
        System.out.println("O/P =>");
        for (int i = forCounter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!\n");

        // === 10. Sum Until User Enters 0 (while loop) ===
        System.out.println("=== 10. Sum Until 0 ===");
        double total = 0.0;
        System.out.print("Enter a number (0 to stop): ");
        double userInput = scanner.nextDouble();
        while (userInput != 0) {
            total += userInput;
            System.out.print("Enter another number (0 to stop): ");
            userInput = scanner.nextDouble();
        }
        System.out.printf("O/P => Total Sum is: %.2f\n\n", total);

        // === 11. Sum Until 0 or Negative (while true + break) ===
        System.out.println("=== 11. Sum Until 0 or Negative ===");
        double totalPositive = 0.0;
        while (true) {
            System.out.print("Enter a number (<= 0 to stop): ");
            double inputBreak = scanner.nextDouble();
            if (inputBreak <= 0) {
                break;
            }
            totalPositive += inputBreak;
        }
        System.out.printf("O/P => Total Sum is: %.2f\n\n", totalPositive);

        // === 12. Sum of N Natural Numbers (Formula vs While Loop) ===
        System.out.println("=== 12. Sum of Natural Numbers: Formula vs While ===");
        System.out.print("Enter a natural number: ");
        int nWhile = scanner.nextInt();
        if (nWhile > 0) {
            int formulaSum = nWhile * (nWhile + 1) / 2;
            int whileSum = 0;
            int tempN = nWhile;
            while (tempN > 0) {
                whileSum += tempN;
                tempN--;
            }
            System.out.printf("O/P => Formula Result: %d | While Loop Result: %d\n", formulaSum, whileSum);
            System.out.println("Results match? " + (formulaSum == whileSum) + "\n");
        } else {
            System.out.println("O/P => Not a natural number.\n");
        }

        // === 13. Sum of N Natural Numbers (Formula vs For Loop) ===
        System.out.println("=== 13. Sum of Natural Numbers: Formula vs For ===");
        System.out.print("Enter a natural number: ");
        int nFor = scanner.nextInt();
        if (nFor > 0) {
            int formulaSumFor = nFor * (nFor + 1) / 2;
            int forSum = 0;
            for (int i = 1; i <= nFor; i++) {
                forSum += i;
            }
            System.out.printf("O/P => Formula Result: %d | For Loop Result: %d\n", formulaSumFor, forSum);
            System.out.println("Results match? " + (formulaSumFor == forSum) + "\n");
        } else {
            System.out.println("O/P => Not a natural number.\n");
        }

        // === 14. Factorial (while loop) ===
        System.out.println("=== 14. Factorial (while loop) ===");
        System.out.print("Enter a positive integer: ");
        int factNumWhile = scanner.nextInt();
        if (factNumWhile >= 0) {
            long factorialWhile = 1;
            int i = factNumWhile;
            while (i > 0) {
                factorialWhile *= i;
                i--;
            }
            System.out.printf("O/P => The factorial of %d is %d\n\n", factNumWhile, factorialWhile);
        } else {
            System.out.println("O/P => Please enter a positive integer.\n");
        }

        // === 15. Factorial (for loop) ===
        System.out.println("=== 15. Factorial (for loop) ===");
        System.out.print("Enter a positive integer: ");
        int factNumFor = scanner.nextInt();
        if (factNumFor >= 0) {
            long factorialFor = 1;
            for (int j = 1; j <= factNumFor; j++) {
                factorialFor *= j;
            }
            System.out.printf("O/P => The factorial of %d is %d\n\n", factNumFor, factorialFor);
        } else {
            System.out.println("O/P => Please enter a positive integer.\n");
        }

        scanner.close();
    }
}