package Switch;

public class prac10_jdkgreater13 {
    public static void main(String[] args) {
        int item_Code = 006;
        switch (item_Code){
            case 001,002,003:
                System.out.println("Electronic");
            case 004,005,006:
                System.out.println("Mechanical");
        }
    }
}
