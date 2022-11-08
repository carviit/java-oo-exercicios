public class Delta {

    private int a, b, c;

    public int delta(int a, int b, int c){

        int delta = ((b*b) - (4 * a * c));

        return delta;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    

    
}
