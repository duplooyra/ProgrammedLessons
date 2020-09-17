import java.util.Scanner;
public class LogBaseTwo{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number of seconds: ");
        double x = sc.nextDouble();
    
        double logbase = (Math.log(x)) / (Math.log(2));
        System.out.println("Base 2 log of " + x + " is " + logbase);

        sc.close();





    }
}