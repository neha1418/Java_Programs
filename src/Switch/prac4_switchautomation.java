package Switch;

import java.util.Locale;
import java.util.Scanner;

public class prac4_switchautomation {
    public static void main(String[] args) {
        System.out.println("Enter browser");
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch(browser){
            case "chrome":
                System.out.println("Chrome selected");
                System.out.println("executed TC1");
            break;
            case "edge":
                System.out.println("edge selected");
                System.out.println("Executed TC2");
            break;
            default:
                System.out.println("Entered incorrect browser");
        }
    }
}
