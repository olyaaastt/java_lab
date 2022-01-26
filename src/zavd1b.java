public class zavd1b {
    private static double x;
    public static void main(String[] args) {
        double y2;
        x=4;
        while(x<=6) {
            if(x>=5)
                y2 = x + Math.log((x+1)/(x+2));
            else y2 = 2* Math.pow(x,5)+2*Math.pow(x,2);
            System.out.println("x = " + x + " y2 = " + y2);
            x += 0.35;
        }
    }
}
