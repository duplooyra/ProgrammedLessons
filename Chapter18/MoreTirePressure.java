import java.util.Scanner;
public class MoreTirePressure{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Input right front pressure: ");
        double rf = sc.nextInt();
        if (rf < 35 || rf > 45){
            System.out.println("Warning: pressure is out of range");
        }
        System.out.println("Input right front pressure: ");
        double lf = sc.nextInt();
        if (lf < 35 || lf > 45){
            System.out.println("Warning: pressure is out of range");
        }
        System.out.println("Input right front pressure: ");
        double rr = sc.nextInt();
        if (rr < 35 || rr > 45){
            System.out.println("Warning: pressure is out of range");
        }
        System.out.println("Input right front pressure: ");
        double lr = sc.nextInt();
        if (lr < 35 || lr > 45){
            System.out.println("Warning: pressure is out of range");
        }

        if ((rf == lf) && (rr == lr)){
            System.out.println("Inflation is OK");
        }
        else{
            System.out.println("Uh oh poo poo");
        }
        

        sc.close();



    }
}