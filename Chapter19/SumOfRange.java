import java.util.Scanner;
public class SumOfRange{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Low:");
        int low = sc.nextInt();
        low = low - 1;

        System.out.println("High:");
        int high = sc.nextInt();

        int sum1 = (low*(low+1))/2;
        int sum2 = (high*(high+1))/2;
        int sum = sum2 - sum1;

        System.out.println("Sum: " + sum);
        

        sc.close();
    }
}