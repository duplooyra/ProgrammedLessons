import java.util.Scanner;
public class BrickDistance{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        double g = 32.174;
    
        System.out.print("Enter the number of seconds: ");
        double seconds = sc.nextDouble();

        double distance = (1/2.0) * g * (seconds*seconds);
        System.out.println("Distance: " + distance);

        sc.close();





    }
}