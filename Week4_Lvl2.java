import java.util.Scanner;

public class Week4_Lvl2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 1. Odd and Even Numbers ===");
        System.out.print("Enter a positive integer: ");
        int nOddEven = scanner.nextInt();
        if (nOddEven > 0) {
            for (int i = 1; i <= nOddEven; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            System.out.println("Not a natural number.");
        }
        System.out.println();

        System.out.println("=== 2. Employee Bonus ===");
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter years of service: ");
        int years = scanner.nextInt();
        double bonus = 0;
        if (years > 5) {
            bonus = salary * 0.05;
        }
        System.out.printf("The bonus amount is: %.2f\n\n", bonus);

        System.out.println("=== 3. Multiplication Table (6 to 9) ===");
        System.out.print("Enter a number: ");
        int tableNum = scanner.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", tableNum, i, (tableNum * i));
        }
        System.out.println();


        System.out.println("=== 4. FizzBuzz (For Loop) ===");
        System.out.print("Enter a positive integer for FizzBuzz: ");
        int fizzBuzzNum = scanner.nextInt();
        if (fizzBuzzNum > 0) {
            for (int i = 1; i <= fizzBuzzNum; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }
        System.out.println();


        System.out.println("=== 5. FizzBuzz (While Loop) ===");
        System.out.print("Enter a positive integer for FizzBuzz: ");
        int fizzBuzzWhileNum = scanner.nextInt();
        if (fizzBuzzWhileNum > 0) {
            int i = 1;
            while (i <= fizzBuzzWhileNum) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        }
        System.out.println();


        System.out.println("=== 6. Youngest and Tallest Friends ===");
        System.out.print("Enter Amar's age and height (in cm): ");
        int ageAmar = scanner.nextInt();
        int heightAmar = scanner.nextInt();

        System.out.print("Enter Akbar's age and height (in cm): ");
        int ageAkbar = scanner.nextInt();
        int heightAkbar = scanner.nextInt();

        System.out.print("Enter Anthony's age and height (in cm): ");
        int ageAnthony = scanner.nextInt();
        int heightAnthony = scanner.nextInt();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        System.out.println("The youngest friend's age is: " + youngestAge);
        System.out.println("The tallest friend's height is: " + tallestHeight + " cm\n");


        System.out.println("=== 7. Factors (For Loop) ===");
        System.out.print("Enter a positive integer to find its factors: ");
        int factorNum = scanner.nextInt();
        if (factorNum > 0) {
            System.out.print("Factors of " + factorNum + " are: ");
            for (int i = 1; i < factorNum; i++) {
                if (factorNum % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n");
        }


        System.out.println("=== 8. Factors (While Loop) ===");
        System.out.print("Enter a positive integer to find its factors: ");
        int factorWhileNum = scanner.nextInt();
        if (factorWhileNum > 0) {
            System.out.print("Factors of " + factorWhileNum + " are: ");
            int counter = 1;
            while (counter < factorWhileNum) {
                if (factorWhileNum % counter == 0) {
                    System.out.print(counter + " ");
                }
                counter++;
            }
            System.out.println("\n");
        }

        System.out.println("=== 9. Greatest Factor Beside Itself (For Loop) ===");
        System.out.print("Enter a positive integer: ");
        int gfNum = scanner.nextInt();
        int greatestFactor = 1;
        for (int i = gfNum - 1; i >= 1; i--) {
            if (gfNum % i == 0) {
                greatestFactor = i;
                break; // Exit the loop as soon as we find the largest factor
            }
        }
        System.out.println("The greatest factor is: " + greatestFactor + "\n");


        System.out.println("=== 10. Greatest Factor Beside Itself (While Loop) ===");
        System.out.print("Enter a positive integer: ");
        int gfWhileNum = scanner.nextInt();
        int greatestFactorWhile = 1;
        int gfCounter = gfWhileNum - 1;
        while (gfCounter >= 1) {
            if (gfWhileNum % gfCounter == 0) {
                greatestFactorWhile = gfCounter;
                break;
            }
            gfCounter--;
        }
        System.out.println("The greatest factor is: " + greatestFactorWhile + "\n");


        System.out.println("=== 11. Multiples Below 100 (For Loop) ===");
        System.out.print("Enter a positive integer (less than 100): ");
        int multiNum = scanner.nextInt();
        if (multiNum > 0 && multiNum < 100) {
            System.out.println("Multiples of " + multiNum + " below 100 (in reverse):");
            for (int i = 100; i >= 1; i--) {
                if (i % multiNum == 0) {
                    System.out.print(i + " ");
                    continue; // Continue is redundant here but included as per hint
                }
            }
            System.out.println("\n");
        }

        System.out.println("=== 12. Power of a Number (For Loop) ===");
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        long result = 1; // using long to handle large numbers
        if (base > 0 && power > 0) {
            for (int i = 1; i <= power; i++) {
                result *= base;
            }
            System.out.println(base + " to the power of " + power + " is: " + result + "\n");
        }

        // === 13. Multiples Below 100 (While Loop) ===
        System.out.println("=== 13. Multiples Below 100 (While Loop) ===");
        System.out.print("Enter a positive integer (less than 100): ");
        int multiWhileNum = scanner.nextInt();
        if (multiWhileNum > 0 && multiWhileNum < 100) {
            System.out.println("Multiples of " + multiWhileNum + " below 100 (in reverse):");
            int mCounter = 100;
            while (mCounter >= 1) {
                if (mCounter % multiWhileNum == 0) {
                    System.out.print(mCounter + " ");
                }
                mCounter--;
            }
            System.out.println("\n");
        }

        // === 14. Power of a Number (While Loop) ===
        System.out.println("=== 14. Power of a Number (While Loop) ===");
        System.out.print("Enter the base number: ");
        int baseWhile = scanner.nextInt();
        System.out.print("Enter the power: ");
        int powerWhile = scanner.nextInt();
        long resultWhile = 1;
        int pCounter = 0;

        while (pCounter != powerWhile) {
            resultWhile *= baseWhile;
            pCounter++;
        }
        System.out.println(baseWhile + " to the power of " + powerWhile + " is: " + resultWhile + "\n");

        scanner.close();
        System.out.println("=== Level 2 Practice Completed! ===");
    }
}