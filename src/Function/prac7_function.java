package Function;

import java.util.Scanner;

public class prac7_function {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_div = div(a,b);
        int result_mod = mod(a,b);
        int result_mul = mult(a,b);

        System.out.println("sum= "+result_sum);
        System.out.println("Multiplication= "+result_mul);
        System.out.println("Subtraction= "+result_sub);
        System.out.println("Division= "+result_div);
        System.out.println("mod= "+result_mod);


    }
    static int readInt(Scanner scanner, String prompt) {
        System.out.print(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Enter an int only.");
            System.exit(0);
            return -1; // Unreachable, but required for compilation
        }
    }

    static int sum(int n1, int n2){
        int s = n1+n2;
        return s;

    }
    static int mult(int n1, int n2){
        int m = n1*n2;
        return m;
    }
    static int sub(int n1, int n2){
        int su = n1-n2;
        return su;
    }
    static int mod(int n1, int n2){
        int mo = n1%n2;
        return mo;
    }
    static int div(int n1, int n2){
        int di=n1/n2;
        return di;
    }
}
