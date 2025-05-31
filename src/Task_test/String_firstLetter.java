package Task_test;

import java.util.Scanner;

public class String_firstLetter {
    public static void main(String[] args){
        System.out.println("Enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        if (s1.length() == 0) {
            System.out.print("Empty input.");
            return;
        }
        System.out.print(s1.charAt(0));

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==' '&& s1.charAt(i+1)!=' '){
                System.out.print(s1.charAt(i+1));
            }
        }
    }
}
