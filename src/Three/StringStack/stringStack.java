package Three.StringStack;

import Three.Stack.Stack;

public class stringStack {
    private String input;

    public stringStack(String in){
        this.input = in;
    }

    public  void check(){
        int size = input.length();
        Stack st = new Stack(size);
        for(int i = 0; i < size; i++){
            char ch = input.charAt(i);
            st.push(ch);
        }
        while (!st.isEmpty()){
            char n = st.pop();
            System.out.print(n);
        }
        System.out.println();
    }


}
