import java.util.Scanner;
public class RunOfIntegers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Start:");
        int start = sc.nextInt();

        System.out.println("Enter End:");
        int end = sc.nextInt();
        end = end + 1;

        System.out.println("\n");

        while(start != end){
            System.out.println(start);
            start = start + 1;
            if (start == end){
                break;
            }
        }







        sc.close();
    }
}