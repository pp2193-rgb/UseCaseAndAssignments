import java.util.Scanner;

public class UC1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks in Math: ");
        int math = scanner.nextInt();

        System.out.print("Enter marks in Science: ");
        int science = scanner.nextInt();

        System.out.print("Enter marks in English: ");
        int english = scanner.nextInt();

        int total = math + science + english;
        double average = total / 3.0;
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n----- Result -----");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}