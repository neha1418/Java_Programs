package String;

public class Prac7_String {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3= new String("hello");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1.concat(str3));
    }
}
