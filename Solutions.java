public class Solutions {

    public static int max3(int a, int b, int c) {
        if(a > b && a > c) {
            return a;
        } else if(b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static double max3(double a, double b, double c) {
        if(a > b && a > c) {
            return a;
        } else if(b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static boolean odd(boolean a, boolean b, boolean c) {
        
    }


    public static void main(String[] args) {
        System.out.println(max3(4, 8, 3));
    }
}