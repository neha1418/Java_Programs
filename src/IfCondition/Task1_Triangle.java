package IfCondition;

import java.util.Scanner;

public class Task1_Triangle {
    public static void main(String[] args) {
        int n1, n2, n3;
        System.out.println("Enter 3 sides of Triangle:");
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
            if (n1 == n2 && n2 == n3) {
                System.out.println("It's a equilateral triangle");
            } else if (n1 == n2 || n2 == n3 || n3 == n1) {
                System.out.println("It's a isosceles triangle");
            } else {
                System.out.println("It's a scalene triangle");
            }
        }
    }
