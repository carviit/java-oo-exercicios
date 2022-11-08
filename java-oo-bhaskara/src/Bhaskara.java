import java.util.Scanner;;

public class Bhaskara {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        Delta primeiroDelta = new Delta();

        Raizes raiz = new Raizes();

        System.out.print("\nDigite o valor de A: ");
        primeiroDelta.setA(input.nextInt());

        System.out.print("Digite o valor de B: ");
        primeiroDelta.setB(input.nextInt());

        System.out.print("Digite o valor de C: ");
        primeiroDelta.setC(input.nextInt());

        System.out.println("\nDELTA = " + primeiroDelta.delta(primeiroDelta.getA(), primeiroDelta.getB(), primeiroDelta.getC()));

        int delta  = primeiroDelta.delta(primeiroDelta.getA(), primeiroDelta.getB(), primeiroDelta.getC());

        System.out.println("\nRAIZ 1 = " + raiz.x1(primeiroDelta.getB(), delta, primeiroDelta.getA()));

        System.out.println("RAIZ 2 = " + raiz.x2(primeiroDelta.getB(), delta, primeiroDelta.getA()));

        input.close();
    
    }
}
