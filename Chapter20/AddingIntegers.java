import java.util.Scanner;
public class AddingIntegers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many integers will be added?:");
        int total = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < total; i++){
            System.out.println("Enter an integer:");
            int scan = sc.nextInt();
            sum = sum + scan;
        }
        System.out.print("\n The sum is " + sum);
        

        sc.close();
    }
}