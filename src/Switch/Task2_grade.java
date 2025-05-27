package Switch;

import java.util.Scanner;

public class Task2_grade {
    public static void main(String[] args) {
        System.out.println("Enter Grade A to F: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        switch (grade) {
            case "A" -> System.out.println("Excellent");
            case "B" -> System.out.println("Very Good");
            case "C" -> System.out.println("Good");
            case "D" -> System.out.println("Need Improvement");
            case "F" -> System.out.println("Fail");
            default -> System.out.println("Invaild Grade");
        }
    }
}
