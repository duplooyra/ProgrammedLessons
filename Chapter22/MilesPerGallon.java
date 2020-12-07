import java.util.Scanner;
public class MilesPerGallon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Miles Per Gallon Program");

        System.out.print("Initial miles: ");
        int initialMiles = sc.nextInt();

        int x = 0;
        
        while (x != 1){
            if (initialMiles == -1){
                System.out.println("bye");
                x = 1;
            }
            else {
                System.out.print("Final miles: ");
                int finalMiles = sc.nextInt();
                
                System.out.print("Gallons: ");
                double gallons  = sc.nextDouble();
    
                double mpg = (finalMiles - initialMiles) / gallons;
                System.out.println("Miles per Gallon: " + mpg);
            }
        }
        
        sc.close();
    }
}