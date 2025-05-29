package Function;

public class prac3_function {
    public static void main(String[] args) {
        non_return_type_func();
        String a = return_type_func();
    }
    static void non_return_type_func(){
        System.out.println("Hi");
    }
    static String return_type_func(){
        System.out.println("return type");
        return "Neha";
    }
}
