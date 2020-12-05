import java.util.Scanner;
public class AverageAndStandard{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N: ");

        double sum = 0;
        double squaredSum = 0;
        int n = sc.nextInt();

        for (int i = 0; i <= (n - 1); i++){
            double input = sc.nextDouble();
            sum = sum + input;
            squaredSum = squaredSum + (input*input);
        }

        double avg = sum / n;
        double avg2 = avg * avg;
        double avgSquare = squaredSum / n;
        double sd = Math.sqrt(avgSquare - avg2);

        System.out.println("Average: " + avg);
        System.out.println("Standard Deviation: " + sd);



        sc.close();
    }
}