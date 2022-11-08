public class Raizes {

    public double x1 (int b, int delta, int a){

        double x1 = (-b + Math.sqrt(delta) ) / (2 * a);

        return x1;
    }

    public double x2 (int b, int delta, int a){

        double x2 = (-b - Math.sqrt(delta) ) / (2 * a);

        return x2;
    }
}
