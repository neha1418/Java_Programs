package Task_test;

import java.util.Scanner;

public class StringTask2_Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner scanner= new Scanner(System.in);
        String s1= scanner.nextLine();
        String rev="";
        for (int i= s1.length()-1; i>=0;i--){
            rev=rev+s1.charAt(i);
        }
        if (s1.equalsIgnoreCase(rev)){
            System.out.println("String is a Palindrome");
        }
        else {
            System.out.println("String is not a Palindrome");
        }
    }
}
