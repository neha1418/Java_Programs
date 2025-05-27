package Switch;

import java.util.Scanner;

public class prac3_switch {
    public static void main(String[] args) {
        System.out.println("Enter number from 1 to 7");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
        }
    }
}
