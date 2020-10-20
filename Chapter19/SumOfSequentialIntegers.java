import java.util.Scanner;
public class SumOfSequentialIntegers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = sc.nextInt();
        int fsum = (n*(n+1))/2;
        n = n + 1;
        int i = 0;
        int sum = 0;
         

        while (i != n){
            sum = sum + i;
            i = i + 1;
            if (i == n){
                break;
            }
        }
        System.out.println("Loop Sum: " + sum);
        System.out.println("Formula Sum: " + fsum);

        sc.close();
    }
}