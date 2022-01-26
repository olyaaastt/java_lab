public class zavd1a {
    private static double x;
    public static void main(String[] args) {
        double y;
        x=-4;
        while(x<=4) {
            y = x + Math.sin(x*x+2*x+1);
            System.out.println("x = " + x + " y = " + y);
            x += 0.5;
        }
    }
}
