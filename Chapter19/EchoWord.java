import java.util.Scanner;
public class EchoWord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String inputString = sc.next();
        System.out.println("\n");

        for (int i = 0; i < inputString.length(); i++){
            System.out.println(inputString);
        }
       
        

        sc.close();
    }
}