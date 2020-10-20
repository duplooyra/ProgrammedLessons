import java.util.Scanner;
public class HarmonicSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++){
            double x = 1.0/(i+1);
            sum = sum + x;
        }
        System.out.print("\nSum is: " + sum);
        

        sc.close();
    }
}