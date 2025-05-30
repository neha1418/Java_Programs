package Task_test;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("Enter marks achieved by Student: ");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()){
            System.out.println("Enter Integer Value");
        }
        int marks = scanner.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade B");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade C");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade D");
        } else if (marks >= 0 && marks < 59) {
            System.out.println("Grade F");
        }else {
            System.out.println("Enter Value between 0-100");
        }
    }
}

