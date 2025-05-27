package Switch;

public class prac9_interview {
    public static void main(String[] args) {
        int itemCode = 001;
        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }
    }
}
//This is enhanced switch syntax (introduced in Java 14 as a standard feature), where each case is followed by a lambda-style arrow (->).
//
//In this form:
//
//Each case handles exactly one statement (or block).
//
//No fall-through is allowed, so break is unnecessary.
//
//It is safer and more readable because each case is isolated.