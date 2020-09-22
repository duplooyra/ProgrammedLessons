import java.util.Scanner;

public class RuleOf72{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        double st = 72.0;

        System.out.print("Interest rate: ");
        double r = sc.nextDouble() * 100;

        double years = st/r;
        System.out.print("Years to double: " + years);

        
        
        
        sc.close();
        
    }
}