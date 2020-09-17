import java.util.Scanner;
public class AnnualApplianceCost{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    
        System.out.print("Enter cost per kilowatt-hour in cents: ");
        double costperkwh = sc.nextDouble();

        System.out.print("Enter kilowatt-hours used per year: ");
        int kwhperyear = sc.nextInt();

        double AnnCost = (costperkwh * kwhperyear)/100;
        System.out.println("Annual cost: " + AnnCost);

        sc.close();
    }
}