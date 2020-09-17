import java.util.Scanner;
public class HarmonicMean{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("X: ");
        int x = sc.nextInt();

        System.out.print("Y: ");
        int y = sc.nextInt();
        
        double hm = 2 / ((1.0/x) + (1.0/y));
        float am =  Math.round(hm);

        System.out.println("Arithmetic mean: " + am);
        System.out.println("Harmonic mean: " + hm);

        sc.close();





    }
}