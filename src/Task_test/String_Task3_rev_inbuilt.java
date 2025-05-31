package Task_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class String_Task3_rev_inbuilt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String: ");
        String s1= br.readLine();
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb.reverse());

        StringBuffer sa = new StringBuffer("Neha is coding");
        System.out.println(sa.reverse());
    }
}
