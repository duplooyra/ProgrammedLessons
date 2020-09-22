import java.util.Scanner;
public class TirePressure{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Input right front pressure: ");
        double rf = sc.nextInt();
        System.out.println("Input right front pressure: ");
        double lf = sc.nextInt();
        System.out.println("Input right front pressure: ");
        double rr = sc.nextInt();
        System.out.println("Input right front pressure: ");
        double lr = sc.nextInt();

        if ((rf == lf) && (rr == lr)){
            System.out.println("Inflation is OK");
        }
        else{
            System.out.println("Uh oh poo poo");
        }
        

        sc.close();



    }
}