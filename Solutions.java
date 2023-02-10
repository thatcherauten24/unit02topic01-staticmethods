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

    // BUG: odd(true, false, false) -> false
    public static boolean odd(boolean a, boolean b, boolean c) {
        int total = 0;
        if(a) {
            total = total + 1;
        }
        if(b) {
            total = total + 1;
        }
        if(c) {
            total = total + 1;
        } else {
            total = 0;
        }
        if(total % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean majority(boolean a, boolean b, boolean c) {
        
        return (a && b) || (b && c) || (a && c);
       
    }

    public static double trigIdentity(double x) {
        return ((Math.sin(x)) * (Math.sin(x)) + (Math.cos(x)) * (Math.cos(x)));
    }


    public static void main(String[] args) {
        System.out.println(majority(true, false, true));
    }
}