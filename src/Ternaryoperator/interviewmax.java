package Ternaryoperator;

public class interviewmax {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);

        int max = n1>n2?n1:n2;
        System.out.println(max);
    }
}
