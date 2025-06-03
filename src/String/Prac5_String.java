package String;

public class Prac5_String {
    public static void main(String[] args) {
        String name = "Neha";
        name = name.toUpperCase();
        System.out.println(name);  //now name identifier in pool will have new value "NEHA" while
                                    // "neha" will be there in pool without identifier.
    }
}
