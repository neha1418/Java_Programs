package ForLoop;

import java.util.Scanner;

public class Task1_factorial {
    public static void main(String[] args) {
        System.out.println("Enter number for factorial:");
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int fact =1;
        if(n==0){
            System.out.println("Fact:"+fact);
        }
        else if (n<0) {
            System.out.println("Factorial not defined for negative numbers");
        }
        else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial is: " + fact);
        }
    }
}
