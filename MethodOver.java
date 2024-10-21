class MethodOver {
    double r;
    int a, b; 
    int c;

    public void area(int x, int y) {
        a = x; 
        b = y;
        System.out.println("Area of Rectangle = " + (a * b));
    }

    public void area(double w) {
        r = w;
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }

    public void area(int k) {
        c = k;
        System.out.println("Area of Square = " + (c * c));
    }

    public static void main(String args[]) {
        MethodOver g = new MethodOver();
        g.area(5, 6);
        g.area(5.5);
        g.area(7);
    }
}
