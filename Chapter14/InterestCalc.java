import java.util.Scanner;

public class InterestCalc{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("P: ");
        double P = sc.nextDouble();

        System.out.print("r: ");
        double r = sc.nextDouble();

        System.out.print("n: ");
        double n = sc.nextDouble();

        System.out.print("t: ");
        double t = sc.nextDouble();
        // V = P(1+r/n)^nt
        
        double val = (P*Math.pow(1.0+(r/n), (n*t)));
        val = Math.round(val*100.0)/100.0;
        System.out.print("Value: " + "$" + val);

        sc.close();
        
    }
}