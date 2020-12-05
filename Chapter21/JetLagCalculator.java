import java.util.Scanner;
public class JetLagCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("# of hours of travel: ");
        double hours = sc.nextDouble();

        System.out.print("# of time zones crossed: ");
        int zonesCrossed = sc.nextInt();

        System.out.print("Departure time: ");
        double departTime = sc.nextDouble();

        System.out.print("Arrival time: ");
        double arriveTime = sc.nextDouble();

        int depart = 0;
        int arrive = 0;

        if (departTime >= 8 && departTime < 12){
            depart = 0;
        }
        else if (departTime >= 12 && departTime < 18){
            depart = 1;
        }
        else if (departTime >= 18 && departTime < 22){
            depart = 3;
        }
        else if (departTime >= 22 && departTime > 1){
            depart = 4;
        }
        else if (departTime >= 1 && departTime < 8){
            depart = 5;
        }

        if (arriveTime >= 8 && arriveTime < 12){
            arrive = 4;
        }
        else if (arriveTime >= 12 && arriveTime < 18){
            arrive = 2;
        }
        else if (arriveTime >= 18 && arriveTime < 22){
            arrive = 0;
        }
        else if (arriveTime >= 22 && arriveTime > 1){
            arrive = 1;
        }
        else if (arriveTime >= 1 && arriveTime < 8){
            arrive = 3;
        }
        
        double recovery = ((hours/2 + (zonesCrossed - 3) + depart + arrive) / 10);
        System.out.println("\nDays of recovery: " + recovery + " days");

        sc.close();
    }
}