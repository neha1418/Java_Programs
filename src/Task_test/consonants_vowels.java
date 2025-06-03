package Task_test;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class consonants_vowels {
    public static void main(String[] args) {
        System.out.println("Enter a sentence");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s.length()==0){
            System.out.print("It is a empty String");
        }
        int counta=0;
        int countv=0;
        String s1= s.toLowerCase().trim();
        for(int i=0; i<s1.length();i++){
            char ch = s1.charAt(i);
            if(ch>='a'&& ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    countv++;
                }else{
                    counta++;
                }
            }

        }
        System.out.println("Number of vowels: "+countv+"\nNumber of consonants: "+counta);
    }
}