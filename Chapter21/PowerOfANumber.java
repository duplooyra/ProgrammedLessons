import java.util.Scanner;
public class PowerOfANumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X: ");
        float x = sc.nextFloat();
        float initial = x;

        System.out.print ("Enter N: ");
        int n = sc.nextInt();

        if (n >= 0){

            for (int i = 0; i <= (n-2); i++){
                x = (x*initial);
            }

            System.out.println(initial + " raised to the power " + n + " is: " + x);

        }
        
        else {
            System.out.println("N must be a positive integer.");
        }

        

        
        sc.close();
    }
}