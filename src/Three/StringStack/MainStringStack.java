package Three.StringStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainStringStack {
    public static void main(String[] args) throws IOException {
        String input;
        while (true){
            input = getString();
            if (input.equals("")) break;
            stringStack st = new stringStack(input);
            st.check();
        }
    }

    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
