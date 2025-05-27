package Switch;

import java.util.Scanner;

public class Task1_leapyear {
    public static void main(String[] args) {
        System.out.println("Enter year");
        System.out.println("Enter month number from 1-12");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            Boolean is_leap=((year%4==0&&year%100!=0)||(year%100==0&&year%400==0));
            switch (month){
                case 1 -> System.out.println("January has 31 days");
                case 2-> System.out.println("Feb has "+(is_leap?"29 days":"28 days"));
                case 3-> System.out.println("March has 31 days");
                case 4->System.out.println("April has 30 days");
                case 5-> System.out.println("May has 31 days");
                case 6->System.out.println("June has 30 days");
                case 7->System.out.println("July has 31 days");
                case 8->System.out.println("August has 31 days");
                case 9->System.out.println("September has 30 days");
                case 10->System.out.println("October has 31 days");
                case 11-> System.out.println("November has 30 days");
                case 12->System.out.println("December has 31 days");
                default->System.out.println("Month value not within range");
            }
        }
        else {
            System.out.println("Value entered is not Integer");
        }
    }
}
