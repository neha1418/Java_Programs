package While;

import java.util.Scanner;

public class prac7_factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for factorial");
        int factorial = 1;

        if (!scanner.hasNextInt()){
            System.out.println("Enter a int");
        }
        int n = scanner.nextInt();
        if(n==0){
            System.out.println("Factorial= "+factorial);
        }
        if(n>Integer.MAX_VALUE){
            System.out.println("Value out of bound");
        }

        int i=1;
        while (i<=n){
            factorial=factorial*i;
            i++;
        }
        System.out.println("Factorial= "+factorial);
    }
}
