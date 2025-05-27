package Switch;

import java.util.Scanner;

public class prac2_switchwithoutbreak {
    public static void main(String[] args) {
        System.out.println("Enter number from 1 to 7");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Monday");

                case 2:
                    System.out.println("Tuesday");

                case 3:
                    System.out.println("Wednesday");

                case 4:
                    System.out.println("Thursday");

                case 5:
                    System.out.println("Friday");

                case 6:
                    System.out.println("Saturday");

                case 7:
                    System.out.println("Sunday");

                default:
                    System.out.println("You're entering wrong number");
            }
        }
        else{
            System.out.println("You're not entering Int");
        }
    }
}
