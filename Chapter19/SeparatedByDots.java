import java.util.Scanner;
public class SeparatedByDots{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first word:");
        String first = sc.next();
        System.out.println("Enter second word:");
        String second = sc.next();

        int sum = first.length() + second.length();
        int dots = 30 - sum;

        System.out.print("\n");
        
        System.out.print(first);
        for(int i = 0; i < dots; i++){
            System.out.print(".");
        }
        System.out.print(second);
        
        

        
       
        

        sc.close();
    }
}