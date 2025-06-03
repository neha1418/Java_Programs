package String;

public class Prac10_String {
    public static void main(String[] args) {

        String s = "Java".substring(2);
        System.out.println(s);

        String s1 = "Java".substring(1,3);
        System.out.println(s1);

        String s2 = "   jave is good   ".trim();
        System.out.println(s2);

        boolean b = "".isBlank();
        System.out.println(b);

        boolean b1 = "Java".equalsIgnoreCase("jaVa");
        System.out.println(b1);

        char [] arr = "Java".toCharArray();
        System.out.println(arr);

        String s7 = String.format("%s=%d","age",25);
        System.out.println(s7);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);
    }


}
