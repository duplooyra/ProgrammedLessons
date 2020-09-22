import java.util.Scanner;
public class CheckCharge{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Account Balance: ");
        double amt = sc.nextDouble();
        if (amt > 1000 || amt >1500){
            System.out.println("There is no service charge");
        }
        else{
            System.out.println("There is a $0.15 fee per check");
        }

        sc.close();



    }
}