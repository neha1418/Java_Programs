package Task_test;

import java.util.Scanner;

public class StringTask1 {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner scanner = new Scanner(System.in);
        String s1= scanner.nextLine();
        String rev = "";
        for (int i=s1.length()-1;i>=0;i--){
            rev = rev+s1.charAt(i);
        }
        System.out.println("Reverse of String= "+rev);
    }
}
