package Task_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class String_numOfwords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String: ");
        String s1 = br.readLine();
        StringBuffer sb = new StringBuffer(s1);
        int count =0;
        if (sb.isEmpty()){
            System.out.println("Enter a String");
        }
        if (sb.charAt(0)!=' '){
            count++;
            System.out.print("First Character of each words are: "+

                    sb.charAt(0));
        }
        for(int i=0; i<sb.length()-1;i++){
            if(sb.charAt(i) == ' '&& sb.charAt(i+1)!=' '){
                count++;
                System.out.print(sb.charAt(i+1));
            }
        }
        System.out.println("\nNo. of words in sentence is: "+count);

    }
}
