package Task_test;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class reverse_usingforLoopinCompiler {
    public static void main(String[] args) {
        System.out.println("Enter a number for reverse");
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt()){
            System.out.println("Enter a Integer Value");
        }
        int n = scanner.nextInt();
        int rev=0;
        int l = String.valueOf(n).length();
        System.out.println(l);
        for(int i=0;i<l;i++){
            int num=n%10;
            rev = rev*10+num;
            n = n/10;
        }
        System.out.println("Reverse of number: "+rev);
    }
}
