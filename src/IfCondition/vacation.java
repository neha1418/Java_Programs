package IfCondition;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age>=25){
            System.out.println("You can Go Goa");
        }
        else
            System.out.println("You cannot go Goa");
    }
}

