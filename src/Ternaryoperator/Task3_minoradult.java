package Ternaryoperator;

public class Task3_minoradult {
    public static void main(String[] args) {
        int age = 65;
        String r = age>18?(age>=65?"Senior":"Adult"):"minor";
        System.out.println(r);
    }
}
