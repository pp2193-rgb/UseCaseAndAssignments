import java.util.Scanner;

public class Week1 {
    public  static void question10(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you height in centimeters: ");
        double cm = input.nextDouble();
        double inch = cm*2.54;
        double feet = inch*12;
        System.out.printf("Your Height in cm is %f while in feet is %.2f and inches is %.2f" , cm, feet,inch);
    }
    public static void question7and8(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in kilometer:");
        double km = input.nextDouble();
        double miles = km*1.6;
        double volume1 = 4/3*3.14*Math.pow(km,3);
        double volume2 = 4/3*3.14*Math.pow(miles,3);
        System.out.printf("Volume in kilometers: %.2f", volume1);
        System.out.printf("Volume in miles: %.2f", volume2);
    }

    public static void question6and9() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the university fee: ");
        double fee = input.nextDouble();
        System.out.print("Enter the university discount: ");
        double discountPercent = input.nextDouble()/100;
        double discount = fee * discountPercent;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + (fee - discount));
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("The Pen per student is " + (14 / 3)
                + " and the remaining pen not distributed is " + (14 % 3));

        System.out.println("Harry's age is " + (2024 - 2000));

        System.out.println("Sams marks are given in the question");
        System.out.println("Sam's average mark in PCM is: "
                + (double)(96 + 94 + 95) / 3);

        System.out.print("Enter the distance in Kilometer: ");
        double km = input.nextDouble();
        System.out.println("Distance in miles is: " + (km * 0.62));

        System.out.println("Enter the Cost price: ");
        double costPrice = input.nextDouble();

        System.out.println("Enter the Selling price:");
        double sellingPrice = input.nextDouble();

        System.out.println("Profit is: " + (sellingPrice - costPrice));
        System.out.println("Profit percentage is: "
                + (((sellingPrice - costPrice) / costPrice) * 100));


        question6and9();
        question7and8();
        question10();
    }
}