package ForLoop;

public class prac14_loopoddcont {
    public static void main(String[] args) {
        for(int i =1; i<=50;i++){
            if(i%2==0){
                continue;
            }
            System.out.println("odd number>"+i);
        }
    }
}
