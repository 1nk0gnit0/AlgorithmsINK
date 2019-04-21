package Five;

public class Power {
    public static void main(String[]args){
        int x = 2;
        int y = 4;
        System.out.print(x + "^" + y);
        System.out.println("=" + power(x,y));
    }

    public static int power(int x, int y){
        if (y == 0) return 1;
        if (y == 1) return x;
        return x*(power(x,y-1));
    }
}
