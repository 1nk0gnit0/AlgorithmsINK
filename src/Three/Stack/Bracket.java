package Three.Stack;

public class Bracket {

    private String input;
    public Bracket(String in){
        this.input = in;
    }

    public void check(){
        int size = input.length();
        Stack st = new Stack(size);

        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            switch (ch){
                case '[':
                case '{':
                case '(':
                    st.push(ch);
                    break;
                case ']':
                case '}':
                case ')':
                    if (!st.isEmpty()){
                        int chr = st.pop();
                        if ((ch == '}' && chr != '{') || (ch == ']' && chr != '[') || (ch == ')' && chr != '(')){
                            System.out.println("Ошибка в " + ch + " в " + (i+1));
                        }
                    }else{
                        System.out.println("Ошибка в " + ch + " в " + (i+1));
                    }
                    break;
                    default:
                        break;
            }
        }
        if(!st.isEmpty()){
            System.out.println("Ошибка: нет правой скобки");
        }
    }
}
